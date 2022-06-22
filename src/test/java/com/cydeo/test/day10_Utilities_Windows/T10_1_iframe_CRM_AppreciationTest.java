package com.cydeo.test.day10_Utilities_Windows;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T10_1_iframe_CRM_AppreciationTest extends TestBase {

    /**
     * TC #1: Iframe Task
     *
     *  1- Open a chrome browser
     *  2- Go to: https://login2.nextbasecrm.com/
     *  3- Login Homepage ( Login with valid username and password)
     *  4- Click the MORE tab and select APPRECIATION
     *  5- Write an Appreciation message
     *  6- Click the SEND button
     *  7- Verify the Appreciation message is displayed on the feed
     */


    @Test
    public void sending_Appreciation_Message() throws InterruptedException {
        //2- Go to: https://login2.nextbasecrm.com/
            driver.get("https://login2.nextbasecrm.com/");

        //3- Login Homepage ( Login with valid username and password)
            CRM_Utilities.crm_Login(driver, "hr1@cydeo.com", "UserUser");
//            WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//                usernameBox.sendKeys("helpdesk30@cybertekschool.com");
//
//            WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//                passwordBox.sendKeys("UserUser");
//
//            WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
//                loginBtn.click();


        //4- Click the MORE tab and select APPRECIATION
            WebElement moreHeader = driver.findElement(By.xpath("//span[contains(@id, 'link-text')]"));
                moreHeader.click();

            WebElement appreciation = driver.findElement(By.xpath("(//span[.='Appreciation'])[2]"));
                appreciation.click();

        //5- Write an Appreciation message
            //5.1. switch to another iframe
                driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));

            //5.2. input the appreciation message inside this iframe
                WebElement messageBox = driver.findElement(By.xpath("//body[@contenteditable='true']"));
                    messageBox.sendKeys("Это полный Холодец!");

            //5.3. switch out to parent iframe
                driver.switchTo().parentFrame();

        //6- Click the SEND button
            WebElement sendBtn = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
                sendBtn.click();

        //7- Verify the Appreciation message is displayed on the feed
            WebElement feedText = driver.findElement(By.xpath("(//div[contains(@id, 'blog_post_body')])[1]"));

            Thread.sleep(2000);
            String actText = feedText.getText();
            String expText = "Это полный Холодец!";

            Assert.assertEquals(actText, expText, "appreciation text did not appear correctly");


    }

    /**
     * //switch to iframe based on id="mce_0_ifr"
     *             driver.switchTo().frame("mce_0_ifr");
     *
     * //switch to iframe based on locator
     *             driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
     *
     * //switch to iframe based on index, index starts from 0
     *             driver.switchTo().frame(0);
     *
     *
     *
     * driver.switchTo().parentFrame();
     * driver.switchTo().defaultContent();
     */

}
