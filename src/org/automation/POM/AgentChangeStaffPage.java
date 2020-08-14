package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentChangeStaffPage extends Base{

    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By itSupportService = By.cssSelector("#menu-item-4143 > a > span.menu-item__text");
    static By itFoundationLocator = By.cssSelector("#menu-item-4146 > a > span.menu-item__text");

    //Constructor
    public AgentChangeStaffPage(WebDriver driver) { super(driver);}

    //Method to confirm that you are in the Agent of Change Staff Augmentation page
    public static String confirmAgentChangeStaffPage(){
        String title = getTitle();
        if(title.contains("Staff Augmentation")){
            return "Estás en la página de Agent of Change Staff Augmentation page\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnItSupportService = findElement(itSupportService);
        WebElement btnITFoundation = findElement(itFoundationLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnItSupportService);
        clickElement(btnItSupportService);
        waitElement(btnITFoundation);
        clickElement(btnITFoundation);
    }

}
