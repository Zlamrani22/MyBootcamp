package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgotPasswordPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ForgotPasswordPage.class);

    @FindBy(xpath = "//*[@id='center_column']/ul/li/a")
    public WebElement backToLoginButton;

    @FindBy(css = "input[class='form-control']")
    public WebElement emailAddressInputFieldToRetrievePassword;

    @FindBy(css = "button[class='btn btn-default button button-medium']")
    public WebElement retrievePasswordButton;

    public ForgotPasswordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickBackToLogin(){
        click(backToLoginButton);
        LOG.info("Click on back to login button success");
        return new LoginPage(getDriver());
    }

    public void typeEmailAddress(String email){
        type(emailAddressInputFieldToRetrievePassword, email);
        LOG.info("Email address typed successfully");
    }

    public void clickRetrievePassword(){
        click(retrievePasswordButton);
        LOG.info("Retrieve Button clicked successfully");
    }
}
