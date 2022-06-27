package com.cydeo.test.day15_upload_action;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P15_JSExecuter extends TestBase {

    @Test
    public void scrolling_test() throws InterruptedException {
        driver.get("http://practice.cydeo.com/");

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click();"  , cydeoLink );
        Thread.sleep(3000);



    }


}
