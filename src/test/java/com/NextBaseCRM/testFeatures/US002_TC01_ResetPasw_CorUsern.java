package com.NextBaseCRM.testFeatures;

import com.NextBaseCRM.utilities.Driver;
import com.NextBaseCRM.utilities.Login_Credentials;
import com.NextBaseCRM.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class US002_TC01_ResetPasw_CorUsern {

    /**
     * USER STORY 002 - Reset Password Functionality
     *
     *  Test Cases 01
     *  Reset Password by using Correct Username
     *
     *      Given I am on Authorization Page
     *      When clicking on the link: Forgot Your Password
     *      And navigating to page: Get Password
     *      Then input the Correct username in the Login Box
     *      And clicking on the button: Reset Password
     *      Then should see note: A code to reset your password...
     */

    public static void main(String[] args) {

        //------------------------------------------------------//

        //1. Ext: create an object from Driver class
        WebDriver driver = Driver.getWebDriver();

        //2. navigate to
        driver.get("http://login2.nextbasecrm.com");

        //3. Ext: verify if you are on Authorization Page, use method
        Utility.authorizationPage_TitleVerification(driver);

        //------------------------------------------------------//

        //4. clicking on the link: Forgot Your Password
        WebElement ForgotPaswLink = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        ForgotPaswLink.click();
        Utility.waitFor(3);

        //5. navigating to page: Get Password
        Utility.getPasswordPage_TitleVerification(driver);

        //6. input the Correct username in the Login Box
        WebElement UserLoginInputBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        UserLoginInputBox.click();
        UserLoginInputBox.sendKeys((Keys.CONTROL), (Keys.chord("A")), (Keys.DELETE));

        Random randomize = new Random();
        UserLoginInputBox.sendKeys(Login_Credentials.getCorrectUsernameList().get(0));
        Utility.waitFor(3);

        //7. clicking on the button: Reset Password
        WebElement ResetPaswBtn = driver.findElement(By.cssSelector("button[value='Reset password']"));

        ResetPaswBtn.click();
        Utility.waitFor(3);

        //8. Then should see note: A code to reset your password...
        WebElement noteResetPaswSent = driver.findElement(By.cssSelector("div.notetext"));

        String expNoteResetPaswSent = "A code to reset your password and your registration information" +
                " has just been sent to your e-mail address. Please check your e-mail. " +
                "Note that the reset code is re-generated on each request.";

        String actNoteResetPaswSent = noteResetPaswSent.getText();

        if (actNoteResetPaswSent.equals(expNoteResetPaswSent)){
            System.out.println("The verification for presence of the note: Reset Password Sent, PASSED!");
        } else {
            System.out.println("The verification for presence of the note: Reset Password Sent, FAILED!");
        }


        //9. reporting about termination of the Testing
        Utility.terminatingTest();

        //10. Ext. quit()
        Driver.quit(driver);

    }


}
