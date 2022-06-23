package com.cydeo.test.extra_Tasks;

import com.cydeo.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task_SmartBear extends TestBase {

    @Test
    public void smartBearLinkVerify_Test() {

        /**
         * TC #1: Smartbear software link verification
         *
         *  1. Open browser
         *  2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
         *  3. Enter username: “Tester”
         *  4. Enter password: “test”
         *  5. Click to Login button
         *  6. Print out count of all the links on landing page
         *  7. Print out each link text on this page
         *
         * Mini-Task: CREATE A CLASS à SmartBearUtils
         * • Create a method called loginToSmartBear
         * • This method simply logs in to SmartBear when you call it.
         * • Accepts WebDriver type as parameter
         */

        SmartBearUtils.smartBearSoft_Login(driver);


        //6. Print out count of all the links on landing page
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

            System.out.println("allLinks.size() = " + allLinks.size());

        //7. Print out each link text on this page
            for ( WebElement eachLink : allLinks ) {
                System.out.println("eachLink.getText() = " + eachLink.getText());
            }


    }


    @Test
    public void smartBearOrderPlacing_Test() throws InterruptedException {

        /**
         * TC#2: Smartbear software order placing
         *
         *  1. Open browser
         *  2. Go to website:
         *      http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
         *  3. Enter username: “Tester”
         *  4. Enter password: “test”
         *  5. Click on Login button
         *  6. Click on Order
         *  7. Select familyAlbum from product, set quantity to 2
         *  8. Click to “Calculate” button
         *  9. Fill address Info with JavaFaker
         *      • Generate: name, street, city, state, zip code
         *  10. Click on “visa” radio button
         *  11. Generate card number using JavaFaker
         *  12. Click on “Process”
         *  13. Verify success message “New order has been successfully added.”
         */

        //2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
            SmartBearUtils.smartBearSoft_Login(driver);

        //6. Click on Order
            driver.findElement(By.xpath("//a[.='Order']")).click();

        //7. Select familyAlbum from product, set quantity to 2
            Select selectProduct =
                    new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));

            selectProduct.selectByValue("FamilyAlbum");

            WebElement quantityBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
                quantityBox.clear();
                quantityBox.sendKeys("2");

        //8. Click to “Calculate” button
            driver.findElement(By.xpath("//input[@value='Calculate']")).click();



        //Generate Faker
            Faker faker = new Faker();

        //9. add address
            SmartBearUtils.inputFakerAddressInfo(driver, faker);

        //10. add credit card info
            SmartBearUtils.inputFakerCrecitCardInfo(driver, faker);

        //12. Click on “Process”
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        //13. The message is displayed:
        SmartBearUtils.message_NewOrderHasBeenAdded_isDisplayed(driver);
    }


    @Test
    public void smartBearOrderVerification_Test(){
        /**
         * TC#3: Smartbear software order verification
         *
         *  1. Open browser and login to Smartbear software
         *  2. Click on View all orders
         *  3. Verify Susan McLaren has order on date “01/05/2010”
         */

        //1. Open browser and login to Smartbear software
        SmartBearUtils.smartBearSoft_Login(driver);

        //2. Click on View all orders
        driver.findElement(By.xpath("//a[.='View all orders']")).click();

        //3. Verify Susan McLaren has order on date “01/05/2010”

        Assert.assertEquals(
                    SmartBearUtils.returnOrderDate(driver,"Susan McLaren"),
                    "01/05/2010",
                    "date on the order is not matching - FAIL"
                    );

    }


}
