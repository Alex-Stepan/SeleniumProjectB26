package com.cydeo.test.day7_TestNG_Dropdown_Alert_Iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork5 {

    /**
     * TC : Selecting date on dropdown and verifying
     *  1. Open Chrome browser
     *  2. Go to https://practice.cydeo.com/dropdown
     *  3. Select “December 1, 1923” and verify it is selected.
     *      Select year using : visible text
     *      Select month using : value attribute
     *      Select day using : index number
     */


    // Integrate a global Webdriver
        WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @Test
    public void Selecting_Date_On_Dropdown() throws InterruptedException {
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1, 1923” and verify it is selected.
            Thread.sleep(1000);

            Select years = new Select(driver.findElement(By.xpath("//select[@id='year']")));
                years.selectByValue("1923");
                Thread.sleep(1000);

            Select months = new Select(driver.findElement(By.xpath("//select[@id='month']")));
                months.selectByVisibleText("December");
                Thread.sleep(1000);

            Select days = new Select(driver.findElement(By.xpath("//select[@id='day']")));
                days.selectByIndex(0);
                Thread.sleep(1000);


        Assert.assertEquals(years.getFirstSelectedOption().getText(), "1923", "years - FAIL");
        Assert.assertEquals(months.getFirstSelectedOption().getText(),"December", "months - FAIL");
        Assert.assertEquals(days.getFirstSelectedOption().getText(),"1", "days - FAIL");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
