package com.cydeo.test.day15_upload_action;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T15_2_Guru99_upload_test {

    /**
     * TC : Guru99 Upload Test
     *
     *  1. Go to “http://demo.guru99.com/test/upload”
     *  2. Upload file into Choose File
     *  3. Click terms of servide check box
     *  4. Click Submit File button
     *  5. Verify expected message appeared. Expected: “1 file has been successfully uploaded.”
     */

    @Test
    public void uploadFile_test() throws InterruptedException {

        //1. Go to “http://demo.guru99.com/test/upload”
            Driver.getDriver().get(ConfigurationReader.getProperty("guru99.upload.url"));

        //2. Upload file into Choose File
            WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
            String uploadPath = "C:\\Users\\Alex PC\\Desktop\\IMG_7995.png";
            chooseFile.sendKeys(uploadPath);

        //3. Click terms of service check box
            WebElement termsOfService = Driver.getDriver().findElement(By.id("terms"));
            termsOfService.click();

        //4. Click Submit File button
            WebElement submitFileBtn = Driver.getDriver().findElement(By.id("submitbutton"));
            submitFileBtn.click();

        //5. Verify expected message appeared. Expected: “1 file has been successfully uploaded.”
            String actMessage = Driver.getDriver().findElement(By.id("res")).getText();
            String expMessage = "1 file\nhas been successfully uploaded.";

            Thread.sleep(3000);
            Assert.assertEquals(actMessage, expMessage, "Result is not matching - FAIL");

            //
            Driver.closeDriver();


    }


}
