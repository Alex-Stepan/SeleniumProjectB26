package com.cydeo.test.day7_TestNG_Dropdown_Alert;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T74_Alert_Practice {

    /**
     * TC #1: Information alert practice
     *  1. Open browser
     *  2. Go to website: http://practice.cydeo.com/javascript_alerts
     *  @Test:
     *  3. Click to “Click for JS Alert” button
     *  4. Click to OK button from the alert
     *  5. Verify “You successfully clicked an alert” text is displayed.
     */

     /**
     * TC #2: Confirmation alert practice
     *  1. Open browser
     *  2. Go to website: http://practice.cydeo.com/javascript_alerts
     *  @Test:
     *  3. Click to “Click for JS Confirm” button
     *  4. Click to OK button from the alert
     *  5. Verify “You clicked: Ok” text is displayed.
     */

     /**
     * TC #3: Information alert practice
     *  1. Open browser
     *  2. Go to website: http://practice.cydeo.com/javascript_alerts
     *  @Test:
     *  3. Click to “Click for JS Prompt” button
     *  4. Send “hello” text to alert
     *  5. Click to OK button from the alert
     *  6. Verify “You entered: hello” text is displayed.
     */


     // Integrate a global Webdriver
     WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


    @Test (priority = 1)
    public void information_Alert_Test() throws InterruptedException {
        //3. Click to “Click for JS Confirm” button
            WebElement JSAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
            JSAlertBtn.click();

        //4. Click to OK button from the alert
            //syntax for alert
            Alert alert = driver.switchTo().alert();

            alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
            WebElement ResultText = driver.findElement(By.xpath("//p[@id='result']"));

            Assert.assertTrue(ResultText.isDisplayed());

            String act_ResultText = ResultText.getText();
            String exp_ResultText = "You successfully clicked an alert";

            Assert.assertEquals(act_ResultText, exp_ResultText, "Information Alert / Result Text - FAIL");
            Thread.sleep(3000);
    }


    @Test (priority = 2)
    public void confirmation_Alert_Test() throws InterruptedException {
        //3. Click to “Click for JS Confirm” button
            WebElement JsConfirmAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            JsConfirmAlertBtn.click();

        //4. Click to OK button from the alert
            //syntax for alert
            Alert alert = driver.switchTo().alert();

            alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
            WebElement ResultText = driver.findElement(By.xpath("//p[@id='result']"));

            Assert.assertTrue(ResultText.isDisplayed());

            String act_ResultText = ResultText.getText();
            String exp_ResultText = "You clicked: Ok";

            Assert.assertEquals(act_ResultText, exp_ResultText, "Confirmation Alert / Result Text - FAIL");
            Thread.sleep(3000);
    }


    @Test (priority = 3)
    public void prompt_Alert_Test() throws InterruptedException {
        //3. Click to “Click for JS Prompt” button
        WebElement JsPromptAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JsPromptAlertBtn.click();

        //4. Send “hello” text to alert
            //syntax for alert
            Alert alert = driver.switchTo().alert();

            alert.sendKeys("hello");

        //5. Click to OK button from the alert
            alert.accept();

        //6. Verify “You entered: hello” text is displayed.
            WebElement ResultText = driver.findElement(By.xpath("//p[@id='result']"));

            Assert.assertTrue(ResultText.isDisplayed());

            String act_ResultText = ResultText.getText();
            String exp_ResultText = "You entered: hello";

            Assert.assertEquals(act_ResultText, exp_ResultText, "Prompt Alert / Result Text - FAIL");
            Thread.sleep(3000);
    }


}
