package admin;

import admin.app.ApplicationCreatePage;
import admin.app.ApplicationListPage;
import base.BaseTest;
import base.NavigationUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppListTest extends BaseTest {
    //NavigationUtil navigationUtil = new NavigationUtil(driver);
    //ApplicationListPage appList = new ApplicationListPage(driver);

    @Test
    public void checkGoToAppAppList() {
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectApp();
        ApplicationListPage appList = new ApplicationListPage(driver);
        appList.getPageTitle("Applications");
    }

    //keep getting java.lang.AssertionError: expected [Actual: page title is : Create App] but found [true]
    @Test
    public void ifButtonCreareAppWorks(){
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectApp();
        ApplicationListPage appList = new ApplicationListPage(driver);
        appList.clickCreateButton();
        ApplicationCreatePage appCreatePage = new ApplicationCreatePage(driver);
        appCreatePage.getPageTitle("Create App");
    }

    @Test
    public void createApp() throws InterruptedException {
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectApp();
        ApplicationListPage appList = new ApplicationListPage(driver);
        appList.clickCreateButton();
        ApplicationCreatePage appCreatePage = new ApplicationCreatePage(driver);
        Thread.sleep(3000);
        appCreatePage.setNameAppInput("webApp.ua");
        Thread.sleep(3000);
        appCreatePage.setDescriptionApp("The best app");
        appCreatePage.findDropdownPlatforn();
        appCreatePage.selectPlatformType("IOS");
        appCreatePage.clickSavechanges();
        appList.getPageTitle("Applications");
    }



}
