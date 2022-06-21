package com.cydeo.test.day7_TestNG_Dropdown_Alert;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T72_State_Dropdown {

    /**
     * TC #2: Selecting state from State dropdown and verifying result
     *  1. Open Chrome browser
     *  2. Go to http://practice.cybertekschool.com/dropdown
     *  3. Select Illinois
     *  4. Select Virginia
     *  5. Select California
     *  6. Verify final selected option is California.
     *      Use all Select options. (visible text, value, index)
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

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void select_State_Test() throws InterruptedException {
        //create select object
            Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois //     Use all Select options. (value)
            Thread.sleep(2000);
            stateDropDown.selectByValue("IL");

        //4. Select Virginia //     Use all Select options. (visible text)
            Thread.sleep(2000);
            stateDropDown.selectByVisibleText("Virginia");

        //5. Select California //     Use all Select options. (index)
            Thread.sleep(2000);
            stateDropDown.selectByIndex(5);

        //6. Verify final selected option is California.
            String act_StateOption = stateDropDown.getFirstSelectedOption().getText();
            String exp_StateOption = "California";

            Assert.assertEquals(act_StateOption, exp_StateOption, "Verify if California selected - FAIL");

    }

    @Test
    public void multiselect_Dropdown() throws InterruptedException {
        /**
         * TC #3: Selecting value from multiple select dropdown
         *  1. Open Chrome browser
         *  2. Go to https://practice.cydeo.com/dropdown
         *  3. Select all the options from multiple select dropdown.
         *  4. Print out all selected values.
         *  5. Deselect all values.
         */


        //3. Select all the options from multiple select dropdown.
            Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
                //if WebElement has a tag select, that's meant needed to be used Select object

//            System.out.println("languages.isMultiple() = " + languages.isMultiple());
//                //this method will return true, if the dropDown is multipleSelection
//
//            languages.selectByValue("java");
//            languages.selectByVisibleText("C#");
//            languages.selectByIndex(0);
//            languages.selectByIndex(3);

        //4. Print out all selected values.
            // getOptions()  - will return to all options in DropDown

            List <WebElement> allOptions = languages.getOptions();

            for ( WebElement eachElement : allOptions ) {
                eachElement.click();
                Thread.sleep(1000);

                System.out.println("eachElement.getText() = " + eachElement.getText());

            }

        //5. Deselect all values.
            Thread.sleep(1000);
            languages.deselectAll();



    }




}
