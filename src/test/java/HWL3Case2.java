
import org.testng.annotations.Test;
import pages.DriverProvider;
import pages.MainPage;
import pages.WelcomePage;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;

public class HWL3Case2 {
    open(Constants.BASICURL);


    @Test
    public void navigateAsCustomer() {
        open(Constants.BASICURL);
      //  WelcomePage welcomePage = new WelcomePage();

        welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();

        MainPage mainPage = new MainPage();
        Assertions.assertTrue(DriverProvider.getDriver().getCurrentUrl().contains("https://www.yellowtailwine.com/"));

/*
 checkboxClick.click();
        Select selectEuropFromDropdown = new Select(select);
        selectEuropFromDropdown.selectByVisibleText("Europe");
        clickOnWelcomeButton.click();
        return page(MainPage.class);
    }
*/

}
