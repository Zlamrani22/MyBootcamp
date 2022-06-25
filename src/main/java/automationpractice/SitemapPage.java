package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SitemapPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SitemapPage.class);

    @FindBy(css = "a[title='View a list of suppliers']")
    public WebElement suppliersLink;

    @FindBy(css = "a[title='View a list of manufacturers']")
    public WebElement manufacturersLink;

    @FindBy(css = "a[title='View products with a price drop']")
    public WebElement priceDropsLink;

    @FindBy(css = "a[title='View a list of my addresses']")
    public WebElement myAddressesLink;

    @FindBy(css = "a[title='View a new product']")
    public WebElement newProductsLink;

    @FindBy(css = "a[title='All specials']")
    public WebElement allSpecialsButton;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[3]/a")
    public WebElement legalNoticeLink;

    @FindBy(css = "a[title='Manage your personal information']")
    public WebElement personalInformationLink;

    @FindBy(css = "input[id='id_gender2']")
    public WebElement socialTitleRadioButton;

    @FindBy(xpath = "//*[@id='old_passwd']")
    public WebElement currentPasswordInputField;

    @FindBy(css = "button[name='submitIdentity']")
    public WebElement saveSubmitIdentity;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[6]/a")
    public WebElement securePaymentLink;

    @FindBy(xpath = "//*[@id='social_block']//li[1]/a")
    public WebElement facebookButton;

    @FindBy(css = "a[title='Authentication']")
    public WebElement authenticationLink;

    @FindBy(css = "a[title='Create new account']")
    public WebElement createNewAccountLink;

    @FindBy(css = "a[title='View top-selling products']")
    public WebElement bestSellersLink;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[1]/a")
    public WebElement homeLink;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[2]/a")
    public WebElement deliveryLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/seleniumfrmwrk']")
    public WebElement twitterButton;

    @FindBy(css = "li[class='youtube']")
    public WebElement youtubeButton;

    @FindBy(css = "li[class='google-plus']")
    public WebElement googlePlusButton;

    public SitemapPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public SuppliersPage clickSuppliers() {
        click(suppliersLink);
        LOG.info("clicked on suppliers link successfully");
        return new SuppliersPage(getDriver());
    }

    public void clickManufacturers() {
        click(manufacturersLink);
        LOG.info("clicked on manufacturers link successfully");
    }

    public void clickPriceDrop() {
        click(priceDropsLink);
        LOG.info("clicked on price drop link successfully");
    }

    public void clickMyAddressesLink() {
        click(myAddressesLink);
        LOG.info("clicked on my addresses link successfully");
    }

    public void clickNewProducts() {
        click(newProductsLink);
        LOG.info("clicked on new products link successfully");
    }

    public void clickAllSpecials() {
        click(allSpecialsButton);
        LOG.info("clicked on all specials link successfully");
    }

    public void clickLegalNotice() {
        click(legalNoticeLink);
        LOG.info("clicked on lega notice link successfully");
    }

    public void clickPersonalInformation() {
        click(personalInformationLink);
        LOG.info("clicked on personal information link successfully");
    }

    public void clickSocialTitleRadioButton() {
        click(socialTitleRadioButton);
        LOG.info("clicked on social title radio button successfully");
    }

    public void typeCurrentPassword(String currentPassword) {
        type(currentPasswordInputField, currentPassword);
        LOG.info("Entered current password successfully");
    }

    public void clickSaveSubmitIdentity() {
        click(saveSubmitIdentity);
        LOG.info("clicked on save button successfully");
    }

    public void clickSecurePaymentLink() {
        click(securePaymentLink);
        LOG.info("clicked on secure payments link successfully");
    }

    public void clickFacebookButton() {
        click(facebookButton);
        LOG.info("clicked on facebook button successfully");
    }

    public LoginPage clickAuthenticationLink() {
        click(authenticationLink);
        LOG.info("clicked on authentication link successfully");
        return new LoginPage(getDriver());
    }

    public LoginPage clickCreateNewAccount() {
        click(createNewAccountLink);
        LOG.info("clicked on create new account link successfully");
        return new LoginPage(getDriver());
    }

    public void clickBestSellers() {
        click(bestSellersLink);
        LOG.info("clicked on best sellers link successfully");
    }

    public void clickHomeLink() {
        click(homeLink);
        LOG.info("clicked on home link successfully");
    }

    public void clickDeliveryLink() {
        click(deliveryLink);
        LOG.info("clicked on delivery link successfully");
    }

    public void clickTwitter() {
        click(twitterButton);
        LOG.info("clicked on twitter button successfully");
    }

    public void clickYoutube() {
        click(youtubeButton);
        LOG.info("clicked on youtube button successfully");
    }
    public void clickGooglePlus() {
        click(googlePlusButton);
        LOG.info("clicked on google plus button successfully");
    }
}
