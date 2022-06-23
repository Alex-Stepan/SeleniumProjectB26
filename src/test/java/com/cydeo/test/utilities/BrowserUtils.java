package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {


    /** URL & Title verification */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){
                //make the method static to have it in usage without creating an object
        //4. Create a logic to switch to the tab where Etsy.com is open
            //4.1. set the arrayList to store titles:
                Set<String> allWindowHandles = driver.getWindowHandles();
            //4.2. loop to get each title:
                for ( String eachWindowHandle : allWindowHandles ) {
                    driver.switchTo().window(eachWindowHandle);
                    System.out.printf("", driver.getCurrentUrl());
                        if (driver.getCurrentUrl().contains(expectedInUrl)){
                            break;
                        }
                }
        //5. Assert: Title contains “Etsy”
            String actTitle = driver.getTitle();

            Assert.assertTrue(actTitle.contains(expectedTitle), "Title verification FAIL");
    }


    /** Title verification */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification FAIL");
    }





}
