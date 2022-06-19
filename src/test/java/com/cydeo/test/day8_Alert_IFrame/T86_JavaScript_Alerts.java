package com.cydeo.test.day8_Alert_IFrame;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T86_JavaScript_Alerts extends TestBase {

    @Test
    public void JS_Confirm_Alerts_Test(){
        //1.
            driver.get("http://practice.cydeo.com/javascript_alerts");

        //2.
            WebElement Btn_JSConfirmAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            Btn_JSConfirmAlert.click();

        //3. syntax for alert
            Alert alert = driver.switchTo().alert();

            alert.accept();

        //4. Verify
            WebElement resultText = driver.findElement(By.id("result"));

            Assert.assertEquals(resultText.getText(), "You clicked: Ok", "JS Confirmation FAIL");
    }

    @Test
    public void JS_Informational_Alerts_Test(){
        //1.
            driver.get("http://practice.cydeo.com/javascript_alerts");

        //2.
            WebElement Btn_JSInfoAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
            Btn_JSInfoAlert.click();

        //3. syntax for alert
            Alert alert = driver.switchTo().alert();

            alert.accept();

        //4. Verify
            WebElement resultText = driver.findElement(By.id("result"));

            Assert.assertEquals(resultText.getText(), "You successfully clicked an alert", "JS Informational FAIL");
    }

    @Test
    public void JS_Prompt_Alerts_Test(){
        //1.
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //2.
        WebElement Btn_JSPromptAlert = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        Btn_JSPromptAlert.click();

        //3. syntax for alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        alert.accept();

        //4. Verify
        WebElement resultText = driver.findElement(By.id("result"));

        Assert.assertEquals(resultText.getText(), "You entered: hello", "JS Prompt FAIL");
    }



}
