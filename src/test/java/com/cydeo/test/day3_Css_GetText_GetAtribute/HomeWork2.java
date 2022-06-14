package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork2 {
    /*
    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
            1- Open a chrome browser
            2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
            3- Enter incorrect username into login box:
            4- Click to `Reset password` button
            5- Verify “error” label is as expected
            Expected: Login or E-mail not found

            PS: Inspect and decide which locator you should be using to locate web
            elements.
            PS2: Pay attention to where to get the text of this button from
     */

    public static void main(String[] args) {
        //1- Open a chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
            driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
            WebElement loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
            loginBox.sendKeys("incorrect");

        //4- Click to `Reset password` button
            WebElement resetBtn = driver.findElement(By.cssSelector("button.login-btn"));
            resetBtn.click();

        //5- Verify “error” label is as expected
            //  Expected: Login or E-mail not found

            WebElement errorText = driver.findElement(By.cssSelector("div.errortext"));
            String actErrText = errorText.getText();
            System.out.println(actErrText);

            String expErrText ="Login or E-mail not found";

            if (actErrText.equals(expErrText)) {
                System.out.println("The label: \"Login or E-mail not found\" is PRESENT");
            } else {
                System.out.println("The label: \"Login or E-mail not found\" is NOT PRESENT!");
            }

        // quit()
            System.out.println("------------------------------------------------------------------");
            driver.quit();
    }
}
