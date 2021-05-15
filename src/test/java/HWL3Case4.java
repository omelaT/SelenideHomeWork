
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL3Case4 extends SelenidRunner {
    @Feature("menu  Logic")
    @Test
    public void menuCheck() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        //Verify that header with all needed links is appeared
        SelenideElement wineLink = mainPage.wineLinkDisplayedOnMainPage();
        wineLink.shouldHave(Condition.exist);

        SelenideElement stores = mainPage.storesLinkDisplayedOnMainPage();
        stores.shouldHave(Condition.exist);

        SelenideElement ourStory = mainPage.ourStoryLinkDisplayedOnMainPage();
        ourStory.shouldHave(Condition.exist);

        SelenideElement coctails = mainPage.coctailsLinkDisplayedOnMainPage();
        coctails.shouldHave(Condition.exist);

        SelenideElement faqs = mainPage.faqsLinkDisplayedOnMainPage();
        faqs.shouldHave(Condition.exist);

        SelenideElement contacts = mainPage.contactLinkDisplayedOnMainPage();
        contacts.shouldHave(Condition.exist);

        //  4. Click on [yellow tail]
        mainPage.clickOnLogoOnMainPage();
        //  5. Verify that Menu button is visible
        mainPage.menuButtonClickOnMainPage();
    }
}




