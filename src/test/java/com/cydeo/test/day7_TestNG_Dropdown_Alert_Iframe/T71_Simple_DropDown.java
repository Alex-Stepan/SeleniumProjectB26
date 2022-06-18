package com.cydeo.test.day7_TestNG_Dropdown_Alert_Iframe;

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

public class T71_Simple_DropDown {

    /**
     * TC #1: Verifying “Simple dropdown” and “State selection” dropdown default values
     *  1. Open Chrome browser
     *  2. Go to https://practice.cydeo.com/dropdown
     *  3. Verify “Simple dropdown” default selected value is correct
     *      Expected: “Please select an option”
     *  4. Verify “State selection” default selected value is correct
     *      Expected: “Select a State”
     */

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



    @Test
    public void dropDownTest(){
        //3. Verify “Simple dropdown” default selected value is correct
        //     Expected: “Please select an option”
            WebElement simpleDrDwElm = driver.findElement(By.xpath("//select[@id='dropdown']"));

            // create select object
            Select simpleDropdown = new Select(simpleDrDwElm);

            String act_Default_SimpleDropD = simpleDropdown.getFirstSelectedOption().getText();
            String exp_Default_SimpleDropD = "Please select an option";

        Assert.assertEquals(act_Default_SimpleDropD, exp_Default_SimpleDropD, "dropDownTest / Simple dropdown - FAIL");


        //4. Verify “State selection” default selected value is correct
        //     Expected: “Select a State”
            WebElement selectStateElm = driver.findElement(By.xpath("//select[@id='state']"));

            //create select object
            Select selectState = new Select(selectStateElm);

            String act_Default_StateSelect = selectState.getFirstSelectedOption().getText();
            String exp_Default_StateSelect = "Select a State";

            Assert.assertEquals(act_Default_StateSelect,exp_Default_StateSelect,"dropDownTest / State select - FAIL");
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}
