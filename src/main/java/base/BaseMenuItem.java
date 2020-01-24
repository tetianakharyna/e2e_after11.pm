package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseMenuItem {
    protected WebElement menuElement;

    public BaseMenuItem(WebDriver driver, String xPath) {
        this.menuElement = driver.findElement(By.xpath(xPath));
    }

    public void clickMenuItem() {
        this.menuElement.click();
    }
}
