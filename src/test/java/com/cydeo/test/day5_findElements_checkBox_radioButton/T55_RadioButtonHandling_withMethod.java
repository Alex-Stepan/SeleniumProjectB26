package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T55_RadioButtonHandling_withMethod {

    /**
     * TC #3: Utility method task for (continuation of Task2)
     *  1. Open Chrome browser
     *  2. Go to https://practice.cydeo.com/radio_buttons
     *  3. Click to “Hockey” radio button
     *  4. Verify “Hockey” radio button is selected after clicking.
     *      USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     *
     *      Create a utility method to handle above logic.
     *          Method name: clickAndVerifyRadioButton
     *          Return type: void or boolean
     *              Method args:
     *              1. WebDriver
     *              2. Name attribute as String (for providing which group of radio buttons)
     *              3. Id attribute as String (for providing which radio button to be clicked)
     *          Method should loop through the given group of radio buttons. When it finds the
     *          matching option, it should click and verify option is Selected.
     *          Print out verification: true
     */

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
            driver.get("https://practice.cydeo.com/radio_buttons");


        //3. Create a utility method to handle above logic.
            selectEachSportRadioBttn(driver);

            //last
            driver.quit();




    }

        private static void selectEachSportRadioBttn(WebDriver driver) throws InterruptedException {
                List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));
                for (WebElement each : sportRadioBtns) {
                    Thread.sleep(3000);
                    each.click();
                }
        }

        //Create a utility method to handle above logic.
    //     *          Method name: clickAndVerifyRadioButton
    //     *          Return type: void or boolean
    //     *              Method args:
    //     *              1. WebDriver
    //     *              2. Name attribute as String (for providing which group of radio buttons)
    //     *              3. Id attribute as String (for providing which radio button to be clicked)
    //     *          Method should loop through the given group of radio buttons. When it finds the
    //     *          matching option, it should click and verify option is Selected.
    //     *          Print out verification: true




}
