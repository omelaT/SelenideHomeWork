
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.WelcomePage;
import utils.Constants;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;


public class HWL3Case1 extends SelenidRunner {

    @Feature("verify Elements On WelcomePage Isdisplayed")
    @Test
    public void verifyElementsOnWelcomePageIsdisplayed() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);

        SelenideElement legalText = welcomePage.legalTextDisplayedOnWelcomePage();
        legalText.shouldHave(text("I am of legal drinking age in"));

        SelenideElement checkboxText = welcomePage.checkboxTextDisplayedOnWelcomePage();
        checkboxText.shouldHave(Condition.exist);

        SelenideElement selectIsDispalyed = welcomePage.selectIsDispalyedOnWelcomePage();
        selectIsDispalyed.shouldHave(exist);

        SelenideElement welcomeButton = welcomePage.welcomeButtonIsDispalyedOnWelcomePage();
        welcomeButton.shouldHave(exist);

        SelenideElement welcomeBtnUnactive = welcomePage.welcomeButtonIsInactiveOnWelcomePage();
        welcomeBtnUnactive.shouldHave(disabled);

    }

}
