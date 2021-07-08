package info.esoft.pizza.helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
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
import org.openqa.selenium.By;
import info.esoft.pizza.pages.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


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

    public static void scrollToElement(SelenideElement searchElement, SelenideElement lastElementThisPage) {
        Boolean isFind = false;

        Integer delY = 300;

        Integer endX = 300;
        Integer endY = 220;

        Integer startX = 300;
        Integer startY = endY + delY;

        while(!isFind){
            new TouchAction((PerformsTouchActions) WebDriverRunner.getWebDriver())
                    .press(PointOption.point(new Point(startX,startY)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(new Point(endX,endY)))
                    .release().perform();

            try{
                searchElement.should(Condition.visible);
            }
            catch (Exception ex){
                System.out.println("Is not found");
            }

            System.out.println("startY: " + startY + "\nendY: " + endY + "\nIsFind: " + isFind);
        }
    }
}
