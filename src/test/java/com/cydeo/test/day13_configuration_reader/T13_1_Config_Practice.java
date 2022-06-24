package com.cydeo.test.day13_configuration_reader;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T13_1_Config_Practice extends TestBase {
    /**
     * TC : CRM Login
     *
     *  1. Create new test and make set ups
     *  2. Go to : http://login1.nextbasecrm.com/
     *  3. Enter valid username
     *  4. Enter valid password
     *  5. Click to `Log In` button
     *  6. Verify title is as expected: Expected: Portal
     *
     *  USERNAME PASSWORD:
     *  helpdesk1@cybertekschool.com UserUser
     *  Helpdesk2@cybertekschool.com UserUser
     */

    @Test
    public void login_CRM_app(){

        //2. Go to : https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
            WebElement inputUsernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            inputUsernameBox.sendKeys("hr1@cydeo.com");

        //4. Enter valid password
            WebElement inputPasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            inputPasswordBox.sendKeys("UserUser");

        //5. Click to `Log In` button
            WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginBtn.click();

        //6. Verify title is as expected:
//            BrowserUtils.verifyTitle(driver, "Portal");

    }

            @Test
            public void login2_CRM_app(){

                //2. Go to : https://login1.nextbasecrm.com/
                    //driver.get("https://login1.nextbasecrm.com/");
                    driver.get(ConfigurationReader.getProperty("env"));

                //3. Enter valid username
                    WebElement inputUsernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
                    //inputUsernameBox.sendKeys("hr1@cydeo.com");
                    inputUsernameBox.sendKeys(ConfigurationReader.getProperty("username"));

                //4. Enter valid password
                    WebElement inputPasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
                    //inputPasswordBox.sendKeys("UserUser");
                    inputPasswordBox.sendKeys(ConfigurationReader.getProperty("password"));

                //5. Click to `Log In` button
                    WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
                    loginBtn.click();

                //6. Verify title is as expected:
//                    BrowserUtils.verifyTitle(driver, "Portal");

            }


}
