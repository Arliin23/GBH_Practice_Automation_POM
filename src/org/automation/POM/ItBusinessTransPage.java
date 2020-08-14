package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItBusinessTransPage extends Base{
    static By solutionBtn = By.cssSelector("#menu-item-4135 > a > span.menu-item__text");
    static By cusSoftDevBtn = By.cssSelector("#menu-item-4141 > a > span.menu-item__text");

    public ItBusinessTransPage(WebDriver driver) {
        super(driver);
    }

    //Method to confirm that you are in the It Business Transformation Page
    public static String confirmItTransPage(){
        String title = getTitle();
        if (title.contains("VCIO")) {
            return "Estas en la página de It Business Transformation\n";
        } else {
            return "No se encontro el título\n";
        }
    }

    public static void goNextPage(){
        WebElement btnSolution = findElement(solutionBtn);
        WebElement btncusSoftDev = findElement(cusSoftDevBtn);
        waitElement(btnSolution);
        hoverLists(btnSolution);
        waitElement(btncusSoftDev);
        clickElement(btncusSoftDev);
    }



}
