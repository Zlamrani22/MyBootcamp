package amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

public class SearchTest extends CommonAPI {


    @Test
    public void test1(){
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.searchElement("java book");
        homePage.clickSearchBtn();
        String expectedJavaPageTitle = "Amazon.com : java book";
        Assert.assertEquals(expectedJavaPageTitle, searchResultPage.getSearchPageTitle());
    }

    @Test
    public void test2(){
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.searchElementAndEnter("selenium book");
        String expectedSeleniumPageTitle = "Amazon.com : selenium book";
        Assert.assertEquals(expectedSeleniumPageTitle, searchResultPage.getSearchPageTitle());
    }

    @Test
    public void test3(){
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.searchElement("junit book");
        homePage.clickSearchBtn();
        String expectedJunitPageTitle = "Amazon.com : junit book";
        Assert.assertEquals(expectedJunitPageTitle, searchResultPage.getSearchPageTitle());
    }

}
