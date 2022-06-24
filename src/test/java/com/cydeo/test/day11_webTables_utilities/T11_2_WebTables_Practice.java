package com.cydeo.test.day11_webTables_utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T11_2_WebTables_Practice extends TestBase {

    @Test
    public void webTeblesLocatingPractice_test(){

        //2.
        driver.get("http://practice.cydeo.com/tables");

        //3.

        //P1_ WRITE A LOCATOR THAT RETURNS THE TABLE 1 ITSELF
            WebElement P1 = driver.findElement(By.xpath("//table[@id='table1']"));
            System.out.println("P1.isDisplayed() = " + P1.isDisplayed());

        //P2_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF TABLE 1
            WebElement P2 = driver.findElement(By.xpath("//table[@id='table1']//tr"));
            System.out.println("P2.isDisplayed() = " + P2.isDisplayed());

        //P3_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF BODY - TABLE 1
            WebElement P3 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr"));
            System.out.println("P3.isDisplayed() = " + P3.isDisplayed());

        //P4_ WRITE A LOCATOR THAT RETURNS ONLY 3RD ROW IN THE BODY
            WebElement P4 = driver.findElement(By.xpath("(//table[@id='table1']/tbody/tr)[3]"));
            System.out.println("P4.isDisplayed() = " + P4.isDisplayed());

        //P5_ WRITE A LOCATOR THAT RETURNS ALL OF THE CELLS IN ALL OF THE ROW (IN BODY)
            WebElement P5 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr//td"));
            System.out.println("P5.isDisplayed() = " + P5.isDisplayed());

        //P6_ WRITE A LOCATOR THAT RETURNS ALL OF THE FIRST NAMES FROM TABLE
            WebElement P6 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
            System.out.println("P6.isDisplayed() = " + P6.isDisplayed());

        //P7_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
            WebElement P7 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]//td[2]"));
            System.out.println("\tP7.getText() = " + P7.getText());
            System.out.println("P7.isDisplayed() = " + P7.isDisplayed());

        //P8_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY USE FRANKS TEXT
            WebElement P8 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]//td[.='Frank']"));
            System.out.println("\tP8.getText() = " + P8.getText());
            System.out.println("P8.isDisplayed() = " + P8.isDisplayed());

        //P9_ WRITE A LOCATOR THAT RETURNS $51 CELL SPECIFICALLY USE FRANKS TEXT
            //  //table[@id='table1']/tbody/tr[2]//td[.='$51.00']
            WebElement P9 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]//td[.='Frank']/following-sibling::td[2]"));
            System.out.println("\tP9.getText() = " + P9.getText());
            System.out.println("P9.isDisplayed() = " + P9.isDisplayed());

        //P10_ WRITE A LOCATOR THAT RETURNS JASONS DUE AMOUNT BASED ON JASONS NAME
            WebElement P10 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]//td[.='Jason']"));
            System.out.println("\tP10.getText() = " + P10.getText());
            System.out.println("P10.isDisplayed() = " + P10.isDisplayed());

            //1- We can locate Jason, go to parent row, and come back in the same row to get "Due" cell
                //table[@id='table1']//tbody//td[.='Jason']/../td[4]

            //2- We can use the sibling method from xpath
                //table[@id='table1']//tbody//td[.='Tim']/following-sibling::td[2]

        //P11_ WRITE A LOCATOR THAT RETURNS Tim's last name  BASED ON tim's NAME
            //table[@id='table1']/tbody//td[.='Tim']/../td[1]
            //table[@id='table1']/tbody//td[.='Tim']/preceding-sibling::td

        //P12_ WRITE A LOCATOR THAT RETURNS ALL EMAILS THAT HAS $50 DUE DATE
            //table[@id='table1']/tbody//td[.='$50.00']/preceding-sibling::td[1]





    }


}
