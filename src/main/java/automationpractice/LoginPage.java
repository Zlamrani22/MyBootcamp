package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist']")
    public WebElement myWishlistLink;

    @FindBy(css = "input[id='name']")
    public WebElement myWishlistNameInputField;

    @FindBy(xpath = "//*[@id='center_column']//div[2]//ul//li/a/span")
    public WebElement myWishlistButton;

    @FindBy(css = "button[id='submitWishlist']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='center_column']//div[1]//ul//li[1]/a/span")
    public WebElement orderHistoryDetailsButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement womenButton;

    @FindBy(xpath = "//*[@id='center_column']//ul//li[5]//div[1]/div/a[1]/img")
    public WebElement printedSummerDressMoreButton;

    @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
    public WebElement writeAReviewLink;

    @FindBy(css = "input[class='inputNew form-control grey newsletter-input']")
    public WebElement newsletterEmailInputField;

    @FindBy(css = "button[name='submitNewsletter']")
    public WebElement newsletterButton;

    @FindBy(css = "a[title='Sign out']")
    public WebElement signOutButton;

    @FindBy(css = "a[title='About us']")
    public WebElement aboutUsButton;

    @FindBy(css = "a[title='Our stores']")
    public WebElement ourStoresButton;

    @FindBy(css = "a[title='Terms and conditions of use']")
    public WebElement termsAndConditionsButton;

    @FindBy(css = "a[title='Sitemap']")
    public WebElement sitemapButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMyWishlistLink() {
        click(myWishlistLink);
        LOG.info("Clicked on my wishlist link successfully");
    }

    public void typeMyWishlistName(String myWishlistName) {
        type(myWishlistNameInputField, myWishlistName);
        LOG.info("Entered my wishlist name successfully");
    }

    public void clickMyWishlist(){
        click(myWishlistButton);
        LOG.info("Clicked on my wishlist button successfully");
    }

    public void clickSaveButton() {
        click(saveButton);
        LOG.info("Clicked on save button successfully");
    }

    public void clickOrderHistoryDetails() {
        click(orderHistoryDetailsButton);
        LOG.info("Clicked on order history details button successfully");
    }

    public void typeNewsletterEmailInputField(String userEmail){
        type(newsletterEmailInputField, userEmail );
        LOG.info("Entered email successfully");
    }

    public void clickNewsletterButton(){
        click(newsletterButton);
        LOG.info("Clicked on newsletter button successfully");
    }

    public void clickWomen() {
        click(womenButton);
        LOG.info("Clicked on women button successfully");
    }

    public void clickPrintedSummerDressMore() {
        click(printedSummerDressMoreButton);
        LOG.info("Clicked on more successfully");
    }

    public void clickWriteAReview() {
        click(writeAReviewLink);
        LOG.info("Clicked on write a review link successfully");
    }

    public AutomationHomePage clickSignOut(){
        click(signOutButton);
        LOG.info("Clicked on signout button successfully");
        return new AutomationHomePage(getDriver());
    }

    public void clickAboutUsButton(){
        click(aboutUsButton);
        LOG.info("Clicked on about us button successfully");
    }

    public void clickOurStores(){
        click(ourStoresButton);
        LOG.info("Clicked on our store button successfully");
    }

    public void clickTermsAndConditions(){
        click(termsAndConditionsButton);
        LOG.info("Clicked on terms and conditions successfully");
    }
    public SitemapPage clickSitemap(){
        click(sitemapButton);
        LOG.info("Clicked on sitemap successfully");
        return new SitemapPage(getDriver());
    }
}
