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

    public String getElementText(String locator){
        try {
            return driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception e){
            return driver.findElement(By.xpath(locator)).getText();
        }
    }

    public void click(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).click();
        }
    }

    public void type(String locator, String text){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }

    }

    public void typeAndEnter(String locator, String text){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(text, Keys.ENTER);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text, Keys.ENTER);
        }
    }

    public void selectFromDropdown(String dropdownLocator, String option){
        WebElement dropdown;
        try {
             dropdown = driver.findElement(By.cssSelector(dropdownLocator));

        }catch (Exception e){
            dropdown = driver.findElement(By.xpath(dropdownLocator));
        }
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public void hoverOver(String locator){
        Actions actions = new Actions(driver);
        WebElement element;
        try {
            element = driver.findElement(By.cssSelector(locator));
        }catch (Exception e){
            element = driver.findElement(By.xpath(locator));
        }
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
