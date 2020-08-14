package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Base{

    static By solutionBtn = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By innovationSquadBtn = By.cssSelector("#menu-item-4139 > a > span.menu-item__text");

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

    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionBtn);
        WebElement btnInnovationSquad = findElement(innovationSquadBtn);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnInnovationSquad);
        clickElement(btnInnovationSquad);
    }

}
