package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import java.util.Set;

public class TestAutomationHomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestAutomationHomePage.class);

    @Test(enabled = true)//check1
    public void testWebsiteLogo() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.typeSearchInputField("gloves");
        automationHomePage.clickSearchButton();
        Assert.assertEquals("Search - My Store", getPageTitle());
        automationHomePage.clickYourLogoLogo();
        String expectedPageTitle = "My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testVerifySignInFunctionality(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickSignIn();
        String expectedPageTitle = "Login - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testSearchFunctionality(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        automationHomePage.typeSearchInputField("shoes");
        automationHomePage.clickSearchButton();
        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testSearchInvalidClothingItem() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.typeSearchInputField("Jeans");
        automationHomePage.clickSearchButton();
        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testBestSellers() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickBestSellers();
        Assert.assertEquals("My Store", getPageTitle());
        automationHomePage.clickSunglassesAndEyewear();
        String expectedPageTitle = "Create and build your online business with PrestaShop";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check6
    public void testSummerCollection() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        automationHomePage.clickSummerCollection();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        prestaShopPage.clickCreateMyStore();
        String expectedPageTitle = "Download PrestaShop and develop your online business";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check7
    public void testSendToAFriend() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
        automationHomePage.clickFadedShortSleeveTShirts();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        automationHomePage.clickBlueColor();
        automationHomePage.clickSendToAFriend();
        String expectedPageTitle = "Faded Short Sleeve T-shirts - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check8
    public void testSendToARealFriendRoman() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
        automationHomePage.clickFadedShortSleeveTShirts();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        automationHomePage.clickBlueColor();
        automationHomePage.clickSendToAFriend();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        String parentWindowHandle = getDriver().getWindowHandle();
        System.out.println("Parent window handle: " + parentWindowHandle);
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String handle: windowHandles){
            if(!handle.equals(parentWindowHandle)){
                getDriver().switchTo().window(handle);
                waitFor(10);
                System.out.println("New window title: " + getDriver().getTitle());
            }
        }
        automationHomePage.typeNameOfYourFriend("Roman");
        automationHomePage.typeFriendEmailAddress("romang@gmail.com");
        automationHomePage.clickSendEmail();
        String expectedPageTitle = "Faded Short Sleeve T-shirts - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check9
    public void testDelivery() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
        automationHomePage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
    }
    @Test(enabled = true)//check10
    public void testSendAnEmailToSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
        automationHomePage.clickSupportEmail();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
    }
    @Test(enabled = true)//check11
    public void testMyCreditSlips() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickMyCreditSlips();
        Assert.assertEquals("Login - My Store", getPageTitle());
    }
}
