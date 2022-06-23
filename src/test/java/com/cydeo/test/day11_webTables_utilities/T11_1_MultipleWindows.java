package com.cydeo.test.day11_webTables_utilities;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T11_1_MultipleWindows extends TestBase {

    /**
     * TC #2: Window Handle practice
     *
     *  1. Create new test and make set ups
     *  2. Go to : https://www.amazon.com
     *  3. Copy & paste the lines from below into your class
     *  4. Create a logic to switch to the tab where Etsy.com is open
     *  5. Assert: Title contains “Etsy”
     *
     *      Lines to be pasted:
     *      ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
     *      ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
     *      ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
     *      These lines will simply open new tabs using something called JavascriptExecutor
     *          and get those pages. We will learn JavascriptExecutor later as well.
     */


    @Test
    public void windowsHandle_Test(){

        //2. Go to : https://www.amazon.com
            driver.get("https://www.amazon.com");

        //3. Open new tabs:
            // Copy & paste the lines from below into your class
            //those codes are helping us to open new tabs:

            //"_blank" will open url in new tab/window
            ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

//            BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

            //4.1. set the arrayList to store titles:
                Set<String> allWindowHandles = driver.getWindowHandles();

            //4.2. loop to get each title:
                for ( String eachWindowHandle : allWindowHandles ) {
                    driver.switchTo().window(eachWindowHandle);
                    System.out.printf("", driver.getCurrentUrl());

                    if (driver.getCurrentUrl().contains("etsy")){
                        break;
                    }

                }

        //5. Assert: Title contains “Etsy”
            String actTitle = driver.getTitle();
            String expTitle = "Etsy";
            Assert.assertTrue(actTitle.contains(expTitle), "Title verification FAIL");

            // or you can use next method:
                BrowserUtils.verifyTitle(driver, "Etsy");

    }




}
