package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PIIT_NYA\\eclipse-workspace\\April22-SeleniumProject\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void click(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public void type(String locator, String text){
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    public void selectFromDropdown(String dropdownLocator, String option){
        WebElement dropdown = driver.findElement(By.id(dropdownLocator));
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
