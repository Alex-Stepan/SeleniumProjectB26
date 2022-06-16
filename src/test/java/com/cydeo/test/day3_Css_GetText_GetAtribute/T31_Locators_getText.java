package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.NextBaseCRM.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T31_Locators_getText {
    /*
    TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
            2- Go to: https://login1.nextbasecrm.com/
            3- Enter incorrect username: “incorrect”
            4- Enter incorrect password: “incorrect”
            5- Click to login button.
            6- Verify error message text is as expected:
            Expected: Incorrect login or password
     */

    public static void main(String[] args) throws InterruptedException {

        //1- Open a chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement usernameBox = driver.findElement(By.cssSelector("input[type='text']"));
        usernameBox.sendKeys("incorrect");
        Thread.sleep(2000);

        //4- Enter incorrect password: “incorrect”
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys("incorrect");
        Thread.sleep(2000);

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginButton.click();


        //6- Verify error message text is as expected:
        //            Expected: Incorrect login or password

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String exp_ErrorMexssage = "Incorrect login or password";

        String act_ErrorMessage = errorMessage.getText();

        if (act_ErrorMessage.equals(exp_ErrorMexssage)){
            System.out.println("Error Message Verification PASSED!");
        } else {
            System.out.println("Error Message Verification FAILED!");
        }



        //9. reporting about termination of the Testing
        System.out.println("------------------------------------------------------");
        System.out.println("Testing is complete!");
        System.out.println("======================================================");

        //10. Ext. quit()
        Driver.quit(driver);

    }

}
