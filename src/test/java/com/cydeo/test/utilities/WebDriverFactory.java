package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    // TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

    /** Creating the Webdriver */
    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else {
            System.out.println("Given browser type does not exists");
            System.out.println("driver is null!");
            return null;
        }

//        //1. initialize scanner
//        Scanner input = new Scanner(System.in);
//
//        //2. scan the input text
//        System.out.println("Please choose a browser you like: ");
//        String browser = input.nextLine();
//
//        //3. declare Webdriver
//        WebDriver driver = null;
//
//        //4. choose options
//        switch (browser){
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            case "opera":
//                WebDriverManager.operadriver().setup();
//                driver = new OperaDriver();
//        }
//
//        //5. driver actions
//        driver.manage().window().maximize();
//
//        //6. returning
//        return driver;


    }


}
