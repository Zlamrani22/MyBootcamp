package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMyWishlist extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestMyWishlist.class);

    @Test(enabled = true)//check1
    public void testAddNewWishlist() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        myWishlistPage.typeNewWishlistName("Whispers");
        myWishlistPage.clickSave();
        Assert.assertEquals("My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testBackToYourAccount() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        myWishlistPage.clickBackToYourAccount();
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testAddItemsToWishlist() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("green dress");
        myAccountPage.clickSearchButton();
        Assert.assertEquals("Search - My Store", getPageTitle());
        myAccountPage.clickListButton();
        myWishlistPage.clickPrintedChiffonDress();
        Assert.assertEquals("Printed Chiffon Dress - My Store", getPageTitle());
        myWishlistPage.clickAddToWishlist();
        Assert.assertEquals("Printed Chiffon Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testGoBackToHomePage() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        Assert.assertEquals("My Store", getPageTitle());
        myWishlistPage.clickRemoveIcon();
        getDriver().switchTo().alert().dismiss();
        myWishlistPage.clickHome();
        Assert.assertEquals("My Store", getPageTitle());
    }
    }
