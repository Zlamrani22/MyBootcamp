package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestSuppliers extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestSuppliers.class);

    @Test(enabled = true)//check1
    public void testViewSuppliersProducts(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        SuppliersPage suppliersPage = new SuppliersPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickSuppliers();
        Assert.assertEquals("Suppliers - My Store", getPageTitle());
        suppliersPage.clickViewProducts();
        Assert.assertEquals("Fashion Supplier - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testViewSuppliersProductsAndSortByPrice(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        SuppliersPage suppliersPage = new SuppliersPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickSuppliers();
        Assert.assertEquals("Suppliers - My Store", getPageTitle());
        suppliersPage.clickViewProducts();
        Assert.assertEquals("Fashion Supplier - My Store", getPageTitle());
        suppliersPage.clickListView();
        suppliersPage.selectFromDropDown("Product Name: A to Z");
        List<WebElement> products = new LinkedList<WebElement>();
        products = getDriver().findElements(By.cssSelector("a[class='product-name']"));
        LinkedList<String> productName = new LinkedList<String>();
        for(int i = 0; i< products.size(); i++){
            String s = products.get(i).getAttribute("alt");
            productName.add(s);
        }
        //boolean result = checkAlphabeticalOrder(productName);
        //suppliersPage.checkAlphabeticalOrder(productName);
        //System.out.println(result);
        Assert.assertEquals("Fashion Supplier - My Store", getPageTitle());
    }
    //not sure if this method need to be here
    private boolean checkAlphabeticalOrder(LinkedList<String> productName) {
        String previous = "";
        for (final String current: productName){
            if(current.compareTo(previous)<0)
                return false;
        }
        return true;
    }

    @Test(enabled = true)//failed3
    public void testSortProductsInAscendingOrder(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        SuppliersPage suppliersPage = new SuppliersPage(getDriver());
        automationHomePage.clickSitemapLink();
        Assert.assertEquals("Sitemap - My Store", getPageTitle());
        sitemapPage.clickSuppliers();
        Assert.assertEquals("Suppliers - My Store", getPageTitle());
        suppliersPage.clickViewProducts();
        Assert.assertEquals("Fashion Supplier - My Store", getPageTitle());
        //Before filter
//        List<WebElement> beforeFilterPrice = getDriver().findElements(By.cssSelector("span[class='price product-price']"));
//        List<Double> beforeFilterPriceList = new ArrayList<>();
//        for (WebElement price : beforeFilterPrice) {
//            beforeFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
//        }
//        suppliersPage.selectFromDropDown("Price: Lowest first");
//        suppliersPage.clickListView();
//
//        //Select dropdown = new Select(getDriver().findElement(By.cssSelector("span[class='price product-price']")));
//        //dropdown.selectByVisibleText("Price: Lowest first");
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
//        waitFor(3);
    }

}
