package admin.app;

import base.BaseAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.*;

public class ApplicationListPage extends BaseAdminPage {
    private WebElement createButton;
    private WebElement pageHeader;

    public ApplicationListPage(WebDriver driver) {
        super(driver);
        this.createButton  = this.driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/section[1]/div/div[2]/div[2]/a"));
        this.pageHeader = this.driver.findElement(By.xpath("//*[@class=\"content-header-title\"]"));
    }

    public void clickCreateButton() {
        this.createButton.click();
    }

    public void getPageTitle (String text){
        Assert.assertEquals(this.pageHeader.getText().equals(text), "Actual: page title is : " + this.pageHeader.getText());
        //this.pageHeader.getText().equals(text);
        //this.pageHeader.getText().contains(text);
    }
}
