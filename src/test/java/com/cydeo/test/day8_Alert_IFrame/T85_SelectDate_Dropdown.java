package com.cydeo.test.day8_Alert_IFrame;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T85_SelectDate_Dropdown extends TestBase {

    @Test
    public void selectDateDropdown_Test() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1, 1923” and verify it is selected.
            Thread.sleep(3000);


            //Year, by visible text
                Select selectYear = new Select(driver.findElement(By.id("year")));
                selectYear.selectByVisibleText("1923");

            //Month, by value atribute
                Select selectMonth = new Select(driver.findElement(By.id("month")));
                selectMonth.selectByValue("11");

            //Date, index number
                Select selectDay = new Select(driver.findElement(By.id("day")));
                selectDay.selectByIndex(0);

            Thread.sleep(3000);

        //assertions
            Assert.assertEquals(selectYear.getFirstSelectedOption().getText(), "1923", "Year Assertion FAIL");
            Assert.assertEquals(selectMonth.getFirstSelectedOption().getText(), "December", "Month Assertion FAIL");
            Assert.assertEquals(selectDay.getFirstSelectedOption().getText(), "1", "Day Assertion FAIL");
                    // or
            Assert.assertTrue(selectYear.getFirstSelectedOption().getText().equals("1923"), "Year Assertion FAIL");
            Assert.assertTrue(selectMonth.getFirstSelectedOption().getText().equals("December"), "Month Assertion FAIL");
            Assert.assertTrue(selectDay.getFirstSelectedOption().getText().equals("1"), "Day Assertion FAIL");


    }

}