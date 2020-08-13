package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public Base(WebDriver driver){
        this.driver = driver;
    }

    //Method for calling the chromedriver
    public WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //Method for wrap findElement
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    //Method for get Titles
    public String getTitle(){
    return driver.getTitle();
    }


    //Method for wait for a element to appear
    public void waitElement(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
