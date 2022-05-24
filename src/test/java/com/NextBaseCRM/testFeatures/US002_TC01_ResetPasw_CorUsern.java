package com.NextBaseCRM.testFeatures;

import com.NextBaseCRM.utilities.Driver;
import com.NextBaseCRM.utilities.Utility;
import org.openqa.selenium.WebDriver;

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



    }


}
