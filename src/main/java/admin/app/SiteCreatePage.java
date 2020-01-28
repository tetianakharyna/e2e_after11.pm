package admin.app;

import base.BaseAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SiteCreatePage extends BaseAdminPage {
    protected WebElement domainInput;
    protected WebElement saveChangesApp;
    //protected WebElement adblockStrategyDropdown;

    Select adblockStrategyDropdownn = new Select(driver.findElement(By.id("site_adBlockStrategy")));

    public SiteCreatePage (WebDriver driver){
        super(driver);
        this.domainInput = driver.findElement(By.xpath("//*[@id=\"site_domain\"]"));
        this.saveChangesApp = driver.findElement(By.xpath("//button[@class=\"btn btn-primary action-save\"]"));
    }

    public void setDomain(String text) {
        this.domainInput.sendKeys(text);
    }
    public void selectNoneAdblock (){
        adblockStrategyDropdownn.selectByValue("None");
    }

    public void selectDefaultAdblock (){
        adblockStrategyDropdownn.selectByValue("Default");
    }

    public void clickSaveChangesSite (){
        this.saveChangesApp.click();
    }

}
