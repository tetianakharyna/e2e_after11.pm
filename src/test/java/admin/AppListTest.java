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

    //needs refactoring
    @Test
    public void ifButtodCreareAppWorks(){
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectApp();
        ApplicationListPage appList = new ApplicationListPage(driver);
        appList.clickCreateButton();
    }

    @Test
    public void createApp() throws InterruptedException {
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectApp();
        ApplicationListPage appList = new ApplicationListPage(driver);
        appList.clickCreateButton();
        ApplicationCreatePage appCreatePage = new ApplicationCreatePage(driver);
        appCreatePage.setNameAppInput("Tanchik");
        appCreatePage.setDescriptionApp("The best app");
        appCreatePage.findDropdownPlatforn();
        appCreatePage.selectPlatformType("IOS");
        appCreatePage.clickSavechanges();
        appList.getPageTitle("Applications");




    }



}
