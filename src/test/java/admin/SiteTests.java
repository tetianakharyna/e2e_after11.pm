package admin;

import admin.app.SiteCreatePage;
import admin.app.SiteListPage;
import base.BaseTest;
import base.NavigationUtil;
import org.testng.annotations.Test;

public class SiteTests extends BaseTest {

    @Test
    public void createSite () throws InterruptedException {
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectSite();
        SiteListPage siteListPage = new SiteListPage(driver);
        siteListPage.clickCreateSiteButton();
        SiteCreatePage siteCreatePage = new SiteCreatePage(driver);
        siteCreatePage.setDomain("crazystories.com");
        siteCreatePage.selectNoneAdblock();
        siteCreatePage.clickSaveChangesSite();
        siteListPage.checkIsSitePresent("crazystories.com");
    }

    @Test
    public void createSite2 () throws InterruptedException {
        NavigationUtil navigationUtil = new NavigationUtil(driver);
        navigationUtil.selectSite();

    }
}
