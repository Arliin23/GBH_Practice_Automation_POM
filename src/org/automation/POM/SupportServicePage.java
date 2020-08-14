package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportServicePage extends Base{

    //Locator of Elements
    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By itNetworkSolutionsLocator = By.cssSelector("#menu-item-4160 > a > span.menu-item__text");

    //Constructor
    public SupportServicePage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Support Service Page
    public static String confirmSupportServicePage(){
        String title = getTitle();
        if(title.contains("Servicios de soporte de TI")){
            return "Estás en la página de Servicios de soporte de TI\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnitNetworkSolutions = findElement(itNetworkSolutionsLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnitNetworkSolutions);
        clickElement(btnitNetworkSolutions);
    }
}
