package amazon;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchTest.class);

    //@Test
    public void searchJavaBook(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("java book");
        homePage.clickSearchBtn();
        String expectedJavaPageTitle = "Amazon.com : java book";
        Assert.assertEquals(expectedJavaPageTitle, searchResultPage.getSearchPageTitle());
    }

    //@Test
    public void searchSeleniumBook(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElementAndEnter("selenium book");
        String expectedSeleniumPageTitle = "Amazon.com : selenium book";
        Assert.assertEquals(expectedSeleniumPageTitle, searchResultPage.getSearchPageTitle());
    }

    //@Test
    public void searchJunitBook(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("junit book");
        homePage.clickSearchBtn();
        String expectedJunitPageTitle = "Amazon.com : junit book";
        Assert.assertEquals(expectedJunitPageTitle, searchResultPage.getSearchPageTitle());
    }

//    public List<String> items(){
//        List<String> items = new ArrayList<>();
//        items.add("ps5");
//        items.add("mouse");
//        items.add("keyboard");
//        items.add("monitor");
//        items.add("ds");
//        return items;
//    }

    @Test
    public void searchMultipleItems(){
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"/data/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");
        HomePage homePage = new HomePage(getDriver());
        for (String item: items) {
            homePage.searchElementAndEnter(item);
            homePage.clearSearchField();
        }

    }

}
