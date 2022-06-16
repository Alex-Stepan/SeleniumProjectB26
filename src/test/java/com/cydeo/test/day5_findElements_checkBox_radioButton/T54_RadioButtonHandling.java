package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T54_RadioButtonHandling {

    /**
     * TC #2: Radiobutton handling
     *  1. Open Chrome browser
     *  2. Go to https://practice.cydeo.com/radio_buttons
     *  3. Click to “Hockey” radio button
     *  4. Verify “Hockey” radio button is selected after clicking.
     *      USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */

    public static void main(String[] args) {

        //1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
            driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button, USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
            WebElement BasketballRB = driver.findElement(By.xpath("//input[@id='basketball']"));
            System.out.println("BasketballRB.isDisplayed() = " + BasketballRB.isDisplayed());
            BasketballRB.click();
            System.out.println("BasketballRB.isSelected() = " + BasketballRB.isSelected());

            WebElement FootballRB = driver.findElement(By.xpath("//input[@id='football']"));
            System.out.println("FootballRB.isDisplayed() = " + FootballRB.isDisplayed());
            FootballRB.click();
            System.out.println("FootballRB.isSelected() = " + FootballRB.isSelected());

            WebElement HockeyRB = driver.findElement(By.xpath("//input[@id='hockey']"));
            System.out.println("HockeyRB.isDisplayed() = " + HockeyRB.isDisplayed());
            HockeyRB.click();
            System.out.println("HockeyRB.isSelected() = " + HockeyRB.isSelected());

            WebElement WaterPoloRB = driver.findElement(By.xpath("//input[@id='water_polo']"));
            System.out.println("WaterPoloRB.isDisplayed() = " + WaterPoloRB.isDisplayed());
            WaterPoloRB.click();
            System.out.println("WaterPoloRB.isSelected() = " + WaterPoloRB.isSelected());

        //4. Verify “Hockey” radio button is selected after clicking.
            System.out.println();
            HockeyRB.click();
            System.out.println("HockeyRB.isSelected() = " + HockeyRB.isSelected());
            System.out.println("BasketballRB.isSelected() = " + BasketballRB.isSelected());
            System.out.println("FootballRB.isSelected() = " + FootballRB.isSelected());
            System.out.println("WaterPoloRB.isSelected() = " + WaterPoloRB.isSelected());


        //last
            driver.quit();

            /*
                BasketballRB.isDisplayed() = true
                BasketballRB.isSelected() = true
                FootballRB.isDisplayed() = true
                FootballRB.isSelected() = true
                HockeyRB.isDisplayed() = true
                HockeyRB.isSelected() = true
                WaterPoloRB.isDisplayed() = true
                WaterPoloRB.isSelected() = true

                HockeyRB.isSelected() = true
                BasketballRB.isSelected() = false
                FootballRB.isSelected() = false
                WaterPoloRB.isSelected() = false
             */

    }
}
