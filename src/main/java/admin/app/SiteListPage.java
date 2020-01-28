package admin.app;

import base.BaseAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

public class SiteListPage extends BaseAdminPage {

    protected WebElement createSiteButton;

    public SiteListPage (WebDriver driver){
        super(driver);
        this.createSiteButton =driver.findElement(By.xpath("//a[@class=\"btn btn-primary action-new\"]"));
    }
    public void clickCreateSiteButton() {
        this.createSiteButton.click();
    }

    public void checkIsSitePresent (String site){
        Assert.assertTrue(driver.getPageSource().contains(site));
    }
    //a[@class="btn btn-primary action-new"]
}
