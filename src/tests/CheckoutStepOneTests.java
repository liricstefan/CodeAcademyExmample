package tests;

import org.junit.Test;

import pages.CartPage;
import pages.CheckoutStepOnePage;
import pages.LoginPage;
import pages.ProductsListPage;

public class CheckoutStepOneTests extends BaseTest{
    String validName = "John";
    String validLastname = "McClean";
    String validPostalCode = "11250";
    String expectedNameError = "Error: First Name is required";

    @Test
    public void verifyNameFieldIsRequired(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutStepOnePage checkoutStepOne = new CheckoutStepOnePage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.addProductToCart();
        productsPage.navigateToCart();
        cartPage.proceedToCheckout();
        checkoutStepOne.fillOutForm("", validLastname, validPostalCode);
        checkoutStepOne.submitForm();
        checkoutStepOne.validateFormError(expectedNameError);
    }
    
}
