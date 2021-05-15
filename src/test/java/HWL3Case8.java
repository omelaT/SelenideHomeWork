
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WelcomePage;
import pages.WhereToBuyPage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;


public class HWL3Case8  extends  SelenidRunner{
@Feature("Wher to by page")
    @Test
    public void whereToBy() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        //where to by page
        WhereToBuyPage whereToBuyPage = mainPage.whereToByMenuClick();
        //  Enter valid data in “Your location” field
        whereToBuyPage.locationFieldOnWhereToBuyPage();

        //  3. Click on Search button
        whereToBuyPage.clickOnSearchButtonOnWhereToBuyPage();

        //  4. Verify that the results of search are displayed
        SelenideElement searchResult = whereToBuyPage.searchResultOnWhereToBuyPage();
        searchResult.shouldHave(Condition.exist);
    }
}
