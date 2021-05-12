package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;

import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    @FindBy(css = ".large-mobile")
    private SelenideElement thisIsMainPage;
    @FindBy(css = ".fa.fa-bars")
    private  SelenideElement menubuttonOnMainPageDisplayed;
    @FindBy(css ="[class = \"content animation-screen -one\"] h2" )
    private SelenideElement titleOnMainPage;
    @FindBy(css ="[class=\"content animation-screen -one\"] p" )
    private SelenideElement  passionateText;
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
    @FindBy(css ="[href*=\"stores\"]")
    private SelenideElement storesLink;
    @FindBy(css ="[href*=\"cocktails\"]")
    private SelenideElement coctailsLink;
    @FindBy(css ="[href*=\"our-story\"]")
    private SelenideElement ourStoryLink;
    @FindBy(css ="[href*=\"faqs\"]")
    private SelenideElement faqsLink;
    @FindBy(css ="[href*=\"contact\"]")
    private SelenideElement contactLink;
    @FindBy(css ="[class=\"yt-logo\"] img[src*=\"logo-yellowtail-white.svg\"]" )
    private SelenideElement logoOnMainPage;
    @FindBy(css =".fa.fa-bars" )
    private SelenideElement menuButtonOnMainPage;
    @FindBy(css ="[class=\"yt-logo\"] img[src*=\"logo-yellowtail-white.svg\"]" )
    private SelenideElement clickOnYellowTail;
    @FindBy(css = ".fa.fa-globe.fa-lg")
    private SelenideElement globeIcon;
    @FindBy(css = "[data-key=\"CN\"]")
    private SelenideElement selectChina;
    @FindBy(css ="[class=\"sgg-comp-button-inner\"]" )
    private SelenideElement findYourWineButtonChangeLang;
    @FindBy(css ="[href*=\"stores\"]" )
    private SelenideElement whereToBueMenu;
    @FindBy(css = "[href*=\"cocktails\"]")
    private SelenideElement coctails;

    @FindBy(css = ".fa.fa-weibo")
    private SelenideElement weibo;


    public boolean verifyThisIsMainPage(){
        return thisIsMainPage.isDisplayed();
    }

    public boolean menuButtonIsDisplayedOnMainPage(){
        return menubuttonOnMainPageDisplayed.isDisplayed();
    }

    public boolean titleOnMainPageIsDisplayed(){
        return titleOnMainPage.isDisplayed();
    }

    public boolean passionateTextIsDisplayedOnMainPage(){
     return   passionateText.isDisplayed();
    }

    public boolean enjoyTextIsDisplayedOnMainPage(){
        return enjoyText.isDisplayed();
    }

    public boolean findYourWineButtonIsDisplayedOnMainPage(){
      return findYourWineButton.isDisplayed();
    }

    public boolean footerOnOnMainPage(){
        return findYourWineButton.isDisplayed();
    }

    public void clickOnMenuButtonOnMainPage(){
        clickOnMenuButton.click();
    }

    public boolean wineLinkDisplayedOnMainPage(){
        return wineLink.isDisplayed();
    }
    public boolean storesLinkDisplayedOnMainPage(){
        return storesLink.isDisplayed();
    }

    public boolean coctailsLinkDisplayedOnMainPage(){
        return coctailsLink.isDisplayed();
    }

    public boolean ourStoryLinkDisplayedOnMainPage(){
        return ourStoryLink.isDisplayed();
    }

    public boolean faqsLinkDisplayedOnMainPage(){
        return faqsLink.isDisplayed();
    }

    public boolean contactLinkDisplayedOnMainPage(){
        return contactLink.isDisplayed();
    }

    public void clickOnLogoOnMainPage(){
        logoOnMainPage.click();
    }

    public void menuButtonClickOnMainPage(){
        menuButtonOnMainPage.click();
    }

    public void clickOnYellowTailOnMainPage(){
        clickOnYellowTail.click();
    }


    public boolean globeIconIsVisible(){
        return globeIcon.isDisplayed();
    }

    public void clickOnTheGlobeIcon(){
        JavascriptExecutor js = (JavascriptExecutor) DriverProvider.getDriver() ;
        js.executeScript("document.querySelector('.fa.fa-globe.fa-lg',':before').click();");
    }
    //Select China

    public WeiboComMainPage selectChinaAndClick() {
        selectChina.click();
        return page(WeiboComMainPage.class);

    }

    public String getChangedLanguageOnFindYourWineButton(){
        return findYourWineButtonChangeLang.getText();
    }

    public WeiboComMainPage clickOnRedirectIcon(){
        JavascriptExecutor js1 = (JavascriptExecutor) DriverProvider.getDriver();
        js1.executeScript("document.querySelector('.fa.fa-weibo',':before').click();");
        return page(WeiboComMainPage.class);
    }

        public WhereToBuyPage whereToByMenuClick(){
            whereToBueMenu.click();
            return page(WhereToBuyPage.class);
        }

    public CoctailPage clickOnCoctailPagelinkOnMainPage(){
        coctails.click();
        return page(CoctailPage.class);

        }

    //ожидания
/*
    public void waitForGlobeIcon() {
       Waiters.waitingForTheElementToBeVisible(globeIcon);
      //  Waiters.waitingForTheElementToBeVisible(weibo);
     //   Waiters.waitingForTheElementToBeVisible(logoOnMainPage);
     //   Waiters.waitingForTheElementToBeVisible(selectChina);
    }
    public void waitForIconAfterChinaSelected(){
        Waiters.waitingForTheElementToBeVisible(weibo);
    }
    public void waitForMenuButton(){
        Waiters.waitingForTheElementToBeVisible(logoOnMainPage);
    }
    public void waitForElementChina(){
        Waiters.waitingForTheElementToBeVisible(selectChina);
    }
    public void waitTime(){
        Waiters.waitingForTheElementToBeVisible(selectChina);
    }



/*
   public void waitForGlobeIcon(){
       new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(globeIcon));
    }

    public void waitForIconAfterChinaSelected(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOf(weibo));
              //  until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa.fa-weibo")));
    }
   public void waitForMenuButton(){

        new WebDriverWait(driver , Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(logoOnMainPage));
              //  until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa.fa-bars")));
    }
    public void waitForElementChina(){
        new WebDriverWait(driver , Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(selectChina));
    }

    public void waitForNewPage(){
        new WebDriverWait(DriverProvider.getDriver() , Duration.ofSeconds(20));
    }
*/





}
