package tests;

import main.MainMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Checkout;
import pages.Login;
import pages.Shop;

public class TEST_SHOP extends MainMethods {

    Login login = new Login();
    Shop shop = new Shop();
    Checkout checkout = new Checkout();

    @BeforeClass
    public void setUp(){
        createDriver();
        openApplication("https://www.saucedemo.com/");
    }

    @org.testng.annotations.Test
    public void test04(){

        createReport("Test 4");

        login.refreshLoginPage()
                .enterLoginData("user-name", "standard_user")
                .enterLoginData("password", "secret_sauce")
                .clickOnLogin();

        shop.verifyThatElementsTitleIsVisible("Sauce Labs Bike Light").
                verifyThatElementsTitleIsVisible("Sauce Labs Bike Light").
                verifyThatElementsTitleIsVisible("Sauce Labs Bolt T-Shirt").
                verifyThatElementsTitleIsVisible("Sauce Labs Fleece Jacket").
                verifyThatElementsTitleIsVisible("Sauce Labs Onesie").
                verifyThatElementsTitleIsVisible("Test.allTheThings() T-Shirt (Red)").
                verifyThatShoppingCartIsEmpty().
                clickOnAdd().
                oneItemIsAdded().
                clickOnCart().
                clickOnChekout();

        checkout.enterCheckoutData("first-name", "Stefan").
                enterCheckoutData("last-name", "Glisic").
                enterCheckoutData("postal-code", "34313").
                clickOnConitnue().
                //verifyTotal().
                clickFinish().
                thankYou();

    }

    @org.testng.annotations.Test
    public void test01(){

        createReport("Test 1");

        login.clickOnLogin()
        .verifyThatElementsTitleIsVisible("Epic sadface");

    }
    @org.testng.annotations.Test
    public void test02(){

        createReport("Test 2");

        login.enterLoginData("user-name", "standard_user")
             .clickOnLogin()
             .verifyThatElementsTitleIsVisible("Epic sadface");

    }
    @org.testng.annotations.Test
    public void test03(){

        createReport("Test 3");

        login.refreshLoginPage()
                .enterLoginData("user-name", "standard")
                .enterLoginData("password", "secret_sauce")
                .clickOnLogin()
                .verifyThatElementsTitleIsVisible("Epic sadface");

    }


    @AfterClass
    public void close(){
        quitDriver();
    }

}
