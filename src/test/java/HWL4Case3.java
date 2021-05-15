
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL4Case3 extends SelenidRunner {
    @Feature("requirenment Elements Displayed On MainPage")
    @Test
    public void requirenmentElementsDisplayedOnMainPage() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        SelenideElement thisIsMainPage = mainPage.verifyThisIsMainPage();
        thisIsMainPage.shouldHave(Condition.exist);

        SelenideElement menuButton = mainPage.menuButtonIsDisplayedOnMainPage();
        menuButton.shouldHave(Condition.exist);

        SelenideElement mainTitle = mainPage.titleOnMainPageIsDisplayed();
        mainTitle.shouldHave(Condition.exist);

        SelenideElement passionText = mainPage.passionateTextIsDisplayedOnMainPage();
        passionText.shouldHave(Condition.exist);

        SelenideElement enjText = mainPage.enjoyTextIsDisplayedOnMainPage();
        enjText.shouldHave(Condition.exist);

        SelenideElement findWineBtn = mainPage.findYourWineButtonIsDisplayedOnMainPage();
        findWineBtn.shouldHave(Condition.exist);

        SelenideElement footer = mainPage.footerOnOnMainPage();
        footer.shouldHave(Condition.exist);

    }

}