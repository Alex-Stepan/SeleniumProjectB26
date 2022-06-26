package com.cydeo.test.extra_Tasks;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_GasMileage extends TestBase {

    /**
     * Task #: Gas Mileage Calculator Automation Test
     *
     *  1. Add a new class GasMileageCalculatorTest
     *  2. Go to https://www.calculator.net
     *  3. Search for “gas mileage” using search box
     *  4. Click on the “Gas Mileage Calculator” link
     *  5. On Next page verify:
     *      a. Title equals: “Gas Mileage Calculator”
     *      b. “Gas Mileage Calculator” label is displayed
     *  6. Locate, clear and type “7925” into “Current odometer” field
     *  7. Locate, clear and type “7550” into “Previous odometer” field
     *  8. Locate, clear and type “16” into “Gas added” field
     *  9. Locate, clear and type “3.55” into “Gas price” field
     *  10. Click on Calculate button
     *  11. Verify mpg value is as expected: Expected value: “23.44 mpg”
     */

    @Test
    public void Gas_Mileage_Calculator_Automation_Test() throws InterruptedException {

        //2. Go to https://www.calculator.net
            driver.get("https://www.calculator.net");

        //3. Search for “gas mileage” using search box
            WebElement searchBox = driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
            searchBox.click();
            searchBox.sendKeys("gas mileage");

        //4. Click on the “Gas Mileage Calculator” link
            driver.findElement(By.partialLinkText("Gas Mileage Calculator")).click();

        //5. On Next page verify:
            //5.1. Title equals: “Gas Mileage Calculator”
                Thread.sleep(3000);
                BrowserUtils.verifyTitle(driver, "Gas Mileage Calculator");

            //5.2. “Gas Mileage Calculator” label is displayed
                WebElement GasMileageCalc_Label = driver.findElement(By.xpath("//div[@id='content']//h1"));
                Assert.assertTrue(GasMileageCalc_Label.isDisplayed(), "The \"Gas Mileage Calculator\" is NOT displayed - FAIL");

        //6. Locate, clear and type “7925” into “Current odometer” field
            WebElement td_CurrentOdomRead = driver.findElement(By.xpath("//table[@id='standard']//input[@id='uscodreading']"));
            td_CurrentOdomRead.clear();
            td_CurrentOdomRead.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field
            WebElement td_PrevOdomRead = driver.findElement(By.xpath("//table[@id='standard']//input[@id='uspodreading']"));
            td_PrevOdomRead.clear();
            td_PrevOdomRead.sendKeys("7550");

        //8. Locate, clear and type “16” into “Gas added” field
            WebElement td_GasAdded = driver.findElement(By.xpath("//table[@id='standard']//input[@id='usgasputin']"));
            td_GasAdded.clear();
            td_GasAdded.sendKeys("16");

        //9. Locate, clear and type “3.55” into “Gas price” field
            WebElement td_GasPrice = driver.findElement(By.xpath("//table[@id='standard']//input[@id='usgasprice']"));
            td_GasPrice.clear();
            td_GasPrice.sendKeys("3.55");

        //10. Click on Calculate button
            Thread.sleep(3000);

            driver.findElement(By.xpath("//table[@id='standard']//input[@value='Calculate']")).click();

        //11. Verify mpg value is as expected: Expected value: “23.44 mpg”
            String actResult = driver.findElement(By.xpath("//div[@id='content']//font//b")).getText();
            String expResult = "23.44 mpg";

            Assert.assertEquals(actResult, expResult, "The result is not matching - FAIL");


    }



}
