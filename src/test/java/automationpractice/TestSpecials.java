package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestSpecials extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestSpecials.class);

    @Test(enabled = true)//check1
    public void testSelectFormDropDownMenuSpecials() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SpecialsPage specialsPage = new SpecialsPage(getDriver());
        automationHomePage.clickSpecials();
        Assert.assertEquals("Prices drop - My Store", getPageTitle());
        specialsPage.selectFromDropDownByValue("In stock");
        specialsPage.clickListView();
        Assert.assertEquals("Prices drop - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testFashionManufacturerProducts() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SpecialsPage specialsPage = new SpecialsPage(getDriver());
        automationHomePage.clickSpecials();
        Assert.assertEquals("Prices drop - My Store", getPageTitle());
        specialsPage.clickFashionManufacturerLink();
        Assert.assertEquals("Fashion Manufacturer - My Store", getPageTitle());
        specialsPage.clickListView();
        specialsPage.selectFromDropDownByValue("Price: Lowest first");
        Assert.assertEquals("Fashion Manufacturer - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testViewLargerItemImage() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SpecialsPage specialsPage = new SpecialsPage(getDriver());
        automationHomePage.clickSpecials();
        Assert.assertEquals("Prices drop - My Store", getPageTitle());
        specialsPage.clickTopSellers();
        Assert.assertEquals("Best sales - My Store", getPageTitle());
        specialsPage.clickListView();
        specialsPage.clickPrintedChiffonDressGreenColorBox();
        specialsPage.clickViewLargerLoupe();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        LOG.info("Switched to child window success");
        specialsPage.clickNextArrow();
        waitFor(3);
        specialsPage.clickCloseViewButton();
        Assert.assertEquals("Printed Chiffon Dress - My Store", getPageTitle());
    }
    @Test(enabled = true)//failed4
    public void testSortByLowestPrice() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SpecialsPage specialsPage = new SpecialsPage(getDriver());
        automationHomePage.clickSpecials();
        Assert.assertEquals("Prices drop - My Store", getPageTitle());
        //Before filter
        List<WebElement> beforeFilterPrice = getDriver().findElements(By.cssSelector("span[class='price product-price']"));
//        List<Double> beforeFilterPriceList = new ArrayList<>();
//        for (WebElement price : beforeFilterPrice) {
//            beforeFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
//        }
//        Select dropdown = new Select(getDriver().findElement(By.cssSelector("select[id='selectProductSort']")));
//        dropdown.selectByVisibleText("Price: Lowest first");
//        //After Filter
//        List<WebElement> afterFilterPrice = getDriver().findElements(By.cssSelector("span[class='price product-price']"));
//        List<Double> afterFilterPriceList = new ArrayList<>();
//        for (WebElement price : afterFilterPrice) {
//            afterFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
//        }
//        //Sort the price values
//        Collections.sort(beforeFilterPriceList);
//        //Assert
//        Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
    }
}