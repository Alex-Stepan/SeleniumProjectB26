package com.cydeo.test.day15_upload_action;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P15_fileUpload_test extends TestBase {

    @Test
    public void fileUpload_test() throws InterruptedException {
        driver.get("https://practice.cydeo.com/upload");

        String filePath = "\"C:\\Users\\Alex PC\\Desktop\\IMG_7995.png\"";

        Thread.sleep(3000);

        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        Thread.sleep(3000);

        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

    }


}
