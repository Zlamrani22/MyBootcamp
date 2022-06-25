package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestWomen extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestWomen.class);

    @Test(enabled = true)//check1
    public void testCloseWindowPopup() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        womenPage.clickList();
        womenPage.clickFadedShortSleeveTShirt();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        womenPage.clickFadedShortSleeveTShirtRightArrow();
        womenPage.clickBlueColoredFadedShortSleeveTShirt();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        System.out.println("Successfully switched to child window" + childWindow);
        waitFor(5);
        womenPage.clickClose();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testVerifyPrintedChiffonDress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickGreenColorprintedChiffonDress();
        Assert.assertEquals("Printed Chiffon Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testModifyCompositionToCotton() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickCottonCompositionCheckBox();
        womenPage.clickWhiteColorBlouse();
        String expectedPageTitle = "Blouse - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testSummerDresses() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickDresses();
        womenPage.clickSummerDresses();
        Assert.assertEquals("Summer Dresses - My Store", getPageTitle());
        womenPage.clickMaxiDressCheckBox();
        womenPage.clickOrangeColorPrintedSummerDress();
        String expectedPageTitle = "Summer Dresses > Properties Maxi Dress - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check5
    public void testColorfulDress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickColorfulDressCheckBox();
        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check6
    public void testAvailabilityInStock() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickInStockCheckBox();
        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check7
    public void testConditionNew() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickNewLink();
        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check8
    public void testPinterest(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomen();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickTopsCheckBox();
        womenPage.clickBlouseImage();
        //womenPage.clickPinterestLink();
        Assert.assertEquals("Tops - My Store", getPageTitle());
    }
    //this test case passed with only left slider working, try to set the right side
    @Test(enabled = true)//failed9
    public void testSetPriceSlider() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomen();
        //womenPage.setPriceSlider(20.00);
        Actions move = new Actions(getDriver());
        Actions actions = new Actions(getDriver());
        waitFor(5);
        Action action = move.dragAndDropBy(womenPage.priceSliderHandleLeft, 35, 0).build();
        waitFor(5);
        actions.dragAndDropBy(womenPage.priceSliderHandleRight, -20, 0).build();
       //ction.perform();
        Assert.assertEquals("Women - My Store", getPageTitle());
    }
}
