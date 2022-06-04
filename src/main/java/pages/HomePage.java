package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchField;

    @FindBy(css = "#nav-search-submit-button")
    private WebElement searchBtn;

    @FindBy(css = "#searchDropdownBox")
    private WebElement menuDropdown;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    private WebElement signInBtn;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void searchElement(String item){
        type(searchField, item);
    }
    public void clickSearchBtn(){
        click(searchBtn);
    }
    public void searchElementAndEnter(String item){
        typeAndEnter(searchField, item);
    }
    public void selectOptionFromMenuDropdown(String option){
        selectFromDropdown(menuDropdown, option);
    }
    public void hoverOverFloatingMenu(WebDriver driver){
        hoverOver(driver, floatingMenu);
    }
    public void clickOnLoginBtn(){
        click(signInBtn);
    }
}
