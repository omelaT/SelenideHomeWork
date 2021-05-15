

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;


public class HWL3Case2 extends SelenidRunner {

    @Feature("navigate As Customer")
    @Test
    public void navigateAsCustomer() {
        WelcomePage welcomePage = open(Constants.BASICURL, WelcomePage.class);

        MainPage mainPage = welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();
        url().contains("yellowtailwine.com");


    }
}
