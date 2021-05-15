package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CoctailPage {

    @FindBy(css = ".toggle")
    private SelenideElement toggleRed;

    @FindBy(css = ".toggle")
    private SelenideElement toggleSparcling;

    @FindBy(css = ".toggle")
    private SelenideElement closeDropdown;

    @FindBy(css = "[alt=\"Raspberry Rose\"]")
    private SelenideElement raspberryRose;

    @FindBy(css = "[aria-label*=\"Type \"]")
    private SelenideElement categoryMultiple;

    @FindBy(css = ("[class=\"tile recipe-tile\"]"))
    private SelenideElement countCoctail;

    @Step("click On Toggle Red On CoctailPage")
    public void clickOnToggleRedOnCoctailPage() {
        toggleRed.click();
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("document.querySelector('[data-value=\"red\"]',':before').click();");
    }

    @Step("click O nToggle SparclingRed On CoctailPage")
    public void clickOnToggleSparclingRedOnCoctailPage() {
        toggleRed.click();
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("document.querySelector('[data-value=\"bubbles\"]',':before').click();");
    }

    @Step("close Dropdown on CoctailPage")
    public void closeDropdownOnCoctailPage() {
        closeDropdown.click();
    }

    @Step("scrole")
    public CoctailIngredientPage scroleToRoseAndClickOnItOnCoctailPage() {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", raspberryRose);
        raspberryRose.click();
        return new CoctailIngredientPage();
    }

    @Step("multiple Is Displayed On CoctailPage")
    public SelenideElement multipleIsDisplayedOnCoctailPage() {
        return categoryMultiple;
    }


}
