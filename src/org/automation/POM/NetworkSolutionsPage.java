package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetworkSolutionsPage extends Base{

    //Locator of Elements
    static By quienesSomosLocator = By.cssSelector("#menu-item-4132 > a > span.menu-item__text");
    static By sobreNosotrosLocator = By.cssSelector("#menu-item-4133 > a > span.menu-item__text");

    //Constructor
    public NetworkSolutionsPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Network Solutions Page
    public static String confirmNetworkSolutionsPage(){
        String title = getTitle();
        if(title.contains("Network Solutions")){
            return "Estás en la página de Network Solutions\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnQuienesSomos= findElement(quienesSomosLocator);
        WebElement btnSobreNosotros = findElement(sobreNosotrosLocator);
        waitElement(btnQuienesSomos);
        hoverLists(btnQuienesSomos);
        waitElement(btnSobreNosotros);
        clickElement(btnSobreNosotros);
    }

}
