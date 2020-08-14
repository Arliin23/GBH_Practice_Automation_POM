package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private static WebDriver driver;
    private static WebDriverWait wait;

    //Constructor
    public Base(WebDriver driver){
        this.driver = driver;
    }

    //Method for calling the chromedriver
    public static WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //Method to open the page
    public static void visitPage(String URL){
        driver.get(URL);
    }

    //Mehotd to close broser
    public static void closeBrowser(){
        driver.quit();
    }

    //Method for wrap Click
    public static void clickElement(WebElement element){
        element.click();
    }

    //Method for wrap findElement
    public static WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    //Method for get Titles
    public static String getTitle(){
    return driver.getTitle();
    }

    //Method to wait for a element to appear
    public static void waitElement(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Method for hover
    public static void hoverLists(WebElement button){
        //hover Action
        Actions action = new Actions(driver);
        action.moveToElement(button).perform();
    }


}
