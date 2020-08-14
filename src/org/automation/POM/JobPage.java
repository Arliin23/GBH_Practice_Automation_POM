package org.automation.POM;

import org.openqa.selenium.WebDriver;

public class JobPage extends Base{
    //Constructor
    public JobPage(WebDriver driver) {super(driver);}

    //Method to confirm that you are in the Case Studies Page
    public static String confirmJobPage(){
        String title = getTitle();
        if(title.contains("Empleos")){
            return "Estás en la página de Empleos\n";
        }else{

            return "No se encontro el título\n";
        }
    }
}
