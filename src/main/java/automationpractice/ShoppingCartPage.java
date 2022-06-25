package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingCartPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ShoppingCartPage.class);

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public WebElement dressesButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]")
    public WebElement casualDressesButton;

    @FindBy(css= "input[id='layered_id_attribute_group_1'")
    public WebElement smallCheckBox;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
    public WebElement printedDressButton;

    @FindBy(css = "p[id='add_to_cart']")
    public WebElement addToCartButton;

    @FindBy(css = "a[id='4_43_0_0']")
    public WebElement trashIcon;

    @FindBy(css = "a[title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id='ul_layered_id_feature_6']/li/label/a")
    public WebElement girlyStyleCheckBox;

    @FindBy(css = "a[title='Add to cart']")
    public WebElement girlyStyleAddToCartButton;

    @FindBy(css = "a[class='btn btn-default button button-medium']")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@id='center_column']//div[1]/div/a[1]/img")
    public WebElement printedDressGirlyStyle;

    @FindBy(css = "a[id='cart_quantity_up_3_13_0_0']")
    public WebElement quantityPlusButton;

    public ShoppingCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOverDressesButton(WebDriver driver){
        hoverOver(driver, dressesButton);
        LOG.info("Hover over dresses success");
    }

    public void clickDressesButton(){
        click(dressesButton);
        LOG.info("Clicked on dresses button successfully");
    }

    public void clickCasualDressesButton(){
        click(casualDressesButton);
        LOG.info("Clicked on casual dresses button successfully");
    }

    public void checkSmallCheckBox(){
        click(smallCheckBox);
        LOG.info("Clicked on small checkbox successfully");
    }

    public void clickPrintedDressButton(){
        click(printedDressButton);
        LOG.info("Clicked on printed dress button successfully");
    }

    public WebElement clickAddToCartButton(){
        click(addToCartButton);
        LOG.info("Clicked on add to cart button successfully");
        return null;
    }

    public void clickTrashIcon(){
        click(trashIcon);
        LOG.info("Clicked on trash icon successfully");
    }

    public void clickContinueShopping(){
        click(continueShoppingButton);
        LOG.info("Clicked on casual dresses button successfully");
    }

    public void clickGirlyStyleCheckBox(){
        click(girlyStyleCheckBox);
        LOG.info("Clicked on girly style checkbox successfully");
    }

    public void clickGirlyStyleAddToCart(){
        click(girlyStyleAddToCartButton);
        LOG.info("Clicked on girly style add to cart button successfully");
    }

    public void clickProceedToCheckout(){
        click(proceedToCheckOutButton);
        LOG.info("Clicked on proceed to checkout button successfully");
    }

    public void clickPrintedDressGirlyStyle(){
        click(printedDressGirlyStyle);
        LOG.info("Clicked on printed dress girly style successfully");
    }

    public void clickQuantityPlusButton(){
        click(quantityPlusButton);
        LOG.info("Clicked on quantity plus button successfully");
    }
}

