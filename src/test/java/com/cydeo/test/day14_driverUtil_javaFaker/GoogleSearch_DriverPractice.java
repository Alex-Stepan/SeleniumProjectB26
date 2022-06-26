package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {

    @Test
    public void google_search_driver_practice_test(){

        //1. go to "https://www.google.com/"
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        //2. write "apple" in search box
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        searchBox.sendKeys("apple" + Keys.ENTER);

        //3.verify title.  Expected: "apple - Google Search"
        String actTitle = Driver.getDriver().getTitle();
        String expTitle = "apple - Google Search";

        Assert.assertEquals(actTitle, expTitle, "Title does not matching - FAIL");

    }


}
