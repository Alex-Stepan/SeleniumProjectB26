package com.cydeo.test.day8_Alerts;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T83_Locating_Dropdown {

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
    public void locatingDropdown(){
        //identify the select element
            WebElement dropdownElm = driver.findElement(By.id("dropdown") );

        //wrap this element inside the Select object
            Select selectObj = new Select(dropdownElm);

        //use ready methods to select option
            selectObj.selectByIndex(2);
            selectObj.selectByValue("2");
            selectObj.selectByVisibleText("Option 2");

        //verify determined option is selected
            String actOpt = selectObj.getFirstSelectedOption().getText();
            String expOpt = "Option 2";

            Assert.assertEquals(actOpt,expOpt, "Locating DropDown FAIL");


    }
}
