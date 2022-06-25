package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestAuthentication.class);

    @Test(enabled = true)//check1
    public void testAuthenticateWithValidCredentials() {
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        String expectedAccountPageTitle = "My account - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testForgotPassword() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.clickForgotPasswordLink();
        Assert.assertEquals("Forgot your password - My Store", getPageTitle());
        forgotPasswordPage.clickBackToLogin();
        Assert.assertEquals("Login - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testRetrievePassword() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.clickForgotPasswordLink();
        Assert.assertEquals("Forgot your password - My Store", getPageTitle());
        forgotPasswordPage.typeEmailAddress("tadefi_01@yahoo.fr");
        forgotPasswordPage.clickRetrievePassword();
        String actualText = getDriver().findElement(By.cssSelector("p[class='alert alert-success']")).getText();
        String expectedText = "A confirmation email has been sent to your address: tadefi_01@yahoo.fr";
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(enabled = true)//check4
    public void testCreateAnAccountWithExistingEmail(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailToCreateAnAccount("tadefi_01@yahoo.fr");
        authenticationPage.clickCreateAnAccount();
        String expectedText = "";
        String actualText = getDriver().findElement(By.xpath("//*[@id='create_account_error']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(enabled = true)//check5
    public void testCreateNewAccount(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailToCreateAnAccount("zainamila@yahoo.com");
        authenticationPage.clickCreateAnAccount();
        authenticationPage.clickMrsRadioButton();
        authenticationPage.typeFirstName("Zaina");
        authenticationPage.typeLastName("Mila");
        authenticationPage.typeNewAccountPassword("zainamila");
        authenticationPage.selectDateOfBirthDay("10");
        authenticationPage.selectDateOfBirthMonth("9");
        authenticationPage.selectDateOfBirthYear("2004");
        authenticationPage.clickNewsletterCheckBox();
        authenticationPage.typeStreetAddress("74 Bancroft Road");
        authenticationPage.typeCity("Walnut Creek");
        authenticationPage.selectState("California");
        authenticationPage.typeZipCode("94581");
        authenticationPage.typeMobilePhoneNumber("9257460732");
        authenticationPage.clickRegisterButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
}
