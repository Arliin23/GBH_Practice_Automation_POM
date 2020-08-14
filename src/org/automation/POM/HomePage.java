package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Base{

    //Locators of elements
    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By innovationSquadLocator = By.cssSelector("#menu-item-4139 > a > span.menu-item__text");

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Method to confirm that you are in the Homepage
    public static String confirmHomePage(){
        String title = getTitle();
        if(title.contains("GBH")){
            return "Estás en la página de inicio\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnInnovationSquad = findElement(innovationSquadLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnInnovationSquad);
        clickElement(btnInnovationSquad);
    }

}
