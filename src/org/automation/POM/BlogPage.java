package org.automation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends Base{

    //Locator of Elements
    static By casosEstudioLocator = By.cssSelector("#menu-item-2979 > a > span.menu-item__text");

    //Constructor
    public BlogPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Blog Page
    public static String confirmBlogPage(){
        String title = getTitle();
        if(title.contains("Blog")){
            return "Estás en la página Blog\n";
        }else{

            return "No se encontro el título\n";
        }
    }

    //Method to go to the Next Page
    public static void goNextPage(){
        WebElement btnCasosEstudio= findElement(casosEstudioLocator);
        waitElement(btnCasosEstudio);
        clickElement(btnCasosEstudio);
    }

}
