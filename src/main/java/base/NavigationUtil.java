package base;

import org.openqa.selenium.WebDriver;

public class NavigationUtil {
    private WebDriver driver;

    protected MainMenuItem applicationItemFromBurger;
    protected SubMenuItem appSubItemFromBurger;
    protected SubMenuItem siteSubItemFromBurger;
    protected SubMenuItem feedbackSubItemFromBurger;
    protected MainMenuItem menuItemFromBurger;
    protected SubMenuItem menuSubItemFromBurger;
    protected SubMenuItem staticPageSubItemFromBurger;
    protected MainMenuItem feedItemFromBurger;
    protected SubMenuItem feedSubItemFromBurger;
    protected MainMenuItem storiesItemFromBurger;
    protected SubMenuItem storySubItemFromBurger;
    protected SubMenuItem storygroupSubItemFromBurger;
    protected SubMenuItem tagSubItemFromBurger;


    protected MainMenuItem feedItem;

    public NavigationUtil(WebDriver driver) {
        this.driver = driver;
        this.applicationItemFromBurger = new MainMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[1]/a");
        this.appSubItemFromBurger = new SubMenuItem(driver, "/html/body/div/aside/section/ul/li[1]/ul/li[1]/a");
        this.siteSubItemFromBurger = new SubMenuItem(driver, "/html/body/div/aside/section/ul/li[1]/ul/li[2]/a");
       // this.feedbackSubItemFromBurger = new SubMenuItem(driver, "//*[@id=\"easyadmin-list-App\"]/div/aside/section/ul/li[1]/ul/li[3]/a");
        this.menuItemFromBurger = new MainMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.menuSubItemFromBurger = new SubMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.staticPageSubItemFromBurger = new SubMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.feedItemFromBurger = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[3]/a");
        this.feedSubItemFromBurger = new SubMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.storiesItemFromBurger = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[4]/a");
        this.storySubItemFromBurger = new SubMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.storySubItemFromBurger = new SubMenuItem(driver, "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.storygroupSubItemFromBurger = new SubMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        this.tagSubItemFromBurger = new SubMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        //this.menuItem = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        //this.menuItem = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
        //this.menuItem = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");
      //  this.menuItem = new MainMenuItem(driver,  "//ul [@class =\"sidebar-menu tree\"]/li[2]/a");

    }

    public void goToApplications() {
        this.applicationItemFromBurger.clickMenuItem();
    }

    public void selectApp() {
        this.applicationItemFromBurger.clickMenuItem();
        this.appSubItemFromBurger.clickMenuItem();
    }

    public void selectSite(){
        this.applicationItemFromBurger.clickMenuItem();
        this.siteSubItemFromBurger.clickMenuItem();
    }

    public void selectFeedback(){
        this.applicationItemFromBurger.clickMenuItem();
        this.feedbackSubItemFromBurger.clickMenuItem();
    }


    public void selectMenu() {
        this.menuItemFromBurger.clickMenuItem();
        this.menuSubItemFromBurger.clickMenuItem();
    }

    public void selectStaticPage(){
        this.menuItemFromBurger.clickMenuItem();
        this.staticPageSubItemFromBurger.clickMenuItem();
    }

    public void selectFeed() {
        this.feedItemFromBurger.clickMenuItem();
        this.feedSubItemFromBurger.clickMenuItem();
    }

    public void selectStories(){
        this.storiesItemFromBurger.clickMenuItem();
        this.storySubItemFromBurger.clickMenuItem();
    }
}
