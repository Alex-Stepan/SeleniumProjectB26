package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork4 {

    /**
     * TC: Etsy checkbox and radio button
     *  1. Go to https://www.etsy.com
     *  2. Search for “wooden spoon”
     *  3. Click on filters
     *  4. Select free shipping, on sale
     *  5. Select under $25 Click on apply filters
     *  6. Print count of results
     */


    @Test
    public void Homework4() throws InterruptedException {

        //
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //2. Search for “wooden spoon”
            //WebElement SearchBox = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
            WebElement SearchBox_2 = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
                SearchBox_2.sendKeys("wooden spoon");

            WebElement SearchBtn = driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']"));
                SearchBtn.click();

        //3. Click on filters
            WebElement SearchFilterButton = driver.findElement(By.xpath("//button[@id='search-filter-button']"));
                SearchFilterButton.click();

        //4. Select free shipping, on sale
            WebElement FreeShippingSelection = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
                FreeShippingSelection.click();
                System.out.println("FreeShippingSelection.isDisplayed() = " + FreeShippingSelection.isDisplayed());

            WebElement OnSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
                OnSale.click();
                System.out.println("OnSale.isDisplayed() = " + OnSale.isDisplayed());

        //5. Select under $25 Click on apply filters
            WebElement FilterPriceUnder25 = driver.findElement(By.cssSelector( "label[for='price-input-1']" ));
                FilterPriceUnder25.click();
                System.out.println("FilterPriceUnder25.isDisplayed() = " + FilterPriceUnder25.isDisplayed());

            Thread.sleep(5000);

            WebElement FilterApplyButton = driver.findElement(By.xpath("//button[@aria-label='Apply']"));
                    FilterApplyButton.click();

        //6. Print count of results
            WebElement ResultsInfo = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']/span"));
                System.out.println("ResultsInfo.getText() = " + ResultsInfo.getText());

        //
            driver.quit();


    }

}
