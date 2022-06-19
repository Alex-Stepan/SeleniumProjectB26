package com.cydeo.test.day8_Alert_IFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T82_Multi_DropDown_Selection {

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
    public void Multi_DropDown_Selection_Test() throws InterruptedException {
        //identify the dropdown with multiple select options
            WebElement multiItemDrop = driver.findElement(By.name("Languages"));

        //wrap this element into Select object
            Select multiItemSelect = new Select(multiItemDrop);

        //check if this element has multi select option
            System.out.println(multiItemSelect.isMultiple());

        //select items
            multiItemSelect.selectByIndex(2);
            multiItemSelect.selectByValue("ruby");
            multiItemSelect.selectByVisibleText("Python");
            Thread.sleep(3000);

        //deselect items
            multiItemSelect.deselectByIndex(2);
            multiItemSelect.deselectByValue("ruby");
            multiItemSelect.deselectByVisibleText("Python");
                //or use
            multiItemSelect.deselectAll();
            Thread.sleep(3000);



    }

}
