package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class HomeWork3 {
    /**
     * TC #3: Practice Cydeo/ForgotPassword URL verification
     *      1. Open Chrome browser
     *      2. Go to http://practice.cydeo.com/forgot_password
     *      3. Enter any email into input box
     *      4. Click on Retrieve password
     *      5. Verify URL contains: Expected: “email_sent”
     *      6. Verify textbox displayed the content as: Expected: “Your e-mail’s been sent!”
     */
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cydeo.com/forgot_password
        driver.get("http://practice.cydeo.com/forgot_password");

        //3. Enter any email into input box
        WebElement EmailInput3 = driver.findElement(By.xpath("//input[@type='text']"));
        EmailInput3.sendKeys("blalalayka@gmail.com");

        //4. Click on Retrieve password
        WebElement RetrievePasswordBTN5 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        RetrievePasswordBTN5.click();

        //5. Verify URL contains: Expected: “email_sent”
        String act_title = driver.getTitle();
        String word = "email_sent";

        if (act_title.toLowerCase(Locale.ROOT).contains(word)){
            System.out.println("URL contains (email_sent) PASS");
        } else {
            System.out.println("URL contains (email_sent) FAIL");
        }

        //6. Verify textbox displayed the content as: Expected: “Your e-mail’s been sent!”
        WebElement EmailBeenSent = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));

        System.out.println("EmailBeenSent.isDisplayed() = " + EmailBeenSent.isDisplayed());

        //7.
        driver.quit();

    }
}
