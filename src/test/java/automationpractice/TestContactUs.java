package automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestContactUs.class);

    @Test(enabled = true)//check1
    public void testContactUs() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        automationHomePage.clickContactUsButton();
        contactUsPage.selectFromSubjectHeadingDropdown();
        contactUsPage.typeEmailAddress("tadefi_01@yahoo.fr");
        contactUsPage.typeOrderRefNumber("123456F");
        contactUsPage.typeInTextArea("This an automation test");
        contactUsPage.clickSendButton();
        String expectedPageTitle = "Contact us - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
