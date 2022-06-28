package com.cydeo.test.day16_Actions_JSExecuter;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T16_Guru99_DragAndDrop_test {

    /**
     * TC : Guru99 Drag and Drop Test
     *
     *  1- Open a chrome browser
     *  2- Go to: https://demo.guru99.com/test/drag_drop.html
     *  3- Drag “BANK” and drop into Account area under Debit Side
     *  4- Drag “5000” and drop into Amount area under Debit Side
     *  5- Drag “SALES” and drop into Account area under Credit Side
     *  6- Drag “5000” and drop into Amount area under Credit Side
     *  7- Verify “Perfect!” text displayed.
     */

    @Test
    public void guru99_drugAndDrop_test(){

        //1- Open a chrome browser
        //2- Go to: https://demo.guru99.com/test/drag_drop.html
            Driver.getDriver().get(ConfigurationReader.getProperty("guru99.dragAndDrop"));

        //3- Drag “BANK” and drop into Account area under Debit Side
            WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
            WebElement debitAccount = Driver.getDriver().findElement(By.id("shoppingCart1"));

            Actions action = new Actions(Driver.getDriver());

            action.dragAndDrop(bank,debitAccount).pause(2000).perform();


        //4- Drag “5000” and drop into Amount area under Debit Side
            WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
            WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

            action.dragAndDrop(fiveK, debitAmount).pause(2000).perform();

        //5- Drag “SALES” and drop into Account area under Credit Side
            WebElement sales = Driver.getDriver().findElement(By.partialLinkText("SALES"));
            WebElement creditAccount = Driver.getDriver().findElement(By.xpath("//ol[@id='loan']//li"));

            action.dragAndDrop(sales, creditAccount).pause(2000).perform();

        //6- Drag “5000” and drop into Amount area under Credit Side
            WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));

            action.dragAndDrop(fiveK, creditAmount).pause(2000).perform();

        //7- Verify “Perfect!” text displayed.
            WebElement perfectInfo = Driver.getDriver().findElement(By.partialLinkText("Perfect!"));

            Assert.assertTrue(perfectInfo.isDisplayed(), "The Perfect! is not displayed - FAIL");

        //close
            Driver.closeDriver();






    }



}
