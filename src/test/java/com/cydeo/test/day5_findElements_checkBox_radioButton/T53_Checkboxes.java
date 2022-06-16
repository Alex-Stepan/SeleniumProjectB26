package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T53_Checkboxes {

    /**
     * Practice: Checkboxes
     *  1. Go to http://practice.cydeo.com/checkboxes
     *  2. Confirm checkbox #1 is NOT selected by default
     *  3. Confirm checkbox #2 is SELECTED by default.
     *  4. Click checkbox #1 to select it.
     *  5. Click checkbox #2 to deselect it.
     *  6. Confirm checkbox #1 is SELECTED.
     *  7. Confirm checkbox #2 is NOT selected.
     */

    public static void main(String[] args) {

        //1. Go to http://practice.cydeo.com/checkboxes
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            driver.get("http://practice.cydeo.com/checkboxes");


            /** WebElements verification */
            WebElement ChBx1 = driver.findElement(By.xpath("//input[@id='box1']"));
            System.out.println("ChBx1.isDisplayed() = " + ChBx1.isDisplayed());

                WebElement ChBx1_2 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
                System.out.println("ChBx1_2.isDisplayed() = " + ChBx1_2.isDisplayed());

                    WebElement ChBx1_3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
                    System.out.println("ChBx1_3.isDisplayed() = " + ChBx1_3.isDisplayed());

            System.out.println("------------------------------------------");

            WebElement ChBx2 = driver.findElement(By.xpath("//input[@id='box2']"));
            System.out.println("ChBx2.isDisplayed() = " + ChBx2.isDisplayed());

                WebElement ChBx2_2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
                System.out.println("ChBx2_2.isDisplayed() = " + ChBx2_2.isDisplayed());

                    WebElement ChBx2_3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
                    System.out.println("ChBx2_3.isDisplayed() = " + ChBx2_3.isDisplayed());

        System.out.println("------------------------------------------");

        //2. Confirm checkbox #1 is NOT selected by default
        //3. Confirm checkbox #2 is SELECTED by default.
            System.out.println("ChBx1.isSelected() = " + ChBx1.isSelected());
            System.out.println("ChBx2.isSelected() = " + ChBx2.isSelected());
            System.out.println("==========================================");


        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
            System.out.println("Click checkbox #1");
            System.out.println("Click checkbox #2");

            ChBx1.click();
            ChBx2.click();

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
            System.out.println("ChBx1.isSelected() = " + ChBx1.isSelected());
            System.out.println("ChBx2.isSelected() = " + ChBx2.isSelected());
            System.out.println("==========================================");

        //last
            driver.quit();


            /*
            ChBx1.isDisplayed() = true
            ChBx1_2.isDisplayed() = true
            ChBx1_3.isDisplayed() = true
            ------------------------------------------
            ChBx2.isDisplayed() = true
            ChBx2_2.isDisplayed() = true
            ChBx2_3.isDisplayed() = true
            ------------------------------------------
            ChBx1.isSelected() = false
            ChBx2.isSelected() = true
            ==========================================
            Click checkbox #1
            Click checkbox #2
            ChBx1.isSelected() = true
            ChBx2.isSelected() = false
            ==========================================
             */

    }

}
