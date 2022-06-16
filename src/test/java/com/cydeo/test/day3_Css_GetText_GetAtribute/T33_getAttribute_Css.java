package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.NextBaseCRM.utilities.Driver;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T33_getAttribute_Css {

    /*
    T3_getAttribute_Css
            TC #3: NextBaseCRM, locators, getText(), getAttribute() practice

            1- Open a chrome browser
            2- Go to: https://login1.nextbasecrm.com/
            3- Verify “Log in” button text is as expected:
            Expected: Log In
     */

    public static void main(String[] args) {

        //1- Open a chrome browser
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        WebElement LoginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedBttnText = "Log In";

        String actualBttnText = LoginButton.getAttribute("value");

        if (actualBttnText.equals(expectedBttnText)) {
            System.out.println("Login Button Text Verification PASSED!");
        } else {
            System.out.println("Login Button Text Verification FAILED!");
        }

        //9. reporting about termination of the Testing
        System.out.println("------------------------------------------------------");
        System.out.println("Testing is complete!");
        System.out.println("======================================================");

        //10. Ext. quit()
        Driver.quit(driver);

    }
}
