package automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PinterestPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PinterestPage.class);

    public PinterestPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
