package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoQueNosDifPage extends Base{

    //Locator of Elements
    static By quienesSomosLocator = By.cssSelector("#menu-item-4132 > a > span.menu-item__text");
    static By blogLocator = By.cssSelector("#menu-item-4664 > a > span.menu-item__text");

    //Constructor
    public LoQueNosDifPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Lo que nos diferencia Page
    public static String confirmLoQueNosDifPage(){
        String title = getTitle();
        if(title.contains("Lo que nos diferencia")){
            return "Estás en la página Lo que nos diferencia\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnQuienesSomos= findElement(quienesSomosLocator);
        WebElement btnBlog = findElement(blogLocator);
        waitElement(btnQuienesSomos);
        hoverLists(btnQuienesSomos);
        waitElement(btnBlog);
        clickElement(btnBlog);
    }

}
