package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class MainPage {

    @FindBy(css = ".large-mobile")
    private SelenideElement thisIsMainPage;
    @FindBy(css = ".fa.fa-bars")
    private SelenideElement menubuttonOnMainPageDisplayed;
    @FindBy(css = "[class = \"content animation-screen -one\"] h2")
    private SelenideElement titleOnMainPage;
    @FindBy(css = "[class=\"content animation-screen -one\"] p")
    private SelenideElement passionateText;
    @FindBy(css = "[class=\"content animation-screen -one\"] p")
    private SelenideElement enjoyText;
    @FindBy(css = "[class=\"content animation-screen -one\"]> a")
    private SelenideElement findYourWineButton;
    @FindBy(css = ".primary-footer")
    private SelenideElement footer;
    @FindBy(css = ".fa.fa-bars")
    private SelenideElement clickOnMenuButton;
    @FindBy(css = "[href*=\"wines\"]")
    private SelenideElement wineLink;
    @FindBy(css = "[href*=\"stores\"]")
    private SelenideElement storesLink;
    @FindBy(css = "[href*=\"cocktails\"]")
    private SelenideElement coctailsLink;
    @FindBy(css = "[href*=\"our-story\"]")
    private SelenideElement ourStoryLink;
    @FindBy(css = "[href*=\"faqs\"]")
    private SelenideElement faqsLink;
    @FindBy(css = "[href*=\"contact\"]")
    private SelenideElement contactLink;
    @FindBy(css = "[class=\"yt-logo\"] img[src*=\"logo-yellowtail-white.svg\"]")
    private SelenideElement logoOnMainPage;
    @FindBy(css = ".fa.fa-bars")
    private SelenideElement menuButtonOnMainPage;
    @FindBy(css = "[class=\"yt-logo\"] img[src*=\"logo-yellowtail-white.svg\"]")
    private SelenideElement clickOnYellowTail;
    @FindBy(css = ".fa.fa-globe.fa-lg")
    private SelenideElement globeIcon;
    @FindBy(css = "[data-key=\"CN\"]")
    private SelenideElement selectChina;
    @FindBy(css = "[class=\"sgg-comp-button-inner\"]")
    private SelenideElement findYourWineButtonChangeLang;
    @FindBy(css = "[href*=\"stores\"]")
    private SelenideElement whereToBueMenu;
    @FindBy(css = "[href*=\"cocktails\"]")
    private SelenideElement coctails;

    @FindBy(css = ".fa.fa-weibo")
    private SelenideElement weibo;

    @Step("verify This Is MainPage")
    public SelenideElement verifyThisIsMainPage() {
        return thisIsMainPage;
    }

    @Step("menu Button Is Displayed On MainPage")
    public SelenideElement menuButtonIsDisplayedOnMainPage() {
        return menubuttonOnMainPageDisplayed;
    }

    @Step("title On Main Page Is Displayed")
    public SelenideElement titleOnMainPageIsDisplayed() {
        return titleOnMainPage;
    }

    @Step("passionate Text Is Displayed On MainPage")
    public SelenideElement passionateTextIsDisplayedOnMainPage() {
        return passionateText;
    }

    @Step("enjoy Text Is Displayed On MainPage")
    public SelenideElement enjoyTextIsDisplayedOnMainPage() {
        return enjoyText;
    }

    @Step("find Your Wine Button Is  Displayed On MainPage")
    public SelenideElement findYourWineButtonIsDisplayedOnMainPage() {
        return findYourWineButton;
    }

    @Step("footer On OnMainPage")
    public SelenideElement footerOnOnMainPage() {
        return findYourWineButton;
    }

    @Step("click On Menu Button On MainPage")
    public void clickOnMenuButtonOnMainPage() {
        clickOnMenuButton.click();
    }

    @Step("wine Link Displayed On MainPage")
    public SelenideElement wineLinkDisplayedOnMainPage() {
        return wineLink;
    }

    @Step("stores Link Displayed On MainPage")
    public SelenideElement storesLinkDisplayedOnMainPage() {
        return storesLink;
    }

    @Step("coctails Link Displayed On MainPage")
    public SelenideElement coctailsLinkDisplayedOnMainPage() {
        return coctailsLink;
    }

    @Step("our Story Link Displayed On MainPage")
    public SelenideElement ourStoryLinkDisplayedOnMainPage() {
        return ourStoryLink;
    }

    @Step("faqs Link Displayed On MainPage")
    public SelenideElement faqsLinkDisplayedOnMainPage() {
        return faqsLink;
    }

    @Step("contact Link Displayed On MainPage")
    public SelenideElement contactLinkDisplayedOnMainPage() {
        return contactLink;
    }

    @Step("click On Logo On MainPage")
    public void clickOnLogoOnMainPage() {
        logoOnMainPage.click();
    }

    @Step("menu Button Click On MainPage")
    public void menuButtonClickOnMainPage() {
        menuButtonOnMainPage.click();
    }

    @Step("click On YellowTail On MainPage")
    public void clickOnYellowTailOnMainPage() {
        clickOnYellowTail.click();
    }

    @Step("globeIcon Is Visible")
    public boolean globeIconIsVisible() {
        return globeIcon.isDisplayed();
    }

    @Step("click On The GlobeIcon")
    public static void clickOnTheGlobeIcon() {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("document.querySelector('.fa.fa-globe.fa-lg',':before').click();");
    }

    @Step("select China And Click")
    public WeiboComMainPage selectChinaAndClick() {
        selectChina.click();
        return page(WeiboComMainPage.class);
    }

    @Step("get Changed Language On FindYourWineButton")
    public SelenideElement getChangedLanguageOnFindYourWineButton() {
        return findYourWineButtonChangeLang;
    }

    @Step("click On RedirectIcon")
    public WeiboComMainPage clickOnRedirectIcon() {
        JavascriptExecutor js1 = (JavascriptExecutor) getWebDriver();
        js1.executeScript("document.querySelector('.fa.fa-weibo',':before').click();");
        return page(WeiboComMainPage.class);
    }

    @Step("where To By MenuClick")
    public WhereToBuyPage whereToByMenuClick() {
        whereToBueMenu.click();
        return page(WhereToBuyPage.class);
    }

    @Step("click On Coctail Page link On MainPage")
    public CoctailPage clickOnCoctailPagelinkOnMainPage() {
        coctails.click();
        return page(CoctailPage.class);

    }
}
