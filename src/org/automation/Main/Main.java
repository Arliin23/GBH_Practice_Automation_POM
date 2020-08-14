package org.automation.Main;

import org.automation.POM.*;
import org.openqa.selenium.WebDriver;

public class Main {

    private static WebDriver driver; private static HomePage homepage; private static InnovationPage innovationPage;
    private static ItBusinessTransPage itBusinessTransPage; private static CustomSoftDevPage customSoftDevPage;
    private static AgentChangeStaffPage agentChangeStaffPage; private static ItFoundationPage itFoundationPage;
    private static ItProtectionSecurityPage itProtectionSecurityPage;


    public static  void main(String[] args) {

        //HomePage
        //Create instance of Chrome and Visit GBH Page
        driver = homepage.chromeDriver();
        homepage = new HomePage(driver);
        homepage.visitPage("https://gbh.com.do/es/");
        //Confirm you are in the Home Page
        System.out.print(homepage.confirmHomePage());
        //go to innovation page
        homepage.goNextPage();

        //Innovation Page
        //Confirm you are in the Innovation Page
        innovationPage = new InnovationPage(driver);
        Print(innovationPage.confirmInnovationPage());
        //go to IT Business Transformation page
        innovationPage.goNextPage();

        //IT Business Transformation page
        //Confirm you are in the IT Business Transformation page
        itBusinessTransPage = new ItBusinessTransPage(driver);
        Print(itBusinessTransPage.confirmItTransPage());
        //go to Custom Software Development page
        itBusinessTransPage.goNextPage();

        //Software Development page
        //Confirm you are in the Software Development page
        customSoftDevPage = new CustomSoftDevPage(driver);
        Print(customSoftDevPage.confirmCusSoftDevPage());
        //go to Agent of Change Staff Augmentation page
        customSoftDevPage.goNextPage();

        //Agent of Change Staff Augmentation page
        //Confirm you are in the Agent of Change Staff Augmentation page
        agentChangeStaffPage = new AgentChangeStaffPage(driver);
        Print(agentChangeStaffPage.confirmAgentChangeStaffPage());
        //go to IT Foundation Page
        agentChangeStaffPage.goNextPage();

        //IT Foundation Page
        //Confirm you are in the IT Foundation Page
        itFoundationPage = new ItFoundationPage(driver);
        Print(itFoundationPage.confirmItFoundationPage());
        //go to It Protection & Security Page
        itFoundationPage.goNextPage();

        //It Protection & Security Page
        //Confirm you are in the It Protection & Security Page
        itProtectionSecurityPage = new ItProtectionSecurityPage(driver);
        Print(itProtectionSecurityPage.confirmItProtectionSecurityPage());
        //Go to It Support Service
        itProtectionSecurityPage.goNextPage();

        //Support Service
        //Confirm you are in the It Protection & Security Page

        //homepage.closeBrowser();



    }

    //Method for print
    private static void Print(String print){
        System.out.print(print);
    }

}
