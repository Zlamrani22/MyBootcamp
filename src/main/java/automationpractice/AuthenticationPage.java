package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AuthenticationPage.class);

    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement loginButton;

    @FindBy(css = "input[id='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement loginSubmitButton;

    @FindBy(css = "a[title='Recover your forgotten password']")
    public WebElement forgotPasswordLink;

    //Create an Account Region

    @FindBy(css = "input[id='email_create']")
    public WebElement registerEmailInputField;

    @FindBy(css = "button[class='btn btn-default button button-medium exclusive']")
    public WebElement createAnAccountButton;

    @FindBy(css = "input[id='id_gender2']")
    public WebElement mrsRadioButton;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    public WebElement firstNameInputField;

    @FindBy(css = "input[id='customer_lastname']")
    public WebElement lastNameInputField;

    @FindBy(css = "input[id='passwd']")
    public WebElement newAccountPasswordInputField;

    @FindBy(css = "select[id='days']")
    public WebElement dateOfBirthDayComboBox;

    @FindBy(css = "select[name='months']")
    public WebElement dateOfBirthMonthComboBox;

    @FindBy(css = "select[id='years']")
    public WebElement dateOfBirthYearComboBox;

    @FindBy(css = "input[id='newsletter']")
    public WebElement newsletterCheckBox;

    @FindBy(css = "input[id='address1']")
    public WebElement streetAddressInputField;

    @FindBy(css = "input[id='city']")
    public WebElement cityInputField;

    @FindBy(css = "select[name='id_state']")
    public WebElement stateComboBox;

    @FindBy(css = "input[id='postcode']")
    public WebElement zipCodeInputField;

    @FindBy(css = "input[id='phone_mobile']")
    public WebElement mobilePhoneNumberInputField;

    @FindBy(css = "button[id='submitAccount']")
    public WebElement registerButton;
    //End Region

    public AuthenticationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        click(loginButton);
        LOG.info("Clicked login button successfully");
    }

    public void typeEmailInputField(String emailAddress){
        type(emailInputField, emailAddress);
        LOG.info("Email entered successfully");
    }

    public void typePasswordInputField(String password){
        type(passwordInputField, password);
        LOG.info("Password entered successfully");
    }

    public MyAccountPage clickLoginSubmitButton(){
        click(loginSubmitButton);
        LOG.info("Clicked on submit login button successfully");
        return new MyAccountPage(getDriver());
    }

    public ForgotPasswordPage clickForgotPasswordLink(){
        click(forgotPasswordLink);
        LOG.info("clicked forgot password successfully");
        return new ForgotPasswordPage(getDriver());
    }

    //Create an Account Methods Region

    public void typeEmailToCreateAnAccount(String registerEmail){
        type(registerEmailInputField, registerEmail);
        LOG.info("Email entered successfully");
    }

    public void clickCreateAnAccount(){
        click(createAnAccountButton);
        LOG.info("Clicked on create na account button successfully");
    }

    public void clickMrsRadioButton(){
        click(mrsRadioButton);
        LOG.info("Clicked on Mrs radio button successfully");
    }

    public void typeFirstName(String firstName){
        type(firstNameInputField, firstName);
        LOG.info("First name entered successfully");
    }

    public void typeLastName(String lastName){
        type(lastNameInputField, lastName);
        LOG.info("Last name entered successfully");
    }

    public void typeNewAccountPassword(String password){
        type(newAccountPasswordInputField, password);
        LOG.info("Password entered successfully");
    }

    public void selectDateOfBirthDay(String day) {
        if (Integer.parseInt(day) > 0 && Integer.parseInt(day) <= 31) {
            selectFromDropdown(dateOfBirthDayComboBox, day);
            LOG.info("Date of birth day selected successfully");
        }
    }

    public void selectDateOfBirthMonth(String monthNumber) {
        if (Integer.parseInt(monthNumber) > 0 && Integer.parseInt(monthNumber) <= 12) {
            selectFromDropdown(dateOfBirthMonthComboBox, monthNumber);
            LOG.info("Date of birth month selected successfully");
        }
    }

    public void selectDateOfBirthYear(String year) {
        if (Integer.parseInt(year) >= 1900 && Integer.parseInt(year) <= 2022) {
            selectFromDropdown(dateOfBirthYearComboBox, year);
            LOG.info("Date of birth year selected successfully");
        }
    }

    public void clickNewsletterCheckBox() {
        click(newsletterCheckBox);
        LOG.info("Checked newsletter check box successfully");
    }

    public void typeStreetAddress(String streetAddress) {
        type(streetAddressInputField, streetAddress);
        LOG.info("Street address entered successfully");
    }

    public void typeCity(String city) {
        type(cityInputField, city);
        LOG.info("City entered successfully");
    }

    public void selectState(String state) {
        selectFromDropdown(stateComboBox, state);
        LOG.info("State selected successfully");
    }

    public void typeZipCode(String zipCode) {
        type(zipCodeInputField, zipCode);
        LOG.info("Zip code entered successfully");
    }

    public void typeMobilePhoneNumber(String phoneNumber) {
        type(mobilePhoneNumberInputField, phoneNumber);
        LOG.info("Phone number entered successfully");
    }

    public void clickRegisterButton() {
        click(registerButton);
        LOG.info("Clicked register successfully");
    }
    //End Region

}
