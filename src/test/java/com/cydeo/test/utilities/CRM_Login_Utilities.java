package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Login_Utilities {
    /**
     * TC : Create utility methods for CRM_Utilities class
     *
     *  1. Create a new method for login
     *  2. Create a method to make CRM Login test logic re-usable
     *  3. When method is called, it should simply login
     *
     *      This method should have at least 2 overloaded versions.
     *          Method #1 info:
     *              • Name: login_crm()
     *              • Return type: void
     *              • Arg1: WebDriver
     *
     *          Method #2 info:
     *              • Name: login_crm()
     *              • Return type: void
     *              • Arg1: WebDriver
     *              • Arg2: String username
     *              • Arg3: String password
     */




    public static void crm_Login(WebDriver driver){
        /**
         * Method #1 info:
         *  • Name: login_crm()
         *  • Return type: void
         *  • Arg1: WebDriver
         */

        //3- Login Homepage ( Login with valid username and password)
            WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            usernameBox.sendKeys("helpdesk30@cybertekschool.com");

            WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            passwordBox.sendKeys("UserUser");

            WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginBtn.click();
    }


    public static void crm_Login(WebDriver driver, String username, String password){
        /**
         * Method #2 info:
         *  • Name: login_crm()
         *  • Return type: void
         *  • Arg1: WebDriver
         *  • Arg2: String username
         *  • Arg3: String password
         */

        //3- Login Homepage ( Login with valid username and password)
            //3.1. Enter valid username
                WebElement inputUsernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
                inputUsernameBox.sendKeys(username);
        //3.1. Enter valid username

            WebElement inputPasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            inputPasswordBox.sendKeys(password);

            WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginBtn.click();

    }



}
