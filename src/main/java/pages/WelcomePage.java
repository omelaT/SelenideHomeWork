package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.page;

public class WelcomePage {

    @FindBy(css = "[for=\"confirm\"]")
    private SelenideElement text;
    @FindBy(css = "[for=\"confirm\"]")
    private SelenideElement checkbox;
    @FindBy(css = ".agegate-selector-options")
    private SelenideElement select;
    @FindBy(css = "[value=\"Welcome\"]")
    private SelenideElement welcomeButton;
    @FindBy(css = "[value=\"Welcome\"]")
    private SelenideElement welcomeButtonInactive;
    @FindBy(css = "[for=\"confirm\"]")
    private SelenideElement checkboxClick;
    @FindBy(css = ".agegate-selector-options")
    private SelenideElement selectEuropFromDropdown;
    @FindBy(css = "[value=\"Welcome\"]")
    private SelenideElement clickOnWelcomeButton;

    @Step("legal Text Displayed On WelcomePage")
    public SelenideElement legalTextDisplayedOnWelcomePage() {
        return text;
    }

    @Step("checkbox Text Displayed On WelcomePage")
    public SelenideElement checkboxTextDisplayedOnWelcomePage() {
        return checkbox;
    }

    @Step("select I sDispalyed On WelcomePage")
    public SelenideElement selectIsDispalyedOnWelcomePage() {
        return select;
    }

    @Step("welcome Button IsDispalyed On WelcomePage")
    public SelenideElement welcomeButtonIsDispalyedOnWelcomePage() {
        return welcomeButton;
    }

    @Step("welcome Button Is Inactive On WelcomePage")
    public SelenideElement welcomeButtonIsInactiveOnWelcomePage() {
        return welcomeButtonInactive;
    }

    @Step("checkbox Click Europe Select Welcome BttonClick")
    public MainPage checkboxClickEuropeSelectWelcomeBttonClick() {
        checkboxClick.click();
        Select selectEuropFromDropdown = new Select(select);
        selectEuropFromDropdown.selectByVisibleText("Europe");
        clickOnWelcomeButton.click();
        return page(MainPage.class);

    }

}
