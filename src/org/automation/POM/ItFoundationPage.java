package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItFoundationPage extends Base{

    //Locators of elements
    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By itSupportService = By.cssSelector("#menu-item-4143 > a > span.menu-item__text");
    static By itProtectionSecurityLocator = By.cssSelector("#menu-item-4144 > a > span.menu-item__text");

    //Constructor
    public ItFoundationPage(WebDriver driver) { super(driver);}

    //Method to confirm that you are in the IT Foundation Page
    public static String confirmItFoundationPage(){
        String title = getTitle();
        if(title.contains("Soporte de TI")){
            return "Estás en la página de Soporte de TI\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnItSupportService = findElement(itSupportService);
        WebElement btnItProtectionSecurity = findElement(itProtectionSecurityLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnItSupportService);
        clickElement(btnItSupportService);
        waitElement(btnItProtectionSecurity);
        clickElement(btnItProtectionSecurity);
    }

}
