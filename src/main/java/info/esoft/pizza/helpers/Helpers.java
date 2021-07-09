package info.esoft.pizza.helpers;

import com.codeborne.selenide.*;
import com.codeborne.selenide.ex.ElementNotFound;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.sun.tools.javac.Main;
import info.esoft.pizza.constants.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import info.esoft.pizza.pages.*;

import java.time.Duration;


public class Helpers {

    @Step("Вход в аккаунт и открытие главного меню")
    public static void authorization(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();
        MainPage.clickMenuInNavigatePanel();
    }

    @Step("Собрать набор 50/50 и открыть главное меню")
    public static void collectionFiftyOnFiftySet() {
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();
        FiftyOnFiftyPage.addSet();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.addPizzaOne();
        FiftyOnFiftyPage.addPizzaTwo();
        FiftyOnFiftyPage.changeOnLastPage();
        FiftyOnFiftyPage.buySet();
        FiftyOnFiftyPage.closePageAfterBuy();
    }

    @Step("Скролинг до элемента, чтобы его было видно")
    public static void scrollToElement(SelenideElement searchElement, SelenideElement lastElementThisPage) {
        Boolean isFind = false;

        Integer delY = 1000;

        Integer endX = 300;
        Integer endY = 220;

        Integer startX = 300;
        Integer startY = endY + delY;

        while(!isFind){
            new TouchAction((PerformsTouchActions) WebDriverRunner.getWebDriver())
                    .press(PointOption.point(new Point(startX,startY)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(new Point(endX,endY)))
                    .release()
                    .perform();

            if (searchElement.isDisplayed())
                isFind = true;

            System.out.println("IsFind: " + isFind);
        }
    }
}
