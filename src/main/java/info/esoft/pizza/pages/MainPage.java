package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import jdk.jfr.internal.tool.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage{

    private static SelenideElement buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button")),
            buttonAgreePromo = $x("//android.view.View[@resource-id='app']/android.view.View[3]/android.view.View[2]/android.view.View[contains(@text,'ОК')]"),
            buttonOpenMenu = $x("//android.view.View[@content-desc='#']"),
            buttonSet = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View/android.view.View[@content-desc='Наборы']"),
            buttonBasket = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[contains(@content-desc, 'КОРЗИНА')]"),
            // buttonBasket = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[2]"),

            buttonMenuInNav = $x("//android.view.View[@content-desc='МЕНЮ']"),
            buttonDrink = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View/android.view.View[@content-desc='Напитки']");

    @Step("Закрыть окно при запуске приложения о выдаче доступа к телефону")
    public static void cancelConditionAccessNumber(){
        try{
            buttonDeny.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
        }
        catch (ElementNotFound ex){
            System.out.println("Condition access number is not found");
        }

    }

    @Step("Закрыть окно при запуске приложения с акциями")
    public static void closePromo(){
        try{
            buttonAgreePromo.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
        } catch (ElementNotFound ex){
            System.out.println("Promo is not found");
        }
    }

    @Step("Открыть боковое меню")
    public static void openMenu(){
        buttonOpenMenu.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Открыть меню с товаром 'Наборы'")
    public static void openSetsPage(){
        Helpers.scrollToElement(buttonSet, null);
        buttonSet.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Открыть меню с товаром 'Напитки'")
    public static void openDrinkPage(){
        Helpers.scrollToElement(buttonDrink, null);
        buttonDrink.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    // TODO Не открывается корзина
    @Step("Открыть корзину")
    public static void openBasket(){
        // Helpers.scrollToElement(buttonBasket, null);
        System.out.println(">>>>> Before busket click");

        try{
            Thread.sleep(5000);
            buttonBasket.click();
        } catch (Exception ex){

        }

        System.out.println(">>>>> Busket Click");
        //MainPage.openMenu();
        //MenuPage.openBasket();
    }

    @Step("Нажать на кнопку 'Меню' в нижней панели")
    public static void clickMenuInNavigatePanel(){
        buttonMenuInNav.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Есть ли пункт 'Наборы' в нижней части меню")
    public static boolean setIsHaveInMenu(){
        Helpers.scrollToElement(buttonSet, null);
        return buttonSet.isDisplayed();
    }
}
