package admin.app;

import base.BaseAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class ApplicationCreatePage extends BaseAdminPage {

    protected WebElement  nameAppInput;
    protected WebElement  descriptionApp;
  //  protected WebElement  platformType;
   // protected WebElement  siteDropdown;
    protected WebElement clickSavechanges;

    private By platformType;
    private By site

    public ApplicationCreatePage (WebDriver driver){
        super(driver);
        this.nameAppInput = driver.findElement(By.xpath("//input[@id=\"app_name\"]"));
        this.descriptionApp = driver.findElement(By.xpath("//*[@id=\"app_description\"]"));
       // this.platformType = driver.findElement (By.xpath("//*[@id=\"app_platformType\"]"));
        //this.siteDropdown = driver.findElement(By.xpath("//*[@id=\"app_site\"]"));
        this.clickSavechanges = driver.findElement(By.xpath("//*[@class=\"btn-label\"]"));
    }

    public void setNameAppInput(String text) throws InterruptedException {
        Thread.sleep(5000);
        this.nameAppInput.sendKeys(text);
    }
    public void setDescriptionApp(String text) throws InterruptedException {
        Thread.sleep(5000);
        this.descriptionApp.sendKeys(text);
    }
    public void selectPlatformType(String option){
        Select dropdownPlatformType = new Select(driver.findElement((By) platformType));
        dropdownPlatformType.selectByValue(option);
    }

    public void selectSite(String option){
        Select dropdownSite = new Select(driver.findElement((By) siteDropdown));
        dropdownSite.deselectByVisibleText(option);
    }


        /*
     public List<String> getSelectedOptions(){
     List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
     return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
  */


    public Select findDropdownSites(){
        return new Select(driver.findElement((By) siteDropdown));
    }

    public Select findDropdownPlatforn(){
        return new Select(driver.findElement((By) platformType));
    }

    public void clickSavechanges(){
        this.clickSavechanges.click();
    }
/*
public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
 */
}

