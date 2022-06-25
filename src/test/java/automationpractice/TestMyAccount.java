package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class TestMyAccount extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestMyAccount.class);

    @Test(enabled = true)//check1
    public void testDeleteMyAddress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyAddresses();
        myAccountPage.clickDelete();
        getDriver().switchTo().alert().dismiss();
        Assert.assertEquals("Addresses - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testSearchMultipleItems() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir + "/src/test/resources/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("searchMultipleItems", "item");
        for (String item : items) {
            myAccountPage.searchElementAndEnter(item);
            myAccountPage.clearSearchInputField();
        }
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testWriteAReview() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("white dresses");
        myAccountPage.clickSearchButton();
        Assert.assertEquals("Search - My Store", getPageTitle());
        myAccountPage.clickListButton();
        myAccountPage.clickWhiteColorPrintedSummerDress();
        myAccountPage.clickWriteAReview();
        Assert.assertEquals("Printed Summer Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testPrintASelectedItem() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("hats");
        myAccountPage.clickSearchButton();
        Assert.assertEquals("Search - My Store", getPageTitle());
        myAccountPage.clickListButton();
        myAccountPage.clickBlueColorCheckBox();
        myAccountPage.clickPrintButton();
        Assert.assertEquals("Printed Summer Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testDisplayAllPictures() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("hats");
        myAccountPage.clickSearchButton();
        Assert.assertEquals("Search - My Store", getPageTitle());
        myAccountPage.clickListButton();
        myAccountPage.clickWhiteColorBlouse();
        Assert.assertEquals("Blouse - My Store", getPageTitle());
        myAccountPage.clickDisplayAllPicturesLink();
        Assert.assertEquals("Blouse - My Store", getPageTitle());
    }
    @Test(enabled = true)//check6
    public void testDeleteAWishlist() {
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
        Assert.assertEquals("My Store", getPageTitle());
    }
}