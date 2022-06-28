package com.cydeo.test.day16_Actions_JSExecuter;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T16_Actions_Scroll {

    /**
     * TC #4: Scroll practice
     *
     *  1- Open a chrome browser
     *  2- Go to: https://practice.cydeo.com/
     *  3- Scroll down to “Powered by CYDEO”
     *  4- Scroll using Actions class “moveTo(element)” method
     *  5- Scroll back up to “Home” link using PageUP button
     */

    @Test
    public  void  actions_scroll_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
            Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));

        //3- Scroll down to “Powered by CYDEO”
            WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(cydeoLink).perform();

        //4- Scroll using Actions class “moveTo(element)” method

        //5- Scroll back up to “Home” link using PageUP button
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
            actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();



        //close

        Driver.closeDriver();


    }
}
