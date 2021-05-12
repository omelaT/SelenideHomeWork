
import org.testng.annotations.Test;
import pages.WelcomePage;
import utils.Constants;


import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class HWL3Case1  {


    @Test

    public void verifyElementsOnWelcomePageIsdisplayed() {
        open(Constants.BASICURL);
        $(byCssSelector("[for=\"confirm\"]")).isDisplayed() ;
        $(byCssSelector( "[for=\"confirm\"]")).isDisplayed();
        $(byCssSelector( ".agegate-selector-options")).isDisplayed();
        $(byCssSelector( "[value=\"Welcome\"]")).isDisplayed();
        $(byCssSelector( "[value=\"Welcome\"]")).isDisplayed();

/*
        WelcomePage welcomePage = new WelcomePage()

        Assertions.assertTrue(welcomePage.legalTextDisplayedOnWelcomePage());
        Assertions.assertTrue(welcomePage.checkboxTextDisplayedOnWelcomePage());
        Assertions.assertTrue(welcomePage.selectIsDispalyedOnWelcomePage());
        Assertions.assertTrue(welcomePage.welcomeButtonIsDispalyedOnWelcomePage());
        Assertions.assertFalse(welcomePage.welcomeButtonIsInactiveOnWelcomePage());


 */
    }

}
