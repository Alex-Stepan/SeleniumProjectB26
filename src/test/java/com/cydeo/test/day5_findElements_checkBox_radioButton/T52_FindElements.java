package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T52_FindElements {

    /**
     * TC #4: FindElements Task
     *  1- Open a chrome browser
     *  2- Go to: https://practice.cydeo.com/abtest
     *  3- Locate all the links in the page.
     *  4- Print out the number of the links on the page.
     *  5- Print out the texts of the links.
     *  6- Print out the HREF attribute values of the links
     */


    public static void main(String[] args) {
        //1- Open a chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        // providing extra time for our driver before it throws NoSuchElemntException
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
            driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

                    WebElement HomeLink = driver.findElement(By.cssSelector("a.nav-link"));
                    WebElement HomeLink2 = driver.findElement(By.cssSelector("a[href='/']"));
                    WebElement HomeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));
                    WebElement HomeLink4 = driver.findElement(By.xpath("//a[@href='/']"));

                    WebElement NoABtest = driver.findElement(By.xpath("//h3"));
                    WebElement NoABtest2 = driver.findElement(By.xpath("//div[@id='content']/div"));

                    WebElement Text = driver.findElement(By.xpath("//p"));
                    WebElement Text2 = driver.findElement(By.xpath("//div[@id='content']/div/p"));

                    WebElement PoweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
                    WebElement PoweredByCydeo2 = driver.findElement(By.xpath("//div[@style]"));
                    WebElement PoweredByCydeo3 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
                    WebElement PoweredByCydeo4 = driver.findElement(By.xpath("//div[@id='page-footer']/div/div"));

            //4- Print out the number of the links on the page.
            System.out.println("allLinks.size() = " + allLinks.size());
            System.out.println("----------------------------------------------");

                    System.out.println();
                    System.out.println("HomeLink.isDisplayed() = " + HomeLink.isDisplayed());
                    System.out.println("HomeLink2.isDisplayed() = " + HomeLink2.isDisplayed());
                    System.out.println("HomeLink3.isDisplayed() = " + HomeLink3.isDisplayed());
                    System.out.println("HomeLink4.isDisplayed() = " + HomeLink4.isDisplayed());
                    System.out.println();
                    System.out.println("NoABtest.isDisplayed() = " + NoABtest.isDisplayed());
                    System.out.println("NoABtest2.isDisplayed() = " + NoABtest2.isDisplayed());
                    System.out.println();
                    System.out.println("Text.isDisplayed() = " + Text.isDisplayed());
                    System.out.println("Text2.isDisplayed() = " + Text2.isDisplayed());
                    System.out.println();
                    System.out.println("PoweredByCydeo.isDisplayed() = " + PoweredByCydeo.isDisplayed());
                    System.out.println("PoweredByCydeo2.isDisplayed() = " + PoweredByCydeo2.isDisplayed());
                    System.out.println("PoweredByCydeo3.isDisplayed() = " + PoweredByCydeo3.isDisplayed());
                    System.out.println("PoweredByCydeo4.isDisplayed() = " + PoweredByCydeo4.isDisplayed());

            System.out.println("----------------------------------------------");

        //5- Print out the texts of the links. //shortcut: type iter + tab
            for (WebElement eachLink : allLinks) {
                    System.out.println("Text of each link = " + eachLink.getText());
                    System.out.println("Href values = " + eachLink.getAttribute("href"));
            }
            System.out.println("----------------------------------------------");


            //6- Print out the HREF attribute values of the links


            driver.quit();

            /*
                        allLinks.size() = 2
                        ----------------------------------------------

                        HomeLink.isDisplayed() = true
                        HomeLink2.isDisplayed() = true
                        HomeLink3.isDisplayed() = true
                        HomeLink4.isDisplayed() = true

                        NoABtest.isDisplayed() = true
                        NoABtest2.isDisplayed() = true

                        Text.isDisplayed() = true
                        Text2.isDisplayed() = true

                        PoweredByCydeo.isDisplayed() = true
                        PoweredByCydeo2.isDisplayed() = true
                        PoweredByCydeo3.isDisplayed() = true
                        PoweredByCydeo4.isDisplayed() = true
                        ----------------------------------------------
                        Text of each link = Home
                        Href values = https://practice.cydeo.com/
                        Text of each link = CYDEO
                        Href values = https://cydeo.com/
                        ----------------------------------------------
             */

    }


}
