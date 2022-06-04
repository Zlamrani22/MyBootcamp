package amazon;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.HomePage;

public class DropdownTest extends CommonAPI {

    @Test
    public void selectBabyOption(){
        HomePage homePage = new HomePage(driver);
        homePage.searchElement("flash mcqueen cars");
        homePage.clickSearchBtn();
        homePage.selectOptionFromMenuDropdown("Baby");
        waitFor(5);
    }
}
