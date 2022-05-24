package com.NextBaseCRM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /** Creating the Webdriver */
    public static WebDriver getWebDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }



    /** Quiting the Webdriver */
    public static void quit(WebDriver driver) {

        driver.quit();
    }

}
