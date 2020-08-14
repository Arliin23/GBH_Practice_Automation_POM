package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaseStudiesPage extends Base{

    //Locator of Elements
    static By empleosLocator = By.cssSelector("#menu-item-2980 > a > span.menu-item__text");

   //Constructor
    public CaseStudiesPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Case Studies Page
    public static String confirmCaseStudiesPage(){
        String title = getTitle();
        if(title.contains("Casos de estudios")){
            return "Estás en la página de Casos de estudios\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnEmpleos= findElement(empleosLocator);
        waitElement(btnEmpleos);
        clickElement(btnEmpleos);
    }

}
