package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1- Setting up the WebDriver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- navigate to google page
        driver.get("https:/google.com");


    }
}
