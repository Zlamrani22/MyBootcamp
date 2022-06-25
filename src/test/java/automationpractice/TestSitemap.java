package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestSitemap extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestSitemap.class);

    @Test(enabled = true)//check1
    public void testCheckManufacturers(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickManufacturers();
        String expectedPageTitle = "Manufacturers - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testCheckPriceDrop(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickPriceDrop();
        String expectedPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testCheckMyAddresses(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickMyAddressesLink();
        String expectedPageTitle = "Addresses - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testCheckNewProducts(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickNewProducts();
        String expectedPageTitle = "New products - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testCheckAllSpecials(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickAllSpecials();
        String expectedPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check6
    public void testCheckLegalNotice(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickLegalNotice();
        String expectedPageTitle = "Legal Notice - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check7
    public void testManagePersonalInformation(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickPersonalInformation();
        String expectedPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check8
    public void testAddSocialTitle(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickPersonalInformation();
        Assert.assertEquals("Identity - My Store", getPageTitle());
        sitemapPage.clickSocialTitleRadioButton();
        sitemapPage.typeCurrentPassword("tadefi2022");
        sitemapPage.clickSaveSubmitIdentity();
        String expectedPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check9
    public void testSecurePayment(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickSecurePaymentLink();
        String expectedPageTitle = "Secure payment - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check10
    public void testFaceBook(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        loginPage.clickSitemap();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickFacebookButton();
        String expectedPageTitle = "Sitemap - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check11
    public void testAuthenticationFromSitemap(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickAuthenticationLink();
        Assert.assertEquals("Login - My Store", getPageTitle());
    }
    @Test(enabled = true)//check12
    public void testCreateNewAccountFromSitemap(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickCreateNewAccount();
        Assert.assertEquals("Login - My Store", getPageTitle());
    }
    @Test(enabled = true)//check13
    public void testCheckBestSellers(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickBestSellers();
        Assert.assertEquals("Best sales - My Store", getPageTitle());
    }
    @Test(enabled = true)//check14
    public void testCheckGoBackToHomePage(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickHomeLink();
        Assert.assertEquals("- My Store", getPageTitle());
    }
    @Test(enabled = true)//check15
    public void testCheckDeliveries(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
    }
    @Test(enabled = true)//check16
    public void testCheckTwitterFromDeliveries(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
        sitemapPage.clickTwitter();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        LOG.info("Switched to child window success");
        waitFor(3);
        getDriver().switchTo().window(getDriver().getWindowHandle());
        Assert.assertEquals("Selenium Framework (@seleniumfrmwrk) / Twitter", getPageTitle());
    }
    @Test(enabled = true)//check17
    public void testCheckYoutubeFromDeliveries(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
        sitemapPage.clickYoutube();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        LOG.info("Switched to child window success");
        waitFor(3);
        getDriver().switchTo().window(getDriver().getWindowHandle());
        Assert.assertEquals("Selenium Framework - YouTube", getPageTitle());
    }
    @Test(enabled = true)//check18
    public void testCheckGoogleFromDeliveries(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
        sitemapPage.clickGooglePlus();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        LOG.info("Switched to child window success");
        waitFor(3);
        getDriver().switchTo().window(getDriver().getWindowHandle());
        Assert.assertEquals("Sign in - Google Accounts", getPageTitle());
    }

}
