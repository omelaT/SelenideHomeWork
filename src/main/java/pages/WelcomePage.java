package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.page;

public class WelcomePage  {
   //  WebDriver driver;

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

    public boolean legalTextDisplayedOnWelcomePage() {
        return text.getText().contains("I am of legal drinking age in");
    }

    public boolean checkboxTextDisplayedOnWelcomePage() {
        return checkbox.isDisplayed();
    }

    public boolean selectIsDispalyedOnWelcomePage() {
        return select.isDisplayed();
    }

    public boolean welcomeButtonIsDispalyedOnWelcomePage() {
        return welcomeButton.isDisplayed();
    }

    public boolean welcomeButtonIsInactiveOnWelcomePage() {
        return welcomeButtonInactive.isEnabled();
    }

    public MainPage checkboxClickEuropeSelectWelcomeBttonClick() {
        checkboxClick.click();
        Select selectEuropFromDropdown = new Select(select);
        selectEuropFromDropdown.selectByVisibleText("Europe");
        clickOnWelcomeButton.click();
        return page(MainPage.class);

    }

}
