package com.cydeo.test.extra_Tasks;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebLinksExtraTasks extends TestBase {

    /**
     * TC #1: Checking the number of links on the page
     *  1. Open Chrome browser
     *  2. Go to https://www.openxcell.com
     *  3. Count the number of the links on the page and verify
     *      Expected: 332
     *
     *
     * TC #2: Printing out the texts of the links on the page
     *  1. Open Chrome browser
     *  2. Go to https://www.openxcell.com
     *  3. Print out all of the texts of the links on the page
     *
     *
     * TC #3: Counting the number of links that does not have text
     *  1. Open Chrome browser
     *  2. Go to https://www.openxcell.com
     *  3. Count the number of links that does not have text and verify
     *      Expected: 109
     *
     * NOTE: EXPECTED NUMBER OF LINKS FOR THIS PRACTICE MAY BE DIFFERENT
     * FROM COMPUTER TO COMPUTER, OR FOR DIFFERENT OS (MAC-WINDOWS). SO
     * IF YOU ARE GETTING A DIFFERENT NUMBER, JUST USE THAT NUMBER FOR
     * VERIFICATION.
     */

    @Test (priority = 1)
    public void t1_checkLinkNumbers(){
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        //3. Count the number of the links on the page and verify.  Expected: 332
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        int actCount = allLinks.size();
        int expCount = 332;

        Assert.assertEquals(actCount, expCount, "Count of the links is not matching - FAIL");

    }


    @Test (priority = 2)
    public void t2_printLinkText(){
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        //3. Print out all of the texts of the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

            for ( WebElement eachLink : allLinks ) {
                System.out.println("eachLink.getText() = " + eachLink.getText());
            }

    }


    @Test (priority = 3)
    public void t3_countLinksWithNoText(){
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        //3. Count the number of links that does not have text and verify
        //     *      Expected: 109
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            int emptyLinksCount = 0;
                for ( WebElement eachLink : allLinks ) {
                    if (eachLink.getText().isEmpty()){
                        emptyLinksCount++;
                    }
                }

            int actCount = emptyLinksCount;
            int expCount = 109;
        Assert.assertEquals(actCount, expCount, "The count for empty link is not matching - FAIL");
    }


}
