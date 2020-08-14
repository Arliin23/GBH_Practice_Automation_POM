package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends Base{

    //Locator of Elements
    static By quienesSomosLocator = By.cssSelector("#menu-item-4132 > a > span.menu-item__text");
    static By loQueNosDiferenciaLocator = By.cssSelector("#menu-item-4134 > a > span.menu-item__text");

    //Constructor
    public AboutUsPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the About Us Page
    public static String confirmAboutUsPage(){
        String title = getTitle();
        if(title.contains("Sobre Nosotros")){
            return "Estás en la página Sobre Nosotros\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnQuienesSomos= findElement(quienesSomosLocator);
        WebElement btnloQueNosDiferencia = findElement(loQueNosDiferenciaLocator);
        waitElement(btnQuienesSomos);
        hoverLists(btnQuienesSomos);
        waitElement(btnloQueNosDiferencia);
        clickElement(btnloQueNosDiferencia);
    }


}
