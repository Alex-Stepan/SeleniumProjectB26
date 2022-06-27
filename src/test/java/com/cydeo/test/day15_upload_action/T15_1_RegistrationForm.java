package com.cydeo.test.day15_upload_action;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T15_1_RegistrationForm {

    /**
     * TC#1: Registration form confirmation
     *
     *  Note: Use JavaFaker OR read from configuration.properties file when possible.
     *  1. Open browser
     *  2. Go to website: https://practice.cydeo.com/registration_form
     *  3. Enter first name
     *  4. Enter last name
     *  5. Enter username
     *  6. Enter email address
     *  7. Enter password
     *  8. Enter phone number
     *  9. Select a gender from radio buttons
     *  10. Enter date of birth
     *  11. Select Department/Office
     *  12. Select Job Title
     *  13. Select programming language from checkboxes
     *  14. Click to sign up button
     *  15. Verify success message “You’ve successfully completed registration.” is displayed.
     *
     *      Note:
     *      1. Use new Driver utility class and method
     *      2. User JavaFaker when possible
     *      3. User ConfigurationReader when it makes sense
     */


    @Test
    public void registration_form_test(){

            //Note: Use JavaFaker OR read from configuration.properties file when possible.

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
            Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //create faker object
            Faker faker = new Faker();

        //3. Enter first name
            WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
            firstname.sendKeys(faker.name().firstName());

        //4. Enter last name
            WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
            lastname.sendKeys(faker.name().lastName());

        //5. Enter username
            WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
            username.sendKeys(faker.name().username());

        //6. Enter email address
            WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
            email.sendKeys(faker.internet().emailAddress());

        //7. Enter password
            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
            password.sendKeys(faker.internet().password());

        //8. Enter phone number
            Driver.getDriver().findElement(By.xpath("//input[@name='phone']"))
                    .sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
            Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();

        //10. Enter date of birth
            Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"))
                    .sendKeys(faker.numerify("##/##/####"));

        //11. Select Department/Office
            Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
            office.selectByIndex(faker.number().numberBetween(1, 9));

        //12. Select Job Title
            Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
            jobTitle.selectByIndex(faker.number().numberBetween(1, 9));

        //13. Select programming language from checkboxes
            Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();

        //14. Click to sign up button
            Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']")).click();

        //15. Verify success message “You’ve successfully completed registration.” is displayed.




            Driver.closeDriver();

    }



}
