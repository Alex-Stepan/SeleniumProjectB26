package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T61_StaleExceptionElement {

    /**
     * TC #1: StaleElementReferenceException handling
     *
     *  1. Open Chrome browser
     *  2. Go to https://practice.cydeo.com/add_remove_elements/
     *  3. Click to “Add Element” button
     *  4. Verify “Delete” button is displayed after clicking.
     *  5. Click to “Delete” button.
     *  6. Verify “Delete” button is NOT displayed after clicking.
     *      USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */

    public static void main(String[] args) {

        //1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
            driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
//            WebElement AddElementBtn = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
//            System.out.println("AddElementBtn.isDisplayed() = " + AddElementBtn.isDisplayed());
//
//            WebElement AddElementBtn_2 = driver.findElement(By.xpath("//div[@id='content']//button"));
//            System.out.println("AddElementBtn_2.isDisplayed() = " + AddElementBtn_2.isDisplayed());

            WebElement AddElementBtn_3 = driver.findElement(By.xpath("//button[.='Add Element']"));
            System.out.println("AddElementBtn_3.isDisplayed() = " + AddElementBtn_3.isDisplayed());

            AddElementBtn_3.click();

        //4. Verify “Delete” button is displayed after clicking.

            System.out.println("Before clicking the DELETE button:");

            WebElement DeleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));
            System.out.println("DeleteBtn.isDisplayed() = " + DeleteBtn.isDisplayed());
//            WebElement DeleteBtn_2 = driver.findElement(By.cssSelector("button[class='added-manually']"));
//            System.out.println(DeleteBtn_2.isDisplayed());

        //5. Click to “Delete” button.
            DeleteBtn.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
//        System.out.println("After clicking the DELETE button:");

                try {

                    System.out.println("After clicking, the DELETE button:" + DeleteBtn.isDisplayed());

                } catch (StaleElementReferenceException e) {
                    System.out.println("StaleElementException is thrown");
                    System.out.println("This means: web Element is completely  deleted from the page and html");

                }

        //last
            driver.quit();

                /*
                AddElementBtn_3.isDisplayed() = true
                Before clicking the DELETE button:
                DeleteBtn.isDisplayed() = true
                StaleElementException is thrown
                This means: web Element is completely  deleted from the page and html
                 */

    }


}
