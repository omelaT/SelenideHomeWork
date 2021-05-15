

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL4Case6 extends SelenidRunner {
    @Feature("change language")
    @Test
    public void changeLanguage() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        //Click on Globe icon
        mainPage.clickOnTheGlobeIcon();

        //Select China
        mainPage.selectChinaAndClick();
        // Verify that language is changed
        //- find your wine button
        SelenideElement changedLanguage = mainPage.getChangedLanguageOnFindYourWineButton();
        changedLanguage.shouldHave(Condition.text("发现适合你的酒"));

    }
}