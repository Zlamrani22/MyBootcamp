package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutomationHomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AutomationHomePage.class);

    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    public WebElement yourLogoLogo;

    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement cartButton;

    @FindBy(css = "input[id='search_query_top']")
    private WebElement searchInputField;

    @FindBy(css = "button[name='submit_search']")
    private WebElement searchButton;

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsButton;

    @FindBy(css = "a[class='blockbestsellers']")
    public WebElement bestSellersButton;

    @FindBy(css = "img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img4.jpg']")
    public WebElement sunglassesAndEyewear;

    @FindBy(xpath = "//*[@id='htmlcontent_top']//ul//li[2]/a/img")
    public WebElement summerCollection;

    @FindBy(xpath = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    public WebElement prestaShopDownloadButton;

    @FindBy(xpath = "//*[@id='htmlcontent_home']/ul/li[3]/a/img")
    public WebElement womensCoatsAndJacketsButton;

    @FindBy(xpath = "//*[@id='footer']//section[2]//div//div/ul/li/a")
    public WebElement womenLink;

    @FindBy(xpath = "//*[@id='homefeatured']//li[4]//div[2]/h5/a")
    public WebElement printedDressButton;

    @FindBy(xpath = "//*[@id='htmlcontent_top']//li[1]/a/img")
    public WebElement saleImage;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tShirtsButton;

    @FindBy(xpath = "//*[@id='center_column']//div[3]//div[2]/a[2]")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/h5/a")
    public WebElement fadedShortSleeveTShirtsLink;

    @FindBy(css = "a[id='color_14']")
    public WebElement blueColorButton;

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendLink;

    @FindBy(css = "input[id='friend_name']")
    public WebElement nameOfYourFriendInputField;

    @FindBy(css = "input[id='friend_email']")
    public WebElement friendEmailAddressInputField;

    @FindBy(css = "button[id='sendEmail']")
    public WebElement sendEmailButton;

    @FindBy(css = "a[title='Delivery']")
    public WebElement deliveryLink;

    @FindBy(css = "a[class='add_to_compare']")
    public WebElement addToCompare;

    @FindBy(css = "button[class='btn btn-default button button-medium bt_compare bt_compare']")
    public WebElement compareButton;

    @FindBy(xpath = "//*[@id='block_contact_infos']//li[3]/span/a")
    public WebElement supportEmailLink;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement womenButton;

    @FindBy(css = "a[title='Specials']")
    public WebElement specialsLink;

    @FindBy(css = "a[title='Sitemap']")
    public WebElement sitemapLink;

    @FindBy(css = "a[title='My credit slips']")
    public WebElement myCreditSlipsLink;

    public AutomationHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public AutomationHomePage clickYourLogoLogo(){
        click(yourLogoLogo);
        LOG.info("Clicked on the application logo successfully");
        return new AutomationHomePage(getDriver());
    }

    public void clickCartButton(){
        click(cartButton);
        LOG.info("Clicked on the cart button successfully");
    }

    public void clickSignIn(){
        click(signInButton);
        LOG.info("Clicked on the sign in button successfully");
    }

    public void typeSearchInputField(String searchItem){
        type(searchInputField, searchItem);
        LOG.info("Typed a searching item successfully");
    }

    public void clickSearchButton(){
        click(searchButton);
        LOG.info("Clicked on the search button successfully");
    }

    public void clickContactUsButton(){
        click(contactUsButton);
        LOG.info("Clicked on the contact us button successfully");
    }

    public void SearchElement(String inputValue){
        type(searchInputField, inputValue);
        LOG.info("Typed a search input value successfully");
    }

    public void clickBestSellers(){
        click(bestSellersButton);
        LOG.info("Clicked on the best sellers button successfully");
    }

    public PrestaShopPage clickSunglassesAndEyewear(){
        click(sunglassesAndEyewear);
        LOG.info("Clicked on the sunglasses and eyewear button successfully");
        return new PrestaShopPage(getDriver());
    }

    public PrestaShopPage clickSummerCollection() {
        click(summerCollection);
        LOG.info("Clicked on the summer collection button successfully");
        return new PrestaShopPage(getDriver());

    }
    public void clickPrestaShopDownload(){
        click(prestaShopDownloadButton);
        LOG.info("Clicked on the prestashop download button successfully");
    }

    public WomensCoatsAndJacketsPage clickWomensCoatsAndJacketsButton(){
        click(womensCoatsAndJacketsButton);
        LOG.info("Clicked on the women's coats and jackets button successfully");
        return new WomensCoatsAndJacketsPage(getDriver());
    }

    public WomenPage clickWomenLink(){
        click(womenLink);
        LOG.info("Clicked on the women link successfully");
        return new WomenPage(getDriver());
    }

    public PrintedDressPage clickPrintedDress(){
        click(printedDressButton);
        LOG.info("Clicked on the printed dress button successfully");
        return new PrintedDressPage(getDriver());
    }

    public PrestaShopPage clickSaleImage(){
        click(saleImage);
        LOG.info("Clicked on the sale image successfully");
        return new PrestaShopPage(getDriver());
    }

    public void clickTShirts(){
        click(tShirtsButton);
        LOG.info("Clicked on the t-shirt button successfully");
    }

    public void clickMore(){
        click(moreButton);
        LOG.info("Clicked on the more button successfully");
    }

    public void clickFadedShortSleeveTShirts(){
        click(fadedShortSleeveTShirtsLink);
        LOG.info("Clicked on the fadded short sleeve t-shirt successfully");
    }

    public void clickBlueColor(){
        click(blueColorButton);
        LOG.info("Clicked on the blue color button successfully");
    }

    public void clickSendToAFriend(){
        click(sendToAFriendLink);
        LOG.info("Clicked on the send to a friend link successfully");
    }

    public void typeNameOfYourFriend(String friendName){
        type(nameOfYourFriendInputField, friendName);
        LOG.info("Entered Friend's name successfully");
    }

    public void typeFriendEmailAddress(String friendEmail){
        type(friendEmailAddressInputField, friendEmail);
        LOG.info("typed a friend successfully");
    }

    public void clickSendEmail(){
        click(sendEmailButton);
        LOG.info("Clicked on the send email successfully");
    }

    public void clickDeliveryLink(){
        click(deliveryLink);
        LOG.info("Clicked on the delivery link successfully");
    }

    public void clickAddToCompare(){
        click(addToCompare);
        LOG.info("Clicked on the add to compare button successfully");
    }

    public void clickCompare(){
        click(compareButton);
        LOG.info("Clicked on the compare button successfully");
    }

    public void clickSupportEmail(){
        click(supportEmailLink);
        LOG.info("Clicked on the support email link successfully");
    }

    public WomenPage clickWomen(){
        click(womenButton);
        LOG.info("Clicked on the women button successfully");
        return new WomenPage(getDriver());
    }

    public void clickSpecials(){
        click(specialsLink);
        LOG.info("Clicked on the specials link successfully");
    }

    public SitemapPage clickSitemapLink(){
        click(sitemapLink);
        LOG.info("Clicked on sitemap link successfully");
        return new SitemapPage(getDriver());
    }

    public void clickMyCreditSlips(){
        click(myCreditSlipsLink);
        LOG.info("Clicked on my credit slips link successfully");
    }
}
