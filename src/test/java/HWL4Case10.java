
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.*;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL4Case10 extends SelenidRunner {
    @Feature("navigate To Cocktail RecipePage")
    @Test
    public void navigateToCocktailRecipePage()  {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);
        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");
        // check that we ere on the main page
        SelenideElement main = mainPage.verifyThisIsMainPage();
        main.shouldHave(Condition.exist);
        //2. Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();

        // Navigate to “Cocktails” page
        CoctailPage coctailPage = mainPage.clickOnCoctailPagelinkOnMainPage();

        CoctailIngredientPage coctailIngredientPage = coctailPage.scroleToRoseAndClickOnItOnCoctailPage();
        coctailIngredientPage.ingridientSectionIsDisplayed();

    }

}