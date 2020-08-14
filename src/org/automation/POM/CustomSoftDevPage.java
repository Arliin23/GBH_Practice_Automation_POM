package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomSoftDevPage extends Base{

    static By solutionBtn = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By fBtn = By.cssSelector("#menu-item-4140 > a > span.menu-item__text");

    public CustomSoftDevPage(WebDriver driver) {
        super(driver);
    }




}
