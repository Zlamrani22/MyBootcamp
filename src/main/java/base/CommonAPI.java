package base;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    static String currentDir = System.getProperty("user.dir");

    public WebDriver driver;

    public void getDriver(String browser, String os){
        if (os.equalsIgnoreCase("windows")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"\\driver\\windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }else if (os.equalsIgnoreCase("mac")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"\\driver\\mac\\chromedriver");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"\\driver\\mac\\geckodriver");
                driver = new FirefoxDriver();
            }
        }else if (os.equalsIgnoreCase("linux")){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", currentDir+"\\driver\\linux\\chromedriver");
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", currentDir+"\\driver\\linux\\geckodriver");
                driver = new FirefoxDriver();
            }
        }
    }

    @Parameters({"url","browser","os"})
    @BeforeMethod
    public void setUp(@Optional("https://www.google.com") String url, @Optional("chrome") String browser, @Optional("windows") String os){
        getDriver(browser, os);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        element.sendKeys(text);
    }

    public void typeAndEnter(WebElement element, String text){
        element.sendKeys(text, Keys.ENTER);
    }

    public void selectFromDropdown(WebElement dropdown, String option){
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public void hoverOver(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
