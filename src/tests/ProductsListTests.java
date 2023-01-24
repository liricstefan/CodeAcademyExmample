package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import pages.LoginPage;
import pages.ProductsListPage;

public class ProductsListTests extends BaseTest {
    int expectedNumberOfProducts = 6;
    String sortAtoZ = "az";
    String sortAtoZFirstItemName = "Sauce Labs Backpack";
    String sortZtoA = "za";
    String sortZtoAFirstItemName = "Test.allTheThings() T-Shirt (Red)";
    String sortLowTOHighItemPrice = "lohi";
    String sortLowToHighFirstItemName = "Sauce Labs Onesie";
    String sortHighToLowItemPrice = "hilo";
    String sortHighToLowFirstItemName = "Sauce Labs Fleece Jacket";
    @Test
    public void verifyNumberOfProducts(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.verifyNumberOfProducts(expectedNumberOfProducts);
    }
    @Test
    public void verifySortAtoZ(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortAtoZ);
        productPage.verifyFirstItemName(sortAtoZFirstItemName);
    }
    @Test
    public void verifySortZtoA(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortZtoA);
        productPage.verifyFirstItemName(sortZtoAFirstItemName);
    }
    @Test
    public void verifyLowtoHoigh(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsListPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortHighToLow);
        productPage.verifyFirstItemPrice(sortHighToLowItemPrice);

    }
        



}
