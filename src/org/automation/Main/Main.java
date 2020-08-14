package org.automation.Main;

import org.automation.POM.*;
import org.openqa.selenium.WebDriver;

public class Main {

    private static WebDriver driver; private static HomePage homepage; private static InnovationPage innovationPage;
    private static ItBusinessTransPage itBusinessTransPage; private static CustomSoftDevPage customSoftDevPage;
    private static AgentChangeStaffPage agentChangeStaffPage; private static ItFoundationPage itFoundationPage;
    private static SupportServicePage supportServicePage; private static NetworkSolutionsPage networkSolutionsPage;
    private static AboutUsPage aboutUsPage; private static LoQueNosDifPage loQueNosDifPage;
    private static BlogPage blogPage; private static CaseStudiesPage caseStudiesPage; private static JobPage jobPage;
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
        supportServicePage = new SupportServicePage(driver);
        Print(supportServicePage.confirmSupportServicePage());
        //Go to Network Solutions Page
        supportServicePage.goNextPage();

        //Network Solutions Page
        //Confirm you are in the Network Solutions Page
        networkSolutionsPage = new NetworkSolutionsPage(driver);
        Print(networkSolutionsPage.confirmNetworkSolutionsPage());
        //Go to About Us Page
        networkSolutionsPage.goNextPage();

        //About Us Page
        //Confirm your are in the About Us Page
        aboutUsPage = new AboutUsPage(driver);
        Print(aboutUsPage.confirmAboutUsPage());
        //Go to Lo que nos diferencia Page
        aboutUsPage.goNextPage();

        //Lo que nos diferencia Page
        //Confirm you are in the Lo que nos diferencia Page
        loQueNosDifPage = new LoQueNosDifPage(driver);
        Print(loQueNosDifPage.confirmLoQueNosDifPage());
        //Go to  Blog Page
        loQueNosDifPage.goNextPage();

        //Blog Page
        //Confirm you are in the Blog Page
        blogPage = new BlogPage(driver);
        Print(blogPage.confirmBlogPage());
        //Go to Casos de Estudio Page
        blogPage.goNextPage();

        //Casos de Estudio Page
        //Confirm you are in the Casos de Estudio Page
        caseStudiesPage = new CaseStudiesPage(driver);
        Print(caseStudiesPage.confirmCaseStudiesPage());
        //Go to Job Page
        caseStudiesPage.goNextPage();

        //Empleos
        //Confirm you are in the Job Page
        jobPage = new JobPage(driver);
        Print(jobPage.confirmJobPage());

        //Cerrar Navegador
        homepage.closeBrowser();
    }

    //Method for print
    private static void Print(String print){
        System.out.print(print);
    }

}
