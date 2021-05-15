

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WeiboComMainPage;
import pages.WelcomePage;
import utils.Constants;

import java.sql.SQLException;
import java.util.Set;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;


public class HWL4Case7 extends SelenidRunner {

    @Feature("main Page Global  Nav Logic")
    @Test
    public void mainPageGlobalNavLogic() throws SQLException {

        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        //Globe icon
        mainPage.globeIconIsVisible();

        //click o Globe icon
        mainPage.clickOnTheGlobeIcon();

        //Select China
        mainPage.selectChinaAndClick();

        //click
        Set<String> oldWindowsSet = getWebDriver().getWindowHandles();
        WeiboComMainPage weiboComMainPage = mainPage.clickOnRedirectIcon();

        weiboComMainPage.getDescription(oldWindowsSet);
        //Verify that “https://www.weibo.com/yellowtailChina” site is open in new tab
        url().contains("yellowtailChina");
        getWebDriver().close();

/*
        WeiboComMainPage weiboComMainPage = new WeiboComMainPage();

        weiboComMainPage.getDescription(oldWindowsSet);
        //Verify that “https://www.weibo.com/yellowtailChina” site is open in new tab
        Assertions.assertTrue(DriverProvider.getDriver().getCurrentUrl().contains("weibo"));
        DriverProvider.getDriver().close();
 */

    }
}