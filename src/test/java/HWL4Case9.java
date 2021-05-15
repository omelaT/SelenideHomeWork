
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import pages.CoctailPage;
import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL4Case9 extends SelenidRunner {
    @Feature("select One Wine")

    @Test
    public void selectOneWine() {
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

        coctailPage.clickOnToggleRedOnCoctailPage();
        //close dropdown
        coctailPage.closeDropdownOnCoctailPage();

        //Verify that 7 recipes are displayed
        Dimension count = getWebDriver().findElement(By.cssSelector("[class=\"tile recipe-tile\"]")).getSize();
        count.equals(7);


/*
        //Verify that 7 recipes are displayed
       // int coctailNumber = 7;
      //  Assertions.assertEquals(coctailNumber,coctailPage.numberOfCoctailsDisplayed());
        int count = DriverProvider.getDriver().findElements(By.cssSelector("[class=\"tile recipe-tile\"]")).size();
        System.out.println(count);
        Assertions.assertEquals(7,count);
    }
 */
    }
}