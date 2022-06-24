package com.cydeo.test.day10_Utilities_Windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T10_2_CRM_Login extends TestBase {

    @Test
    public void crm_login_test(WebDriver driver, String username, String password){

        //2. Go to : https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
            WebElement inputUsernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            inputUsernameBox.sendKeys(username);

        //4. Enter valid password
            WebElement inputPasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            inputPasswordBox.sendKeys(password);

        //5. Click to `Log In` button
            WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginBtn.click();
    }

}
