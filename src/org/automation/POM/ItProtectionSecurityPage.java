package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItProtectionSecurityPage extends Base{

    //Locator of elements
    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By itSupportService = By.cssSelector("#menu-item-4143 > a > span.menu-item__text");
    static By comparacionProductosLocator = By.cssSelector("#menu-item-4145 > a > span.menu-item__text");

    //Constructor
    public ItProtectionSecurityPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the IT Security & Protection Page
    public static String confirmItProtectionSecurityPage(){
        String title = getTitle();
        if(title.contains("IT Protection & Support")){
            return "Estás en la página de IT Protection & Support\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnItSupportService = findElement(itSupportService);
        WebElement btncomparacionProductos = findElement(comparacionProductosLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnItSupportService);
        clickElement(btnItSupportService);
        waitElement(btncomparacionProductos);
        clickElement(btncomparacionProductos);
    }

}
