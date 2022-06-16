package com.cydeo.test.day3_Css_GetText_GetAtribute;

import com.NextBaseCRM.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T32_getText_getAtribute {

    /*
    TC #5: getText() and getAttribute() method practice
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/registration_form
        3- Verify header text is as expected:   Expected: Registration form
        4- Locate “First name” input box
        5- Verify placeholder attribute’s value is as expected: Expected: first name
     */

    public static void main(String[] args) {

        //1- Open a chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
            driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected: Expected: Registration form
            //declare expected
                String expectedHeader = "Registration form";
            //locate and get actual
                WebElement headerText = driver.findElement(By.tagName("h2"));
                //WebElement headerText = driver.findElement(By.cssSelector("div[class='page-header']>h2"));
                //WebElement headerText = driver.findElement(By.cssSelector("div.page-header"));
                String actualHeader = headerText.getText();
            //verify
                if (actualHeader.equals(expectedHeader)){
                    System.out.println("Header Text Verification PASSED!");
                } else {
                    System.out.println("Header Text Verification FAILED!");
                }

        //4- Locate “First name” input box
            WebElement firstNameInput = driver.findElement(By.className("form-control"));


        //5- Verify placeholder attribute’s value is as expected: Expected: first name
            String expectedPlaceHolder = "first name";

            String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

            if  (actualPlaceHolder.equals(expectedPlaceHolder)){
                System.out.println("Placeholder text verification PASSED!!");
            } else {
                System.out.println("Placeholder text verification FAILED!");

        //9. reporting about termination of the Testing
            System.out.println("------------------------------------------------------");
            System.out.println("Testing is complete!");
            System.out.println("======================================================");

        //10. Ext. quit()
            Driver.quit(driver);

        }
    }



}
