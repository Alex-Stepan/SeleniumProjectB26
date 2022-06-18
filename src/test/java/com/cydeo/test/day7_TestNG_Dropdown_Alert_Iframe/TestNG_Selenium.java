package com.cydeo.test.day7_TestNG_Dropdown_Alert_Iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    /** Webdriver Globally */
    WebDriver driver;

    /** -------------------------------------------------*/


    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



    @Test
    public void googleTitle(){
        //2.
        driver.get("https://google.com");

        //3. Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, "Test Google Title FAIL");
    }


    @Test
    public void yahooTitle(){
        driver.get("https://www.yahoo.com/");
    }



    @Test
    public void etsyTitle(){
        driver.get("https://www.etsy.com/");
    }


}
