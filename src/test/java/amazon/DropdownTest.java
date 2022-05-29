package amazon;

import base.CommonAPI;
import org.testng.annotations.Test;

public class DropdownTest extends CommonAPI {

    @Test
    public void selectBabyOption(){
        type("#twotabsearchtextbox", "flash mcqueen cars");
        click("*[id='nav-search-submit-button']");
        selectFromDropdown("#searchDropdownBox", "Baby");
        waitFor(5);
    }
}
