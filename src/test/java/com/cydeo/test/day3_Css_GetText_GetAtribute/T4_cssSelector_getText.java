package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.NextBaseCRM.utilities.Driver;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    /*
    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        3- Verify “Reset password” button text is as expected:
        Expected: Reset password
     */
    public static void main(String[] args) {
        //1.
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2.
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3.
        WebElement ResPaswButtn = driver.findElement(By.cssSelector("button.login-btn"));
//        WebElement ResPaswButtn = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String expResBtnText = "Reset password";
        String actResBtnText = ResPaswButtn.getText();

        if (actResBtnText.equals(expResBtnText)) {
            System.out.println("The \"Ressed Password\" text on the Buuton is PRESENT!");
        } else {
            System.out.println("The \"Ressed Password\" text on the Buuton is NOT PRESENT!");

        }

        //9. reporting about termination of the Testing
        System.out.println("------------------------------------------------------");
        System.out.println("Testing is complete!");
        System.out.println("======================================================");

        //10. Ext. quit()
        Driver.quit(driver);

    }

}
