package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest extends CommonAPI {

    @Test
    public void selectBabyOption(){
        type("twotabsearchtextbox", "flash mcqueen cars");
        click("nav-search-submit-button");
        selectFromDropdown("searchDropdownBox", "Baby");
        waitFor(5);
    }
}
