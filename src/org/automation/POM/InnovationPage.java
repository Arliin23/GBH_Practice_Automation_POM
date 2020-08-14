package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InnovationPage extends Base{

    static By solutionLocator = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By itBusTransfLocator = By.cssSelector("#menu-item-4140 > a > span.menu-item__text");

    public InnovationPage(WebDriver driver) {
        super(driver);
    }

    //Method to confirm that you are in the Innovation page
    public static String confirmInnovationPage(){
        String title = getTitle();
        if (title.contains("Innovation Squad")) {
            return "Estas en la página de Innovation Squad\n";
        } else {
            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionLocator);
        WebElement btnItBusTransf = findElement(itBusTransfLocator);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btnItBusTransf);
        clickElement(btnItBusTransf);
    }


}
