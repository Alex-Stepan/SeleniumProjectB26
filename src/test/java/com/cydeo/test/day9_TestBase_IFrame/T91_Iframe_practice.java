package com.cydeo.test.day9_TestBase_IFrame;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T91_Iframe_practice extends TestBase {


        /**
         * TC #6: Iframe Task
         *
         *  1- Open a chrome browser
         *  2- Go to: https://practice.cydeo.com/iframe
         *  3- Clear text from comment body
         *  4- Type "Hello World" in comment body
         *  5- Verify "Hello World" text is written in comment body
         *  6- Verify header "An iFrame containing the TinyMCEWYSIWYG Editor" is displayed
         */

    @Test
    public void iframePractice() throws InterruptedException {
        //2- Go to: https://practice.cydeo.com/iframe
            driver.get("https://practice.cydeo.com/iframe");

        //3- Clear text from comment body

            //3.1. switch to iframe based on id="mce_0_ifr"
                driver.switchTo().frame("mce_0_ifr");

//            //switch to iframe based on locator
//            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
//
//            //switch to iframe based on index, index starts from 0
//            driver.switchTo().frame(0);

            //3.2.
                WebElement commentBody = driver.findElement(By.id("tinymce"));

            //3.3. clear() - delete text from
                commentBody.clear();

        //4- Type "Hello World" in comment body
            commentBody.sendKeys("Hello World");

        //5- Verify "Hello World" text is written in comment body
            Assert.assertEquals(commentBody.getText(), "Hello World");

        //6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed

            //6.1 switch to exterior frame
                driver.switchTo().parentFrame();
                //driver.switchTo().defaultContent();

            //6.2.
                WebElement headerText = driver.findElement(By.tagName("h3"));
                    Assert.assertTrue(headerText.isDisplayed(), "header Text did not appear");

            //6.3.
                String actHeader = headerText.getText();
                String expHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";
                    Assert.assertEquals(actHeader, expHeader, "Header text did not appear correctly");




    }

        /**
         * //switch to iframe based on id="mce_0_ifr"
         *             driver.switchTo().frame("mce_0_ifr");
         *
         * //switch to iframe based on locator
         *             driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
         *
         * //switch to iframe based on index, index starts from 0
         *             driver.switchTo().frame(0);
         *
         *
         *
         * driver.switchTo().parentFrame();
         * driver.switchTo().defaultContent();
         */

}
