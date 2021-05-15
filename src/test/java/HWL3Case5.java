
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;


public class HWL3Case5  extends  SelenidRunner{

@Feature("Click on [yellow tail]")
    @Test
    public void menuButtonLogic() {

        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        //Click on [yellow tail]
        mainPage.clickOnYellowTailOnMainPage();

        //Verify that Menu button is visible
        SelenideElement menuBtnDisplayed = mainPage.menuButtonIsDisplayedOnMainPage();
        menuBtnDisplayed.shouldHave(Condition.exist);

    }


}
