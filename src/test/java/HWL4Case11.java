
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ToWebElement;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CoctailPage;
import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HWL4Case11 extends SelenidRunner {

    @Feature("select Several Wines")
    @Test
    public void selectSeveralWines() {
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

        //  Select “Red wine cocktails”
        //1 click toggle .toggle
        coctailPage.clickOnToggleRedOnCoctailPage();
        // Select “Sparkling wine cocktails”
        coctailPage.clickOnToggleSparclingRedOnCoctailPage();
        //close dropdown
        coctailPage.closeDropdownOnCoctailPage();

        //4. Verify that “Multiple” word is displayed in “Type” dropdown
        SelenideElement multiple = coctailPage.multipleIsDisplayedOnCoctailPage();
        //5. Verify that 18 recipes are displayedint
        multiple.shouldHave(Condition.text("Multiple"));
        Dimension count = getWebDriver().findElement(By.cssSelector("[class=\"tile recipe-tile\"]")).getSize();
        count.equals(18);


/*
 //Verify that 7 recipes are displayed
        Dimension count = getWebDriver().findElement(By.cssSelector("[class=\"tile recipe-tile\"]")).getSize();
        count.equals(7);

        //4. Verify that “Multiple” word is displayed in “Type” dropdown
        //aria-label="Type - select to access the drop down menu of wine types"
        WebElement categoryMultiple = DriverProvider.getDriver().findElement(By.cssSelector("[aria-label*=\"Type \"]"));

        Assertions.assertTrue(coctailPage.multipleIsDisplayedOnCoctailPage().contains("Multiple"));

        //5. Verify that 18 recipes are displayedint
        int count = DriverProvider.getDriver().findElements(By.cssSelector("[class=\"tile recipe-tile\"]")).size();
       System.out.println(count);
        Assertions.assertEquals(18,count);

 */
    }
}