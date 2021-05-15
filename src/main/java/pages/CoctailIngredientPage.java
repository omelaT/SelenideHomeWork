package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class CoctailIngredientPage {

    @FindBy(css = "[class=\"recipe-intro\"]")
    private SelenideElement ingridientSection;

    @Step("ingridient Section Is Displayed")
    public SelenideElement ingridientSectionIsDisplayed() {
        return ingridientSection;
    }

}
