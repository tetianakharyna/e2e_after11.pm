package admin.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicationCreatePageOLD {

    private WebDriver driver;
    private By nameAppinput = By.id("app_name");
    private By descriptionApp = By.id("app_description");
    private By platformType = By.id("app_platformType");

    public ApplicationCreatePageOLD(WebDriver driver) {
        this.driver = driver;
    }

    public void createApp(){
        driver.findElement(descriptionApp).sendKeys("THis is my description" );
    }



}
