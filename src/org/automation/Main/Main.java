package org.automation.Main;

import org.automation.POM.HomePage;
import org.automation.POM.InnovationPage;
import org.automation.POM.ItBusinessTransPage;
import org.openqa.selenium.WebDriver;

public class Main {

    private static WebDriver driver;
    private static HomePage homepage;
    private static InnovationPage innovationPage;
    private static ItBusinessTransPage itBusinessTransPage;

    public static  void main(String[] args) {

        //HomePage

        //Create instance of Chrome and Visit GBH Page
        driver = homepage.chromeDriver();
        homepage = new HomePage(driver);
        homepage.visitPage("https://gbh.com.do/es/");
        //Confirm you are in the Home Page
        System.out.print(homepage.confirmHomePage());
        //
        //go to innovation page
        homepage.goNextPage();

        //Innovation Page
        //Confirm you are in the Innovation Page
        innovationPage = new InnovationPage(driver);
        System.out.print(innovationPage.confirmInnovationPage());
        //go to IT Business Transformation page
        innovationPage.goNextPage();

        //IT Business Transformation page
        //Confirm you are in the IT Business Transformation page
        itBusinessTransPage = new ItBusinessTransPage(driver);
        System.out.print(itBusinessTransPage.confirmItTransPage());
        //go to Custom Software Development page
        itBusinessTransPage.goNextPage();

        //homepage.closeBrowser();



    }
}
