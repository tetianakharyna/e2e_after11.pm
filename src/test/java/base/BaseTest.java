package base;

import login.AdminAreaPage;
import login.LoginIndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class BaseTest {

    public WebDriver driver;
    protected LoginIndexPage loginIndexPage;
    protected AdminAreaPage adminAreaPage;
    protected SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resourses/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() { driver.quit();
    }

    @BeforeMethod
    protected void goAdminMethod() {
        driver.get("https://admin-stage.after11pm.app/sf/admin/?action=list&entity=Network");
        this.loginIndexPage = new LoginIndexPage(driver);
        loginIndexPage.setUserremail("admin11pm");
        loginIndexPage.setPassword("gjckt11dtxthf");
        loginIndexPage.clickLoginButton();
        softAssert = new SoftAssert();
        //this.adminAreaPage = new AdminAreaPage(driver);
        //return new AdminAreaPage(driver);
        //
    }

    @Test
    public void checkURL (){
        System.out.println(driver.getCurrentUrl());
    }
}
