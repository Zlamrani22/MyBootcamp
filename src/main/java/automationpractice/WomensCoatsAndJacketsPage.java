package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WomensCoatsAndJacketsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(WomensCoatsAndJacketsPage.class);

    @FindBy(css = "img[title='Printed Dress']")
    public WebElement printedDressButton;

    @FindBy(xpath = "a[id='wishlist_button']")
    public WebElement wishlistButton;


    public WomensCoatsAndJacketsPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void clickPrintedDressButton(){
        click(printedDressButton);
        LOG.info("Clicked on printed dress button successfully");
    }

    public void clickWishlistButton(){
        click(wishlistButton);
        LOG.info("Clicked on wishlist button successfully");

    }

}
