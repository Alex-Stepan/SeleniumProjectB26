package com.NextBaseCRM.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    /** ADD METHODS: */


    /** 1. Switches to new window by the exact title. Returns to original window if target title not found */
//    public static void switchToWindow(String targetTitle) {
//        String origin = Driver.getDriver().getWindowHandle();
//        for (String handle : Driver.getDriver().getWindowHandles()) {
//            Driver.getDriver().switchTo().window(handle);
//            if (Driver.getDriver().getTitle().equals(targetTitle)) {
//                return;
//            }
//        }
//        Driver.getDriver().switchTo().window(origin);
//    }


    /** 2. Return a list of string from a list of elements */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    /** 3. Performs a pause */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//    /** 4. Waits for element matching the locator to be visible on the page */
//    public static WebElement waitForVisibility(By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }


//    /** 5. Scrolls down to an element using JavaScript */
//    public static void scrollToElement(WebElement element) {
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//    }


    /** 6. Selects with visibleText */
    public static void selectByVisibleText(WebElement elementDropdown, String visibleText) {
        Select dropdown = new Select(elementDropdown);
        dropdown.selectByVisibleText(visibleText);
    }


    /** 7. Checks element is displayed */
    public static boolean elementIsDisplayed(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (!element.isDisplayed()) {
                System.err.println(element.getText() + " is not displayed");
                return false;
            }
        }
        return true;
    }


//    /** 8. Check Element is not Located */
//    public static boolean waitForElementIsNotLocated(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
//        try {
//            wait.until(ExpectedConditions.visibilityOf(element));
//            return true;
//        } catch (TimeoutException e) {
//            System.err.println("Create Car button does not exist");
//        }
//        return false;
//    }


//    /** 9. returns random number between a to b */
//    public static int randomNumber(int a, int b) {
//        return new Faker().number().numberBetween(a, b);
//    }


//    /** 10. click all unchecked boxes */
//    public static boolean getIsCheck(List<WebElement> allCheckboxes,WebElement nextButton){
//        boolean flag = true;
//        String str = "";
//        do{ str = Driver.getDriver().getCurrentUrl();
//            for (WebElement checkbox : allCheckboxes) {
//                if(!checkbox.isSelected()) {
//                    flag = false;
//                    break;
//                }
//            }
//            nextButton.click();
//            DriverUtilities.waitFor(2);
//        }
//        while(!Driver.getDriver().getCurrentUrl().equals(str));
//        return flag;
//    }

    /** Verify Title on Authorization Page */
    public static void authorizationPage_TitleVerification(WebDriver driver) {
        String act_Title = driver.getTitle();
        String exp_Title = "Authorization";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Authorization page PASS");
        } else {
            System.out.println("Verification the Authorization page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }

    /** Verify Title on Get Password Page */
    public static void getPasswordPage_TitleVerification(WebDriver driver) {
        String act_Title = driver.getTitle();
        String exp_Title = "Get Password";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Get Password page PASS");
        } else {
            System.out.println("Verification the Get Password page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }

    /** Terminating Test */
    public static void terminatingTest() {
        System.out.println("------------------------------------------------------");
        System.out.println("Testing is complete!");
        System.out.println("======================================================");
    }

}
