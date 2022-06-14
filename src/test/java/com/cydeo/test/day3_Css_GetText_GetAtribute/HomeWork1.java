package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork1 {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
            1- Open a chrome browser
            2- Go to: https://login1.nextbasecrm.com/
            3- Verify “remember me” label text is as expected:
            Expected: Remember me on this computer
            4- Verify “forgot password” link text is as expected:
            Expected: Forgot your password?
            5- Verify “forgot password” href attribute’s value contains expected:
            Expected: forgot_password=yes

            PS: Inspect and decide which locator you should be using to locate web
            elements.
     */

    public static void main(String[] args) {
        //1- Open a chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
            //  Expected: Remember me on this computer
            WebElement labelRemembrMe = driver.findElement(By.cssSelector("label.login-item-checkbox-label"));
            String actRemembrMe = labelRemembrMe.getText();

            String expRemembrMe = "Remember me on this computer";

            if (actRemembrMe.equals(expRemembrMe)){
                System.out.println("The label \"Remember me on this computer\" presence PASSED!");
            } else {
                System.out.println("The label \"Remember me on this computer\" presence FAILED!");
            }

        //4- Verify “forgot password” link text is as expected:
            //  Expected: Forgot your password?
            WebElement linkForgotPsw = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
            String actForgtPsw = linkForgotPsw.getText();

            String expForgtPsw = "Forgot your password?";

            if (actForgtPsw.equals(expForgtPsw)){
                System.out.println("The presence of the link: Forgot your password, PASSED!");
            } else {
                System.out.println("The presence of the link: Forgot your password, FAILED!");
            }

        //5- Verify “forgot password” href attribute’s value contains expected:
            //  Expected: forgot_password=yes
            String expAtrbFrgtPsw = "forgot_password=yes";

            WebElement atrbFrgtPsw = driver.findElement(By.cssSelector("a[href=\"/?forgot_password=yes\"]"));
            String actAtrbFrgtPsw = atrbFrgtPsw.getAttribute("href");
                System.out.println(actAtrbFrgtPsw);


            if (actAtrbFrgtPsw.equalsIgnoreCase(expAtrbFrgtPsw)){
                System.out.println("\"forgot password\" href attribute’s value PASSED!");
            } else {
                System.out.println("\"forgot password\" href attribute’s value FAILED!");
            }

        // quit()
        System.out.println("------------------------------------------------------------------");
            driver.quit();

    }
}
