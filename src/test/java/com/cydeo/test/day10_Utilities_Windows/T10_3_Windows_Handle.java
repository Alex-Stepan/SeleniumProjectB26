package com.cydeo.test.day10_Utilities_Windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T10_3_Windows_Handle extends TestBase {
        /**
         * TC : Window Handle practice
         *  1. Open a chrome browser
         *  2. Go to : https://practice.cydeo.com/windows
         *  3. Assert: Title is “Windows”
         *  4. Click to: “Click Here” link
         *  5. Switch to new Window.
         *  6. Assert: Title is “New Window”
         */



    @Test
    public void  window_Handle_test(){
        //2. Go to : https://practice.cydeo.com/windows
            driver.get("https://practice.cydeo.com/windows");

            String mainWindow = driver.getWindowHandle(); // it will give me the actual windowHandle
            System.out.println("mainWindow = " + mainWindow);
                            //mainWindow = CDwindow-95C008E3EDD3E49D3CA45466062E6CC9

        //3. Assert: Title is “Windows”
            String actTitle = driver.getTitle();
            String expTitle = "Windows";

            Assert.assertEquals(actTitle, expTitle, "main window title verification FAIL");

        //4. Click to: “Click Here” link
            WebElement clickHere = driver.findElement(By.linkText("Click Here"));
            clickHere.click();

        //5. Switch to new Window.

            //5.1. create arrayList to store all windowHandles
                Set<String> allWindowHandles = driver.getWindowHandles();

            //5.2. run the loop to get each WindowHandle
                for (String each : allWindowHandles) {
                    driver.switchTo().window(each);
                    System.out.println("driver.getTitle() = " + driver.getTitle());
                }
                        //driver.getTitle() = Windows
                        //driver.getTitle() = New Window


        //6. Assert: Title is “New Window”
            String expTitleAfterClicking = "New Window";
            actTitle = driver.getTitle();

            Assert.assertEquals(actTitle, expTitleAfterClicking, "New Window title verification FAIL");

    }



}
