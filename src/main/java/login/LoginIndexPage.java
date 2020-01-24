package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginIndexPage {
    private WebDriver driver;

    private By inputEmail = By.id("inputEmail");
    private By inputPassword = By.id("inputPassword");
    private By singinButton = By.xpath("//button");


    public LoginIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserremail(String username){
        driver.findElement(inputEmail).sendKeys(username);

    }

    public void setPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public AdminAreaPage clickLoginButton(){
        driver.findElement(singinButton).click();
        return new AdminAreaPage(driver);
    }
}
