package amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatingMenuTest extends CommonAPI {

    @Test
    public void floatingMenu(){
        hoverOver("#nav-link-accountList-nav-line-1");
        click("//*[text()='Sign in']");
        String text = getElementText(".a-form-label");
        Assert.assertEquals("Email or mobile phone number", text);
    }
}
