package access_controll;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        loginIndexPage.setUserremail("admin11pm");
        loginIndexPage.setPassword("gjckt11dtxthf");
        loginIndexPage.clickLoginButton();
        Assert.assertTrue(adminAreaPage.getAlertText().contains("admin11pm"));
       }
}
