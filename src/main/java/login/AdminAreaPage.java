package login;

import admin.app.ApplicationListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAreaPage {
    private WebDriver driver;
    private By whoIsLogined = By.className("user-name");
    private By appBurgerMenu = By.xpath("//ul[@class = \"treeview-menu\"]//span[contains (., \"App\")]");
    private By siteBurgerMenu = By.xpath("//ul[@class = \"treeview-menu\"]//span[contains (., \"Site\")]");
    private By feedbackBurgerMenu = By.xpath("//ul[@class = \"treeview-menu\"]//span[contains (., \"App\")]");
    public AdminAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(whoIsLogined).getText();
    }


    public ApplicationListPage clickAppBurger() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"easyadmin-list-App\"]/div[1]/aside/section/ul/li[1]/a/span")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 5);

        /*
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
         */
        //IWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(3));
        //IWebElement element = wait.Until(ExpectedConditions.ElementExists(By.Id("foo")));
        //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"easyadmin-list-App\"]/div[1]/aside/section/ul/li[1]/ul/li[1]/a/span")).click();//span[contains (., "Application")]
        Thread.sleep(1500);

        driver.findElement(appBurgerMenu).click();
        return new ApplicationListPage(driver);

    }

}
