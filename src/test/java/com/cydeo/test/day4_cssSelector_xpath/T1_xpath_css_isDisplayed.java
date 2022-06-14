package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {

    public static void main(String[] args) {

        /**
         * TC #1: XPATH and cssSelector Practices
         *      1. Open Chrome browser
         *      2. Go to https://practice.cydeo.com/forgot_password
         *      3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
         *              a. “Home” link
         *              b. “Forgot password” header
         *              c. “E-mail” text
         *              d. E-mail input box
         *              e. “Retrieve password” button
         *              f. “Powered by Cydeo text
         *      4. Verify all web elements are displayed.
         *
         *  First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
         *  Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
         */

        //1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
            driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
            //a. “Home” link
                WebElement HomeLink = driver.findElement(By.cssSelector("a.nav-link"));
                WebElement HomeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));
                WebElement HomeLink3 = driver.findElement(By.cssSelector("a[href='/']"));
                    WebElement HomeLink4 = driver.findElement(By.xpath("//a[@class='nav-link']"));
                    WebElement HomeLink5 = driver.findElement(By.xpath("//a[.='Home']"));
                    WebElement HomeLink6 = driver.findElement(By.xpath("//a[@href='/']"));

            //b. “Forgot password” header
                WebElement ForgotPasswordHeader = driver.findElement(By.cssSelector("div.example>h2"));//parent > child
                    WebElement ForgotPasswordHeader2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
                    WebElement ForgotPasswordHeader3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
            //c. “E-mail” text
                WebElement EmailLabel = driver.findElement(By.cssSelector("label[for='email']"));
                    WebElement EmailLabel2 = driver.findElement(By.xpath("//label[@for='email']"));
                    WebElement EmailLabel3 = driver.findElement(By.xpath("//label[text()='E-mail']"));


        //d. E-mail input box   input[type='text']
                WebElement EmailInput = driver.findElement(By.cssSelector("input[type='text']"));
                WebElement EmailInput2 = driver.findElement(By.cssSelector("input[name='email']"));
                    WebElement EmailInput3 = driver.findElement(By.xpath("//input[@type='text']"));
                    WebElement EmailInput4 = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password”
                WebElement RetrievePasswordBTN = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
                WebElement RetrievePasswordBTN2 = driver.findElement(By.cssSelector("button#form_submit"));
                WebElement RetrievePasswordBTN3 = driver.findElement(By.cssSelector("button.radius"));
                WebElement RetrievePasswordBTN4 = driver.findElement(By.cssSelector("button[type='submit']"));
                    WebElement RetrievePasswordBTN5 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
                    WebElement RetrievePasswordBTN6 = driver.findElement(By.xpath("//button[@id='form_submit']\n"));


        //f. “Powered by Cydeo text
                WebElement PoweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
                    WebElement PoweredByCydeo2 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));



        //4. Verify all web elements are displayed, based on CssSelector
            System.out.println("<<< CSS SELECTOR >>>");

            System.out.println("HomeLink.isDisplayed() = " + HomeLink.isDisplayed());
            System.out.println("HomeLink2.isDisplayed() = " + HomeLink2.isDisplayed());
            System.out.println("HomeLink3.isDisplayed() = " + HomeLink3.isDisplayed());

            System.out.println("ForgotPasswordHeader.isDisplayed() = " + ForgotPasswordHeader.isDisplayed());

            System.out.println("EmailLabel.isDisplayed() = " + EmailLabel.isDisplayed());

            System.out.println("EmailInput.isDisplayed() = " + EmailInput.isDisplayed());
            System.out.println("EmailInput2.isDisplayed() = " + EmailInput2.isDisplayed());

            System.out.println("RetrievePasswordBTN.isDisplayed() = " + RetrievePasswordBTN.isDisplayed());
            System.out.println("RetrievePasswordBTN2.isDisplayed() = " + RetrievePasswordBTN2.isDisplayed());
            System.out.println("RetrievePasswordBTN3.isDisplayed() = " + RetrievePasswordBTN3.isDisplayed());
            System.out.println("RetrievePasswordBTN4.isDisplayed() = " + RetrievePasswordBTN4.isDisplayed());

            System.out.println("PoweredByCydeo.isDisplayed() = " + PoweredByCydeo.isDisplayed());
            System.out.println("----------------------------------------------------------");

        //5. Verify all web elements are displayed, based on Xpath
            System.out.println("<<< XPATH >>>");
            System.out.println("HomeLink4.isDisplayed() = " + HomeLink4.isDisplayed());
            System.out.println("HomeLink5.isDisplayed() = " + HomeLink5.isDisplayed());
            System.out.println("HomeLink6.isDisplayed() = " + HomeLink6.isDisplayed());

            System.out.println("ForgotPasswordHeader2.isDisplayed() = " + ForgotPasswordHeader2.isDisplayed());
            System.out.println("ForgotPasswordHeader3.isDisplayed() = " + ForgotPasswordHeader3.isDisplayed());

            System.out.println("EmailLabel2.isDisplayed() = " + EmailLabel2.isDisplayed());
            System.out.println("EmailLabel3.isDisplayed() = " + EmailLabel3.isDisplayed());

            System.out.println("EmailInput3.isDisplayed() = " + EmailInput3.isDisplayed());
            System.out.println("EmailInput4.isDisplayed() = " + EmailInput4.isDisplayed());

            System.out.println("RetrievePasswordBTN5.isDisplayed() = " + RetrievePasswordBTN5.isDisplayed());
            System.out.println("RetrievePasswordBTN6.isDisplayed() = " + RetrievePasswordBTN6.isDisplayed());

            System.out.println("PoweredByCydeo2.isDisplayed() = " + PoweredByCydeo2.isDisplayed());

            System.out.println("----------------------------------------------------------");

        //6.
            driver.quit();


    }

}
