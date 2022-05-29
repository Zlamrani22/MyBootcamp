package amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {


    @Test
    public void test1(){
        type("#twotabsearchtextbox", "java book");
        click("#nav-search-submit-button");
        String expectedJavaPageTitle = "Amazon.com : java book";
        Assert.assertEquals(expectedJavaPageTitle, getPageTitle());
    }

    @Test
    public void test2(){
        typeAndEnter("#twotabsearchtextbox", "selenium book");
        String expectedSeleniumPageTitle = "Amazon.com : selenium book";
        Assert.assertEquals(expectedSeleniumPageTitle, getPageTitle());
    }

    @Test
    public void test3(){
        type("#twotabsearchtextbox", "junit book");
        click("#nav-search-submit-button");
        String expectedJunitPageTitle = "Amazon.com : junit book";
        Assert.assertEquals(expectedJunitPageTitle, getPageTitle());
    }

}
