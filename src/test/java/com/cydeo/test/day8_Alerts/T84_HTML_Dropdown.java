package com.cydeo.test.day8_Alerts;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T84_HTML_Dropdown {


    // Integrate a global Webdriver
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
            driver.get("https://practice.cydeo.com/dropdown");
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void HtmlDropdown_Test(){
        //Click to open dropdown which has no select tag
            WebElement dropdownLink = driver.findElement(By.id("dropdownMenuLink"));
            dropdownLink.click();

        //click item (link) with text Yahoo
            WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
            itemYahoo.click();

    }



}
