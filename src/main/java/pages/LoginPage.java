package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(css = ".a-form-label")
    private WebElement headerText;

    @FindBy(xpath = "//*[@class='a-icon a-icon-logo']")
    private WebElement amazonLogo;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText(){
        return getElementText(headerText);
    }

    public boolean checkLogoIsPresent(){
        return isPresent(amazonLogo);
    }
}
