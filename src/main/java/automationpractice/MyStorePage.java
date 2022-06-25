package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStorePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(MyStorePage.class);

    @FindBy(xpath = "//*[@id='category-3']/a")
    public WebElement clothesButton;

    @FindBy(xpath = "//*[@id='category-4']/a")
    public WebElement menButton;

    @FindBy(xpath = "//*[@id='category-6']/a")
    public WebElement accessoriesButton;

    @FindBy(xpath = "//*[@id='category-8']/a")
    public WebElement homeAccessoriesButton;

    @FindBy(xpath = "//*[@id='content']//div[5]//article//div//div[1]/a/img")
    public WebElement todayIsAGoodDayFramedPoster;

    @FindBy(css = "a[class='btn btn-explore btn-visible-small btn-explore-bo']")
    public WebElement startNowButton;

    @FindBy(xpath = "//*[@id='_desktop_user_info']/div/a/span")
    public WebElement myStoreSignInButton;

    @FindBy(xpath = "span[class='hide-header']")
    public WebElement hideHeaderButton;

    @FindBy(xpath = "//*[@id='header']/a[3]/span")
    public WebElement exploreFrontOfficeButton;

    public MyStorePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOverClothes(WebDriver driver){
       hoverOver(driver, clothesButton);
        LOG.info("Hovered over clothes button successfully");
    }

    public void clickMenButton(){
        click(menButton);
        LOG.info("Clicked menu button successfully");
    }

    public void hoverOverAccessories(WebDriver driver){
        hoverOver(driver, accessoriesButton);
        LOG.info("Hovered over accessories button successfully");
    }

    public void clickHomeAccessories(){
        click(homeAccessoriesButton);
        LOG.info("Clicked home accessories button successfully");
    }

    public void clickTodayIsAGoodDayFramedPoster(){
        click(todayIsAGoodDayFramedPoster);
        LOG.info("Clicked on today is a good day frame poster successfully");
    }

    public void clickStartNow(){
        click(startNowButton);
        LOG.info("Clicked on start now button successfully");
    }

    public void clickMyStoreSingIn(){
        click(myStoreSignInButton);
        LOG.info("Clicked signin button successfully");
    }

    public void clickHideHeader(){
        click(hideHeaderButton);
        LOG.info("Clicked on hide header button successfully");
    }

    public void clickExploreFrontOffice(){
        click(exploreFrontOfficeButton);
        LOG.info("Clicked on explore front office successfully");
    }
}
