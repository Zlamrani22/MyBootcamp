package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAccountPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(MyAccountPage.class);

    @FindBy(css = "a[title='Addresses']")
    public WebElement myAddresses;

    @FindBy(xpath = "//*[@id='center_column']//div[1]//ul//li[9]//a[2]")
    public WebElement deleteButton;

    @FindBy(css = "input[class='search_query form-control ac_input']")
    public WebElement searchInputField;

    @FindBy(css = "a[id='color_40']")
    public WebElement whiteColorCheckBox;

    @FindBy(css = "button[class='btn btn-default button-search']")
    public WebElement searchButton;

    @FindBy(css = "i[class='icon-th-list']")
    public WebElement listButton;

    @FindBy(xpath = "//*[@id='product_comments_block_extra']/ul/li/a")
    public WebElement writeAReviewButton;

    @FindBy(css = "a[id='color_20']")
    public WebElement blueColorCheckBox;

    @FindBy(xpath = "//*[@id='usefull_link_block']//li[2]/a")
    public WebElement printButton;

    @FindBy(css = "a[id='color_8']")
    public WebElement whiteColorBlouse;

    @FindBy(xpath = "//*[@id='wrapResetImages']/a")
    public WebElement displayAllPicturesLink;

    @FindBy(xpath = "//*[@id='center_column']//div[2]/ul/li/a")
    public WebElement myWishlistsButton;

    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickMyAddresses(){
        click(myAddresses);
        LOG.info("Clicked on my addresses successfully");
    }

    public void clickDelete(){
        click(deleteButton);
        LOG.info("Clicked on delete button successfully");
    }

    public void searchElementAndEnter(String searchItem){
        type(searchInputField, searchItem);
        LOG.info("Entered search term successfully");
    }

    public void clearSearchInputField(){
        clear(searchInputField);
        LOG.info("Cleared search input field successfully");
    }

    public void clickWhiteColorPrintedSummerDress(){
        click(whiteColorCheckBox);
        LOG.info("Clicked on white color box successfully");
    }

    public void clickSearchButton(){
        click(searchButton);
        LOG.info("Clicked on search button successfully");
    }

    public void clickListButton(){
        click(listButton);
        LOG.info("Clicked on list button successfully");
    }

    public void clickWriteAReview(){
        click(writeAReviewButton);
        LOG.info("Clicked on write a review button successfully");
    }

    public void clickBlueColorCheckBox(){
        click(blueColorCheckBox);
        LOG.info("Clicked on blue color box successfully");
    }

    public void clickPrintButton(){
        click(printButton);
        LOG.info("Clicked on print button successfully");
    }

    public void clickWhiteColorBlouse(){
        click(whiteColorBlouse);
        LOG.info("Clicked on white color box successfully");
    }
    public void clickDisplayAllPicturesLink(){
        click(displayAllPicturesLink);
        LOG.info("Clicked on display all pictures successfully");
    }

    public MyWishlistPage clickMyWishlist(){
        click(myWishlistsButton);
        LOG.info("Clicked on my wishlist button successfully");
        return new MyWishlistPage(getDriver());
    }

}
