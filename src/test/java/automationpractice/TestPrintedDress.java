package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestPrintedDress extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestPrintedDress.class);

    @Test(enabled = true)//check1
    public void testAddToCartBackToContinueShopping() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        PrintedDressPage printedDressPage = new PrintedDressPage(getDriver());
        automationHomePage.clickWomenLink();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickFashionManufacturerCheckBox();
        Assert.assertEquals("Women - My Store", getPageTitle());
        womenPage.clickAddToCartButton();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        System.out.println("Successfully switched to child window" + childWindow);
        waitFor(5);
        String expectedPageTitle = "Women > Size S > Color Blue > Manufacturer Fashion Manufacturer - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        printedDressPage.clickContinueShopping();
    }
    //Was not able to run again, reached limit :(
    @Test(enabled = true)//check2
    public void testIncreaseItemQuantity(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrintedDressPage printedDressPage = new PrintedDressPage(getDriver());
        automationHomePage.clickPrintedDress();
        Assert.assertEquals("Printed Dress - My Store", getPageTitle());
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        //printedDressPage.clickIncreaseQuantity();
        printedDressPage.clickAddToCart();
        Assert.assertEquals("Printed Dress - My Store", getPageTitle());
    }

}
