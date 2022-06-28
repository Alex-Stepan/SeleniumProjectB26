package com.cydeo.test.day16_Actions_JSExecuter;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T16_Etsy_scrollDown {

    /**
     * TC : Etsy Scroll down test
     *
     *  1. Go to https://www.etsy.com
     *  2. Scroll down
     *  3. Generate random email and enter into subscribe box
     *  4. Click on Subscribe
     *  5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */

    @Test
    public void etsyScrlollDown_test(){

        //1. Go to https://www.etsy.com
            Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

        //2. Scroll down
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            //window.scrollBy(x, y)
            js.executeScript("window.scrollBy(0, 1000)");

        //3. Generate random email and enter into subscribe box
            WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));

            js.executeScript("arguments[0].scrollIntoView(true)", email);

            Faker faker = new Faker();
            email.sendKeys(faker.internet().emailAddress());

        //4. Click on Subscribe
            Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']")).click();


        //5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
//        String actMemo = Driver.getDriver().findElement().getText();
//        String expMemo = "Great! We've sent you an email to confirm your subscription.";
//
//        Assert.assertEquals(actMemo, expMemo, "Memo is not matching - FAIL");

        //close
        Driver.closeDriver();
    }



}
