package com.cydeo.test.day8_Alert_IFrame;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T81_Alert_Practice extends TestBase {

    @Test
    public void AlertPractice_Test(){
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //Click for JS Alert
            WebElement Btn_JsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
            Btn_JsAlert.click();

        //needed object for Alerts
            Alert alert = driver.switchTo().alert();

            alert.accept();

            WebElement resultText = driver.findElement(By.id("result"));

            System.out.println("resultText.isDisplayed() = " + resultText.isDisplayed());

    }





}
