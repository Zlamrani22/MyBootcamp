package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyWishlistPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(MyWishlistPage.class);

    @FindBy(xpath = "//*[@id='wishlist_47175']//td[6]/a/i")
    public WebElement removeIcon;

    @FindBy(css = "input[id='name']")
    public WebElement newWishlistNameInputField;

    @FindBy(css = "button[id='submitWishlist']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='mywishlist']//li[1]/a")
    public WebElement backToYourAccountButton;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/h5/a")
    public WebElement printedChiffonDressLink;

    @FindBy(css = "a[id='wishlist_button']")
    public WebElement addToWishlist;

    @FindBy(xpath = "//*[@id='mywishlist']//li[2]/a")
    public WebElement homeButton;


    public MyWishlistPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickRemoveIcon(){
        click(removeIcon);
        LOG.info("Clicked on remove icon successfully");
    }

    public void typeNewWishlistName(String wishlistName){
        type(newWishlistNameInputField, wishlistName);
        LOG.info("Entered wishlist name successfully");
    }

    public void clickSave(){
        click(saveButton);
        LOG.info("Clicked on save button successfully");
    }

    public void clickBackToYourAccount(){
        click(backToYourAccountButton);
        LOG.info("Clicked on back to your account successfully");
    }

    public void clickPrintedChiffonDress(){
        click(printedChiffonDressLink);
        LOG.info("Clicked on printed chiffon dress link successfully");
    }

    public void clickAddToWishlist(){
        click(addToWishlist);
        LOG.info("Clicked on add to wishlist successfully");
    }

    public void clickHome(){
        click(homeButton);
        LOG.info("Clicked on home button successfully");
    }

}
