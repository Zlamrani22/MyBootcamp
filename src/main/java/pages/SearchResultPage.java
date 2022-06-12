package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchResultPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchResultPage.class);

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getSearchPageTitle(){
        return getPageTitle();
    }
}
