package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintedDressPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PrintedDressPage.class);

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendLink;

    @FindBy(css = "a[id='send_friend_button']")
    public WebElement sendToAFriendCloseButton;

    @FindBy(css = "span[class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShoppingButton;

    @FindBy(css = "a[class='color_pick']")
    public WebElement pinkColorCheckBox;

    @FindBy(css = "button[name='Submit']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='header']//div[3]//div[3]/div/a/b")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@id='4_43_0_0']/i")
    public WebElement trashIcon;

    @FindBy(css = "span[class='ajax_cart_product_txt unvisible']")
    public WebElement shoppingCartButton;

    @FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]/span/i")
    public WebElement increaseQuantityButton;

    public PrintedDressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickSendToAFriendLink(){
        click(sendToAFriendLink);
        LOG.info("Clicked on send to friend link successfully");
    }

    public void clickSendToAFriendCloseButton(){
        click(sendToAFriendCloseButton);
        LOG.info("Clicked on send to friend close button successfully");
    }

    public void clickContinueShopping(){
        click(continueShoppingButton);
        LOG.info("Clicked on continue shopping button successfully");
    }

    public void clickPinkColorCheckBox(){
        click(pinkColorCheckBox);
        LOG.info("Clicked on pink color checkbox successfully");
    }

    public void clickAddToCart(){
        click(addToCartButton);
        LOG.info("Clicked on add to cart button successfully");
    }

    public void clickTrashIcon(){
        click(cartButton);
        LOG.info("Clicked on cart button successfully");
    }

    public ShoppingCartPage clickShoppingCart(){
        click(shoppingCartButton);
        LOG.info("Clicked on shopping cart button successfully");
        return new ShoppingCartPage(getDriver());
    }

    public void clickIncreaseQuantity(){
        click(increaseQuantityButton);
        LOG.info("Clicked on increase quantity button successfully");
    }
}
