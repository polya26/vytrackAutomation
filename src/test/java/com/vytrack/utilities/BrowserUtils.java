package com.vytrack.utilities;

// In this class only general Utility methods that are not related to some specific page

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

//  This method will accept int (in seconds) and execute Thread.sleep for given duration

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {


        }
    }


    //. When method is called, it should switch window and verify title. Accept 3 arguments( 1. webDriver,
    //2.expectedInUrl if url contains given String. if condition match , will break the loop
    //3. expectedTitle  to be compared against actualTitle
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }

// Assert:Title contains expectedInTitle
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }


// this method accept a String "expectedTitle" and Asserts if it is true

    public static void verifyTitle(WebDriver driver, String expectedTitle) {

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }




}

