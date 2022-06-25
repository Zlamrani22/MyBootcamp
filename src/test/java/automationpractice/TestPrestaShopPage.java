package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestPrestaShopPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestPrestaShopPage.class);

    @Test(enabled = true)//check1
    public void testLiveDemo(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        automationHomePage.clickSaleImage();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        prestaShopPage.clickLiveDemo();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        Assert.assertEquals("", getPageTitle());
    }
}
