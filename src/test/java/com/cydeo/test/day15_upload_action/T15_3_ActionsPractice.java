package com.cydeo.test.day15_upload_action;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T15_3_ActionsPractice {

    /**
     * TC : Google hover over test
     *
     *  1. Go to https://www.google.com
     *  2. Hover over on Search button
     *  3. Hover over on Feeling Lucky button
     */


    @Test
    public void hoverOver_test() throws InterruptedException {

        //1. Go to https://www.google.com
            Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        //2. Hover over on Search button
            Actions actions = new Actions(Driver.getDriver());

            WebElement searchBtn = Driver.getDriver()
                    .findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));

            actions.moveToElement(searchBtn).perform();
            Thread.sleep(3000);

        //3. Hover over on Feeling Lucky button
            WebElement feelingLuckyBtn = Driver.getDriver()
                    .findElement(By.xpath("//input[@id='gbqfbb']"));

            actions.moveToElement(feelingLuckyBtn).perform();
            Thread.sleep(3000);

        //close
            Driver.closeDriver();
    }
}
