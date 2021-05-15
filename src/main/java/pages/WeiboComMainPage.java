package pages;


import io.qameta.allure.Step;

import java.util.Set;

import static com.codeborne.selenide.WebDriverRunner.*;

public class WeiboComMainPage  {

    @Step("get descriptor")
    public void getDescription(Set <String> oldWindowsSet) {

        Set<String> newWindowsSet =getWebDriver().getWindowHandles();
        // получаем дескриптор нового окна
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        getWebDriver().switchTo().window(newWindowHandle);
        System.out.println("New window title: " + getWebDriver().getTitle());

    }


}
