package amazon;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class DropdownTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);

    @Test(enabled = false)
    public void selectBabyOption(){
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElement("flash mcqueen cars");
        homePage.clickSearchBtn();
        homePage.selectOptionFromMenuDropdown("Baby");
        waitFor(5);
    }

    @Test(enabled = false)
    public void getDropdownList(){
        HomePage homePage = new HomePage(getDriver());
        for (String str:homePage.getHomePageDropdownOptions()) {
            LOG.info(str);
        }
    }
    @Test(enabled = false)
    public void selectKindleStoreOptionFromDropdown(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromMenuDropdownWithSelectOptions("Kindle Store");
        waitFor(5);
    }
    @Test
    public void selectAlexaSkillsOptionFromDropdown(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromMenuDropdownWithGivenText("Alexa Skills");
        waitFor(5);
    }
}
