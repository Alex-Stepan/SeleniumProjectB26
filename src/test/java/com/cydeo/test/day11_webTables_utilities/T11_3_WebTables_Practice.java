package com.cydeo.test.day11_webTables_utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T11_3_WebTables_Practice extends TestBase {

    /**
     * TC #1: Web table practice
     *
     *  1. Go to: https://practice.cydeo.com/web-tables
     *  2. Verify Bob’s name is listed as expected: “Bob Martin”
     *  3. Verify Bob Martin’s order date is as expected: 12/31/2021
     */

    @Test
    public void order_name_verify_test(){

        //1. Go to: https://practice.cydeo.com/web-tables
            driver.get("https://practice.cydeo.com/web-tables");

        //2. Verify Bob’s name is listed as expected: “Bob Martin”
            WebElement td_BobMartin =
                    driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

            String actTdBobMartin = td_BobMartin.getText();
            String expTdBobMartin = "Bob Martin";

            Assert.assertEquals
                    (actTdBobMartin, expTdBobMartin, "Bob Martin is not listed correct - FAIL");

        //3. Verify Bob Martin’s order date is as expected: 12/31/2021
            WebElement td_BobMartinDate =
                    driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='12/31/2021']"));
                        ////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[.='12/31/2021']
                        ////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]


        String actBobMartinDate = td_BobMartinDate.getText();
            String expBobMartinDate = "12/31/2021";

            Assert.assertEquals
                    (actBobMartinDate, expBobMartinDate, "date for Bob MArtin is not listed correct -FAIL");

    }
}
