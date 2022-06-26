package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /** needed to make coding shorter and easier without using TestBase and WebDriverFactory */

    //1.
        //Creating a private constructor, we are closing access to the object of this class from outside this class
    private  Driver(){}

    //2.
        //Make WebDriver private, to close access from outside this class
        //Make it static, to use it in static method
    private static WebDriver driver;

    //3.
        //Create re-usable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){

        //4.
            //it will check if driver is null, if it is null -> will set up the browser inside if statement
        if (driver == null){

            //5.
                //read browser type from configuration.properties using ConfigurationReader class and getProperty() method
            String browserType = ConfigurationReader.getProperty("browser");


            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

            }
        }

        return driver;

    }



    /** This method will make driver value "null" after using quit() method */
    public static void closeDriver(){
        if(driver != null){
            driver.quit(); // this line will terminate the existing driver session. with using this driver will not be even null
            driver = null;
        }

    }



}
