package admin.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationListPage {
    private WebDriver driver;
    private By addAppButton = By.xpath("//a[contains (., \"Add App\")]");


    //private By logo = By.id("hplogo");

    public ApplicationListPage(WebDriver driver) {
        this.driver = driver;
    }

    public ApplicationCreatePageOLD gotoAppCreatePage () {
        driver.findElement(addAppButton).click();
        return new ApplicationCreatePageOLD(driver);
    }

}
