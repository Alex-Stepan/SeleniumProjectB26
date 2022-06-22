package com.cydeo.test.day9_TestBase_IFrame;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T92_Iframe_Task extends TestBase {
    /**
     * TC : Iframe practice
     *  1. Go to: https://practice.cydeo.com/iframe
     *  2. Assert: “Your content goes here.” Text is displayed.
     *  3. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
     */

    @Test
    public void iframePractice_test(){
        //1. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //2. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame("mce_0_ifr");

        String actContent = driver.findElement(By.tagName("p")).getText();
        String expContent = "Your content goes here.";
        Assert.assertEquals(actContent, expContent, "Content inside iframe doe not match - FAIL");

        //3. Assert: “An iFrame containing the TinyMCEWYSIWYG Editor”
        driver.switchTo().defaultContent();

        String actNote = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        String expNote = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actNote, expNote, "The note is not matching - FAIL");

    }

}
