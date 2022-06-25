package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestLogin.class);

    @Test(enabled = true)//check1
    public void testCreateWishList() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickMyWishlistLink();
        Assert.assertEquals("My Store", getPageTitle());
        loginPage.typeMyWishlistName("Wish2");
        loginPage.clickSaveButton();
        String expectedPageTitle = "My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testOrderHistory() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickOrderHistoryDetails();
        String expectedPageTitle = "Order history - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testVerifyMoreForPrintedSummerDrees() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickWomen();
        loginPage.clickPrintedSummerDressMore();
        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testRegisterForNewsletter() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.typeNewsletterEmailInputField("tadefi_01@yahoo.fr");
        loginPage.clickNewsletterButton();
        String expectedPageTitle = "My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testCheckSignOutFunctionality() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSignOut();
        String expectedPageTitle = "Login - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check6
    public void testVerifyAboutUsPage(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickAboutUsButton();
        String expectedPageTitle = "About us - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check7
    public void testCheckOurStores(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickOurStores();
        String expectedPageTitle = "Stores - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check8
    public void testCheckTermsAndConditions(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickTermsAndConditions();
        String expectedPageTitle = "Terms and conditions of use - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check9
    public void testCheckSitemap(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        String expectedPageTitle = "Sitemap - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check10
    public void testCheckSuppliers(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        sitemapPage.clickSuppliers();
        String expectedPageTitle = "Suppliers - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}