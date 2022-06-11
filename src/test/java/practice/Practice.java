package practice;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PIIT_NYA\\eclipse-workspace\\April22-SeleniumProject\\driver\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void waitFor(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //@Test
    public void clickOnRadioButton(){
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radioButton']"));
//        for (int i = 0; i < radioButtons.size(); i++) {
//            radioButtons.get(i).click();
//            waitFor(3);
//        }
        for (WebElement radioButton: radioButtons) {
            if (radioButton.getAttribute("value").equalsIgnoreCase("radio1")){
                radioButton.click();
            }
        }
    }

    //@Test
    public void suggestionDropdown(){
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        waitFor(3);
    }

    //@Test
    public void dropdown(){
        WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option1");
        waitFor(3);
    }
    //@Test
    public void checkBox(){
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkBoxOption1"));
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());
        WebElement checkBox2 = driver.findElement(By.cssSelector("#checkBoxOption2"));
        checkBox2.click();
        Assert.assertTrue(checkBox2.isSelected());
        WebElement checkBox3 = driver.findElement(By.cssSelector("#checkBoxOption3"));
        checkBox3.click();
        Assert.assertTrue(checkBox3.isSelected());
    }

    //@Test
    public void windowHandle(){
        String currentWindow = driver.getWindowHandle();
        System.out.println("parent win: "+currentWindow);
        driver.findElement(By.cssSelector("#openwindow")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String childWindow = null;
        while (it.hasNext()){
            childWindow = it.next();
        }
        driver.switchTo().window(childWindow);
        System.out.println("switched to child window success: "+childWindow);
        waitFor(10);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".listbuilder-popup-scale")));
//        System.out.println("pop up appeared");
        driver.findElement(By.xpath("//*[text()='NO THANKS']")).click();
        driver.findElement(By.xpath("//a[text()='About']")).click();
    }

    //@Test
    public void windowTab(){
        String currentWindow = driver.getWindowHandle();
        System.out.println("parent win: "+currentWindow);
        driver.findElement(By.xpath("//*[text()='Open Tab']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String childWindow = null;
        while (it.hasNext()){
            childWindow = it.next();
        }
        driver.switchTo().window(childWindow);
        System.out.println("switched to child window success: "+childWindow);
        driver.findElement(By.xpath("//*[text()='Login']/span")).click();
    }
    //@Test
    public void alertHandle(){
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Java World");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        driver.switchTo().alert().accept();
        waitFor(3);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Java World");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        driver.switchTo().alert().accept();
        waitFor(3);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Java World");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        driver.switchTo().alert().dismiss();
    }
    //@Test
    public void table(){
        String text = driver.findElement(By.cssSelector("*[name='courses'] tbody tr:nth-child(11) td:nth-child(3)")).getText();
        System.out.println(text);
    }

    //@Test
    public void hideShow(){
        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
        waitFor(3);
        driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
        driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("I am visible");
        waitFor(3);
    }
    //@Test
    public void table2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        waitFor(5);
        System.out.println(driver.findElement(By.xpath("//tbody/tr[9]/td[4]")).getText());
    }
    //@Test
    public void hoverOver(){
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(text(),'Total Amount Collected: 296')]")));
        waitFor(5);
        actions.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        waitFor(2);
        driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();
    }
    //@Test
    public void handleFrame(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.switchTo().frame(0);
        System.out.println("switch to frame success");
        waitFor(3);
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='logo']")).isDisplayed());
    }
}
