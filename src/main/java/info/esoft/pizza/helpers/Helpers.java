package info.esoft.pizza.helpers;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.sun.tools.javac.Main;
import info.esoft.pizza.constants.Const;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import info.esoft.pizza.pages.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Helpers {
    public static void authorization(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();
        MainPage.clickMenuInNavigatePanel();
    }

    public static boolean menuIsHaveAllItems(){
        Boolean result = MenuPage.enterAccountIsHave();
        result = MenuPage.menuIsHave() && result;
        result = MenuPage.basketIsHave() && result;
        result = MenuPage.contactIsHave() && result;
        result = MenuPage.promoIsHave() && result;
        result = MenuPage.bonusProgramIsHave() && result;
        result = MenuPage.conditionDeliveryIsHave() && result;
        return result;
    }

    public static void collectionFiftyOnFiftySet(){
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

    public static void scrollToElement(WebElement element){
        TouchActions action = new TouchActions(WebDriverRunner.getWebDriver());
        action.moveToElement(element);
        action.perform();
    }

}
