package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomSoftDevPage extends Base{

    //Locators of elements
    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By agentChangeStaffLocator = By.cssSelector("#menu-item-4142 > a > span.menu-item__text");

    //Constructor
    public CustomSoftDevPage(WebDriver driver) {
        super(driver);
    }

    //Method to confirm that you are in the Custom Software Dev Page
    public static String confirmCusSoftDevPage(){
        String title = getTitle();
        if(title.contains("Custom Software Development")){
            return "Estás en la página de Custom Software Development\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnagentChangeStaff = findElement(agentChangeStaffLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnagentChangeStaff);
        clickElement(btnagentChangeStaff);
    }


}
