package com.NextBaseCRM.testFeatures;

import com.NextBaseCRM.utilities.Driver;
import com.NextBaseCRM.utilities.Login_Credentials;
import com.NextBaseCRM.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class US001_TC01_TC02_TC03_Login_AllCorrect {

        /**
         * USER STORY 001 - Login Functionality for NextBaseCRM
         *
         *  Test Cases 01-03
         *  Login with correct Username and correct Password to HelpDesk Home page
         *  Login with correct Username and correct Password to Marketing Home page
         *  Login with correct Username and correct Password to HR Home page
         *
         *
         *  Steps:
         *      Given I am on "Authorization" Page
         *      When I input helpdesk correct username
         *      And I input helpdesk correct password
         *      And I click Login button
         *      Then I should navigate to Helpdesk/Marketing/HR home page
         */

    /** Main method */
    public static void main(String[] args) throws InterruptedException {

        //------------------------------------------------------//

        //1. Ext: create an object from Driver class
            WebDriver driver = Driver.getWebDriver();

        //2. navigate to
            driver.get("http://login2.nextbasecrm.com");

        //3. Ext: verify if you are on Authorization Page, use method
            Utility.authorizationPage_TitleVerification(driver);

        //------------------------------------------------------//

        //4. ArrayList with correct Usernames
        ArrayList<String> UsernameList = Login_Credentials.getCorrectUsernameList();

        //------------------------------------------------------//

        //5.
        Actions action = new Actions(driver);

        //6.
        ArrayList<String> titlesList = new ArrayList<>();

        //7. Loop
        for (int i = 0;  i < UsernameList.size();  i++) {


            //7.1. Navigate to LoginBox & input username from the List:
                // Login Box for username
                //WebElement LoginBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
                WebElement LoginBox = driver.findElement(By.cssSelector("input[type='text']"));

                //find the Login Box
                action.moveToElement(LoginBox).click().perform();
                // Select All & Delete
                action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
                    Utility.waitFor(3);
                // input username from loop
                action.sendKeys(UsernameList.get(i)).perform();
                    Utility.waitFor(3);

            //7.2. Navigate to PasswordBox & input password:
                // Password Box for password
                //WebElement PasswordBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
                WebElement PasswordBox = driver.findElement(By.cssSelector("input[type='password']"));

            // move to password
                action.click(PasswordBox).doubleClick().sendKeys(Keys.DELETE).perform();
                    Utility.waitFor(3);
                action.sendKeys("UserUser").perform();

            //7.3. Navigate to Login Button & click()
                // Login Button
                //WebElement LoginBttn = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
                WebElement LoginBttn = driver.findElement(By.cssSelector("input.login-btn"));
                // click()
                action.click(LoginBttn).perform();
                    Utility.waitFor(3);

            //7.4. Collect titles:
                String titleObject = driver.getTitle();
                titlesList.add(titleObject);

            //7.5. Logout process
                // WebElement - Drop List
                //WebElement FunctionalityList = driver.findElement(By.id("user-block"));
                WebElement FunctionalityList = driver.findElement(By.cssSelector("span.user-name"));

            //
                action.moveToElement(FunctionalityList).click().perform();
                    Utility.waitFor(3);
                // Logout Button
                //WebElement LogOutBtn = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"));
                WebElement LogOutBtn = driver.findElement(By.linkText("Log out"));
                //
                action.moveToElement(LogOutBtn).click().perform();
                    Utility.waitFor(3);

            //7.6. report
            System.out.println("# " + (i+1) + " Login Functionality to page for   " + UsernameList.get(i) + "   is Verified!");
            System.out.println("\tTitle of the page is:  " + titleObject);
        }


        //8. print out the List of titles
            System.out.println("------------------------------------------------------\nTotal verified " + titlesList.size() + " pages");
            System.out.println("List of the titles: " + titlesList);

        //9. reporting about termination of the Testing
            System.out.println("------------------------------------------------------");
            System.out.println("Testing is complete!");
            System.out.println("======================================================");

        //10. Ext. quit()
        Driver.quit(driver);

    }



}
