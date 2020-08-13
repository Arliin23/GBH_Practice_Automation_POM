package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private WebDriver driver;

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

}
