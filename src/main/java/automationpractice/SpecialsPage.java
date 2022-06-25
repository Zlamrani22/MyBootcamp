package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpecialsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SpecialsPage.class);

    @FindBy(css = "select[id='selectProductSort']")
    public WebElement sortByDropDown;

    @FindBy(css = "i[class='icon-th-list']")
    public WebElement listViewButton;

    @FindBy(css = "a[title='More about Fashion Manufacturer']")
    public WebElement fashionManufacturerLink;

    @FindBy(css = "h1[class='page-heading product-listing']")
    public WebElement fashionManufacturerHeader;

    @FindBy(css = "a[title='View a top sellers products']")
    public WebElement topSellersButton;

    @FindBy(css = "a[id='color_37']")
    public WebElement printedChiffonDressGreenColorBox;

    @FindBy(css = "span[class='span_link no-print']")
    public WebElement viewLargerLoupe;

    @FindBy(css = "a[class='fancybox-item fancybox-close']")
    public WebElement closeViewButton;

    @FindBy(css = "a[class='fancybox-nav fancybox-next']")
    public WebElement nextArrow;

    public SpecialsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectFromDropDownByValue(String price){
        selectFromDropdown(sortByDropDown, price);
        LOG.info("Selected from drop down successfully");
    }

    public void clickListView(){
        click(listViewButton);
        LOG.info("Clicked on list view successfully");
    }

    public void clickFashionManufacturerLink(){
        click(fashionManufacturerLink);
        LOG.info("Clicked on fashion manufacturer successfully");
    }

    public void getFashionManufacturerHeading(){
        getElementText(fashionManufacturerHeader);
        LOG.info("Element found Success");
    }
    public void clickTopSellers(){
        click(topSellersButton);
        LOG.info("clicked on top sellers successfully");
    }
    public void clickPrintedChiffonDressGreenColorBox(){
        click(printedChiffonDressGreenColorBox);
        LOG.info("clicked on the green color box successfully");
    }

    public void clickViewLargerLoupe(){
        click(viewLargerLoupe);
        LOG.info("clicked on view larger successfully");
    }

    public void clickCloseViewButton(){
        click(closeViewButton);
        LOG.info("clicked on close view button successfully");
    }

    public void clickNextArrow(){
        click(nextArrow);
        LOG.info("clicked on next arrow successfully");
    }
}
