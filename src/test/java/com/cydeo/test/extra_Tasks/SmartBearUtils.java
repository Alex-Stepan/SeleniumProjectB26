package com.cydeo.test.extra_Tasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SmartBearUtils {


    public static void smartBearSoft_Login(WebDriver driver) {
        //2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");

        //4. Enter password: “test”
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");

        //5. Click to Login button
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
    }


    public static void inputFakerAddressInfo(WebDriver driver, Faker faker) {
        //9. Fill address Info with JavaFaker • Generate: name, street, city, state, zip code
            WebElement customerName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
            WebElement street = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
            WebElement city = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
            WebElement state = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
            WebElement zipcode = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));

            customerName.sendKeys(faker.name().fullName());
            street.sendKeys(faker.address().streetAddress());
            city.sendKeys(faker.address().city());
            state.sendKeys(faker.address().state());
            zipcode.sendKeys(faker.numerify("#####"));
    }


    public static void inputFakerCrecitCardInfo(WebDriver driver, Faker faker) {
        //10. Click on “visa” radio button
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();

        //11. Generate card number using JavaFaker
            WebElement cardNr = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
            WebElement expDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));

            cardNr.sendKeys(faker.numerify("####################"));
            expDate.sendKeys(faker.numerify("##/##"));
    }


    public static void message_NewOrderHasBeenAdded_isDisplayed(WebDriver driver) {
        //13. Verify success message “New order has been successfully added.”
        WebElement message = driver.findElement(By.tagName("strong"));
        String actMessage = message.getText();
        String expMessage = "New order has been successfully added.";

        Assert.assertEquals(actMessage, expMessage, "Added message does not matching - FAIL");

        Assert.assertTrue(message.isDisplayed(), "The message is not displayed - FAIL");
    }


    /** Return Order Date from Cydeo Web-tables based on customer Name*/
    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }



}
