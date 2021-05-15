package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.FindBy;


public class WhereToBuyPage  {

    @FindBy(css = "[id=\"locationName\"]")
    private SelenideElement locationField;
    @FindBy(css = ".search-submit")
    private SelenideElement clickOnSearch;
    @FindBy(css = "[class=\"tile\"]:first-child")
    private SelenideElement searchResult;
@Step("location Field On WhereToBuyPage")
    public void locationFieldOnWhereToBuyPage() {
        locationField.sendKeys("Kiev Street, Merrylands NSW, Australia");
        locationField.sendKeys(Keys.ENTER);
    }
@Step("click On Search Button On WhereToBuyPage")
    public void clickOnSearchButtonOnWhereToBuyPage() {
        clickOnSearch.click();
    }
@Step("search Result On WhereToBuyPage")
    public SelenideElement searchResultOnWhereToBuyPage() {
        return searchResult;
    }

}
