package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ContactUsPage.class);

    @FindBy(xpath = "//select[@id='id_contact']")
    public WebElement subjectHeadingDropdown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressInputField;

    @FindBy(xpath = "//*[@id='id_order']")
    public WebElement orderRefNumberInputField;

    @FindBy (xpath = "//*[@id='message']")
    public WebElement textArea;

    @FindBy(css = "button[id='submitMessage']")
    public WebElement sendButton;

    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectFromSubjectHeadingDropdown(){
        click(subjectHeadingDropdown);
        LOG.info("Subject Heading selected successfully");
    }

    public void typeEmailAddress(String emailAddress){
        type(emailAddressInputField, emailAddress);
        LOG.info("Email Address entered successfully");
    }

    public void typeOrderRefNumber(String orderRefNumber){
        type(orderRefNumberInputField, orderRefNumber);
        LOG.info("Order reference number entered successfully");
    }

    public void typeInTextArea(String text){
        type(textArea, text);
        LOG.info("Typed text in the text area successfully");
    }

    public void clickSendButton(){
        click(sendButton);
        LOG.info("Clicked on the send button successfully");
    }

}
