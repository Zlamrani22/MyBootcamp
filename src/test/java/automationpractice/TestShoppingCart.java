package automationpractice;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestShoppingCart.class);

    //this particular test has different issues everytime it gets run, they get fixed and
    //again the next time it runs will show different issues, such as staleElementException
    //and elementClickInterceptedException.
    @Test(enabled = true) //check1
    public void testAddItemsToCartOpenProceedToCheckOut() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickCartButton();
        Assert.assertEquals("Order - My Store", getPageTitle());
        shoppingCartPage.clickDressesButton();
        //shoppingCartPage.clickCasualDressesButton();
        shoppingCartPage.clickGirlyStyleCheckBox();
        shoppingCartPage.clickPrintedDressGirlyStyle();
        Assert.assertEquals("Printed Dress - My Store", getPageTitle());
        shoppingCartPage.clickAddToCartButton();
        //shoppingCartPage.clickProceedToCheckout();
        Assert.assertEquals("Printed Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testContactPrestaShopSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        automationHomePage.clickWomensCoatsAndJacketsButton();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        prestaShopPage.clickSupportLink();
        Assert.assertEquals("PrestaShop Support", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testProcessShoppingCart() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickCartButton();
        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true) //check4
    public void testAddItemsToCart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        shoppingCartPage.clickDressesButton();
        Assert.assertEquals("Dresses - My Store", getPageTitle());
        shoppingCartPage.checkSmallCheckBox();
        shoppingCartPage.clickPrintedDressButton();
        //shoppingCartPage.clickAddToCartButton();
        Assert.assertEquals("Dresses - My Store", getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testWomenCoatsAndJackets() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomensCoatsAndJacketsPage womensCoatsAndJacketsPage = new WomensCoatsAndJacketsPage(getDriver());
        automationHomePage.clickWomensCoatsAndJacketsButton();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
    }
}

