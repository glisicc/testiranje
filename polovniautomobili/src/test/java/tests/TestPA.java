package tests;

import main.MainMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProtonMail;

public class TestPA extends MainMethods {

    HomePage homePage = new HomePage();
    ProtonMail protonMail = new ProtonMail();


    @BeforeClass
    public void setUp(){
        createDriver();
        openApplication("https://www.polovniautomobili.com/");
    }

    @org.testng.annotations.Test
    public void polovniAutomobiliTest() throws Exception {

        createReport("Probni test 1");

        homePage.clickOnPostaviOglas()
        .clickOnRegistrujSe()
        .typeEmail("email")
        .typePassword("password_first", "glisiccPass")
        .typePassword("password_second", "glisiccPass")
        .clickCheckBox("tos")
        .clickCheckBox("easySaleConsent")
        .clickCheckBox("easyBuyConsent")
        .clickRegistrujSe()
        .verifyPotvrda();

        openApplication("https://mail.protonmail.com/login");

        protonMail.input("username", "glisicc")
        .input("password", "ujjEE.DMb35AUBk")
        .clickLogin()
        .verifyPotvrda()
        .clickOnMail()
        .clickOnLink()
        .insertData("first_name","Stefan")
        .insertData("last_name","Glisic")
        .insertData("address","ulica bb")
        .insertData("city","Kragujevac")
        .clickCity()
        .insertData("cellphone","0600123456")
        .clickSacuvaj()
        .verifyUspesno()
        .clickMenu()
        .logout()
        ;

    }



    @AfterClass
    public void close(){
       quitDriver();
    }

}
