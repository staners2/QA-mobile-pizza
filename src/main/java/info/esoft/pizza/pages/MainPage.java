package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import info.esoft.pizza.helpers.Helpers;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage{

    private static SelenideElement buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button")),
            buttonAgreePromo = $x("//android.view.View[@resource-id='app']/android.view.View[3]/android.view.View[2]/android.view.View"),
            buttonOpenMenu = $x("//android.view.View[@content-desc='#']"),
            buttonSet = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View"),
            buttonBasket = $x("//android.view.View[@content-desc='КОРЗИНА']"),

            buttonMenuInNav = $x("//android.view.View[@content-desc='МЕНЮ']"),
            buttonDrink = $x("");

    @Step("Закрыть окно при запуске приложения о выдаче доступа к телефону")
    public static void cancelConditionAccessNumber(){
        buttonDeny.click();
    }

    @Step("Закрыть окно при запуске приложения с акциями")
    public static void closePromo(){
        buttonAgreePromo.click();
    }

    @Step("Открыть боковое меню")
    public static void openMenu(){
        buttonOpenMenu.click();
    }

    @Step("Открыть меню с товаром 'Наборы'")
    public static void openSetsPage(){
        Helpers.scrollToElement(buttonSet, null);
        buttonSet.click();
    }

    @Step("Открыть меню с товаром 'Напитки'")
    public static void openDrinkPage(){
        Helpers.scrollToElement(buttonDrink, null);
        buttonSet.click();
    }

    @Step("Открыть корзину")
    public static void openBasket(){
        Helpers.scrollToElement(buttonBasket, null);
        buttonBasket.click();
    }

    @Step("Нажать на кнопку 'Меню' в нижней панели")
    public static void clickMenuInNavigatePanel(){
        buttonMenuInNav.click();
    }

    @Step("Есть ли пункт 'Наборы' в нижней части меню")
    public static boolean setIsHaveInMenu(){
        Helpers.scrollToElement(buttonSet, null);
        return buttonSet.isDisplayed();
    }
}
