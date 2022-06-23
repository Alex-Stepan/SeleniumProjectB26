package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    /**
     * TC #2: Web table practice Task1 cont.
     *
     *  1. Create a new class called WebTableUtils.
     *  2. Create two methods to verify order
     */


    /** Return Order Date from Web-tables based on customer Name*/
    public static String returnOrderDate(WebDriver driver, String customerName){
        /**      Method #1 info:
         *      • Name: returnOrderDate ()
         *      • Return type: String
         *      • Arg1: WebDriver driver
         *      • Arg2: String costumerName
         *          This method should accept a costumerName and return the costumer order date as a String.
         */
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }


    /** Return Order Date from Web-tables based on customer Name*/
    public static String returnOrderDate2(WebDriver driver, String customerName) {
        /**      Method #1 info:
         *      • Name: returnOrderDate ()
         *      • Return type: String
         *      • Arg1: WebDriver driver
         *      • Arg2: String costumerName
         *          This method should accept a costumerName and return the costumer order date as a String.
         */
        return driver.findElement(By.xpath("//td[.='" + customerName + "']/following-sibling::td[3]")).getText();
    }



    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        /**
         *      Method #2 info:
         *      • Name: orderVerify ()
         *      • Return type: void
         *      • Arg1: WebDriver driver
         *      • Arg2: String customerName
         *      • Arg3: String expectedOrderDate
         *          This method should accept above mentioned arguments and internally assert expectedOrderDate matching actualOrderDate.
         */
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customDateCell = driver.findElement(By.xpath(locator));

        String actOrderDate = customDateCell.getText();
        Assert.assertEquals(actOrderDate, expectedOrderDate);

    }





}
