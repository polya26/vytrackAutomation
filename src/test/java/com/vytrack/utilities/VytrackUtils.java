package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VytrackUtils {


    public static void login(String username, String password){

        //go to website
        //pass username and password
        //click login button
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
         Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(username);
         Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);
         Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void loginAsDriver(){

        //go to website
        //pass username and password
        //click login button
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void loginAsStoreManager(){
        //go to website
        //pass username and password
        //click login button
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();


    }

    public static void loginAsSalesManager(){
        //go to website
        //pass username and password
        //click login button
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }











}
