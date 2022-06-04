package amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class FloatingMenuTest extends CommonAPI {

    @Test
    public void floatingMenu(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.hoverOverFloatingMenu(driver);
        homePage.clickOnLoginBtn();
        String text = loginPage.getHeaderText();
        Assert.assertEquals("Email or mobile phone number", text);
    }
}
