package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class WomenPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(WomenPage.class);

    @FindBy(css = "i[class='icon-th-list']")
    public WebElement listButton;

    @FindBy(xpath = "//*[@id='center_column']//li[1]//div[2]/h5/a")
    public WebElement fadedShortSleeveTShirtButton;

    @FindBy(css = "a[id='view_scroll_right']")
    public WebElement fadedShortSleeveTShirtRightArrow;

    @FindBy(css = "img[id='thumb_4']")
    public WebElement blueColoredFadedShortSleeveTShirtButton;

    @FindBy(xpath = "//*[@id='product']/div[2]/div/div/a")
    public WebElement closeButton;

    @FindBy(css = "input[id='layered_id_attribute_group_1']")
    public WebElement smallCheckBox;

    @FindBy(css = "input[id='layered_id_attribute_group_14']")
    public WebElement blueColorLink;

    @FindBy(css = "a[id='color_37']")
    public WebElement greenColorPrintedChiffonDress;

    @FindBy(css = "input[id='layered_id_feature_5']")
    public WebElement cottonCompositionCheckBox;

    @FindBy(css = "a[id='color_8']")
    public WebElement whiteColorBlouse;

    @FindBy(xpath = "//*[@id='categories_block_left']//div/ul/li[2]/a")
    public WebElement dressesButton;

    @FindBy(xpath = "//*[@id='subcategories']//ul//li[3]//h5/a")
    public WebElement summerDressesButton;

    @FindBy(xpath = "//*[@id='ul_layered_id_feature_7']//li[1]/label/a")
    public WebElement maxiDressCheckBox;

    @FindBy(css = "a[id='color_21']")
    public WebElement orangeColorPrintedSummerDress;

    @FindBy(xpath = "//*[@id='ul_layered_id_feature_7']//li[1]//label/a")
    public WebElement colorfulDressCheckBox;

    @FindBy(css = "a[class='button lnk_view btn btn-default']")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id='ul_layered_quantity_0']/li/label/a")
    public WebElement inStockCheckBox;

    @FindBy(xpath = "//*[@id='ul_layered_condition_0']/li/label/a")
    public WebElement newLink;

    @FindBy(xpath = "//*[@id='center_column']//li[2]//div[3]//div[2]/a[1]/span")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='ul_layered_manufacturer_0']/li/label/a")
    public WebElement fashionManufacturerCheckBox;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/a")
    public WebElement topsCheckBox;

    @FindBy(css = "a[class='addToWishlist wishlistProd_2']")
    public WebElement addToWishlistButton;

    @FindBy(xpath = "//*[@id='center_column']//li[2]//div[3]//div[3]//div[2]/a")
    public WebElement addTotoCompareLink;

    @FindBy(xpath = "//*[@id='center_column']/ul//li[2]//div[1]//a[1]/img")
    public WebElement blouseImage;

    @FindBy(css = "//*[@id='center_column']//div[3]//p[7]//button[4]")
    public WebElement pinterestLink;

    @FindBy(xpath = "//*[@id='layered_price_slider']/a[1]")
    public WebElement priceSliderHandleLeft;

    @FindBy(css = "a[class='ui-slider-handle ui-state-default ui-corner-all ui-state-active']")
    public WebElement priceSliderHandleRight;

    public WomenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickList() {
        click(listButton);
        LOG.info("Clicked on list button successfully");
    }

    public void clickFadedShortSleeveTShirt() {
        click(fadedShortSleeveTShirtButton);
        LOG.info("Clicked on faded short sleeve tshirt button successfully");
    }

    public void clickFadedShortSleeveTShirtRightArrow() {
        click(fadedShortSleeveTShirtRightArrow);
        LOG.info("Clicked on faded short sleeve tshirt right arrow successfully");
    }

    public void clickBlueColoredFadedShortSleeveTShirt() {
        click(blueColoredFadedShortSleeveTShirtButton);
        LOG.info("Clicked on blue colored faded short sleeve tshirt button successfully");
    }

    public void clickClose() {
        click(closeButton);
        LOG.info("Clicked on close button successfully");
    }

    public void selectSmallCheckBox() {
        click(smallCheckBox);
        LOG.info("Clicked on small checkbox successfully");
    }

    public void selectBlueColorLink() {
        click(blueColorLink);
        LOG.info("Clicked on blue color link successfully");
    }

    public void clickGreenColorprintedChiffonDress() {
        click(greenColorPrintedChiffonDress);
        LOG.info("Clicked on green color printed chiffon dress successfully");
    }

    public void clickCottonCompositionCheckBox() {
        click(cottonCompositionCheckBox);
        LOG.info("Clicked on cotton composition checkbox successfully");
    }

    public void clickWhiteColorBlouse() {
        click(whiteColorBlouse);
        LOG.info("Clicked on white color blouse successfully");
    }

    public void clickDresses() {
        click(dressesButton);
        LOG.info("Clicked on dresses button successfully");
    }

    public void clickSummerDresses() {
        click(summerDressesButton);
        LOG.info("Clicked on summer dresses button successfully");
    }

    public void clickMaxiDressCheckBox() {
        click(maxiDressCheckBox);
        LOG.info("Clicked on maxi dress checkbox successfully");
    }

    public void clickOrangeColorPrintedSummerDress() {
        click(orangeColorPrintedSummerDress);
        LOG.info("Clicked on orange color printed summer dress successfully");
    }

    public void clickColorfulDressCheckBox() {
        click(colorfulDressCheckBox);
        LOG.info("Clicked on colorful dress checkbox successfully");
    }

    public PrintedDressPage clickMoreButton() {
        click(moreButton);
        LOG.info("Clicked on more button successfully");
        return new PrintedDressPage(getDriver());
    }

    public void clickInStockCheckBox() {
        click(inStockCheckBox);
        LOG.info("Clicked on in stock checkbox successfully");
    }

    public void clickNewLink() {
        click(newLink);
        LOG.info("Clicked on new link successfully");
    }

    public void clickFashionManufacturerCheckBox(){
        click(fashionManufacturerCheckBox);
        LOG.info("Clicked on fashion manufacturer checkbox successfully");
    }

    public void clickAddToCartButton(){
        click(addToCartButton);
        LOG.info("Clicked on add to cart button successfully");
    }

    public void clickTopsCheckBox(){
        click(topsCheckBox);
        LOG.info("Clicked on tops checkbox successfully");
    }

    public void clickAddToWishlist(){
        click(addToWishlistButton);
        LOG.info("Clicked on add to wishlist button successfully");
    }

    public void clickAddToCompare(){
        click(addTotoCompareLink);
        LOG.info("Clicked on add to compare button successfully");
    }

    public void clickBlouseImage(){
        click(blouseImage);
        LOG.info("Clicked on blouse image successfully");
    }

    public PinterestPage clickPinterestLink(){
        click(pinterestLink);
        LOG.info("Clicked on pinterest link successfully");
        return new PinterestPage(getDriver());
    }

    //Price Slider Region
    public void priceSlider(WebDriver driver, int value){
        Actions actions = new Actions(getDriver());
        int width = priceSliderHandleLeft.getSize().getWidth();
        int x = (int)Float.parseFloat(priceSliderHandleRight.getCssValue("right").replace("px", ""));
        System.out.println(width);
        float min = 10;
        float max = 100;
        float offsetX = width/(max-min)*value;
        System.out.println(offsetX);
    }
    public void setPriceSliderHandleLeft(Double priceSliderHandleLeft){
        Actions actions = new Actions(getDriver());

        for (Actions actions1 : Arrays.asList(actions.clickAndHold(), actions.moveByOffset(3, 0), actions.release())) {
            actions1.build().perform();
        }
        final Actions actions1;
        //actions1 = actions.dragAndDropBy(priceSliderHandleLeft, 20, 0);
        actions.perform();
    }
    public void setPriceSliderHandleRight(Double priceSliderHandleRight){
        Actions actions = new Actions(getDriver());
        for (Actions actions1 : Arrays.asList(actions.clickAndHold(), actions.moveByOffset(-3, 0), actions.release())) {
            actions1.build().perform();
        }
        //actions.dragAndDropBy(priceSliderHandleRight, -40, 0).perform();
    }
    public void setPriceSlider(Double priceRange) {
        if (priceRange >= 0 && priceRange <= 100) {
            Actions actions = new Actions(getDriver());
            actions.clickAndHold(priceSliderHandleRight).build().perform();
            while(Double.parseDouble(getDriver().findElement(By.id("layered_orice_range")).getText().substring(10)) > priceRange){
                actions.moveByOffset(-3, 0).build().perform();
            }
            actions.release(priceSliderHandleRight).build().perform();
        }
    }
    public void setPriceSlider(){
        Dimension sliderSize = priceSliderHandleLeft.getSize();
        int slideWidth = sliderSize.getWidth();
        int xCoord = priceSliderHandleLeft.getLocation().getX();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(priceSliderHandleRight).click().dragAndDropBy(priceSliderHandleLeft, xCoord + slideWidth, 0).build().perform();
    }
    //End Region
}
