package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class MenuPage {

    private static SelenideElement imageLogo = $x(""),

            // Элементы меню
            elementEnterAccount = $x("//android.view.View[@content-desc='Войти']"),
            elementMenu = $x("//android.view.View[@content-desc='Меню']"),
            elementPromo = $x("//android.view.View[@content-desc='Акции']"),
            elementBonusProgram = $x("//android.view.View[@content-desc='Бонусная программа']"),
            elementConditionDelivery = $x("//android.view.View[@content-desc='Условия доставки']"),
            elementContact = $x("//android.view.View[@content-desc='Контакты']"),
            elementBasket = $x("//android.view.View[@content-desc='Корзина']");

    @Step("Нажать кнопку 'Войти в аккаунт'")
    public static void enterAccount(){
        elementEnterAccount.click();
    }

    @Step("Есть ли в меню пункт 'Войти в аккаунт'")
    public static boolean enterAccountIsHave(){
        return elementEnterAccount.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Меню'")
    public static boolean menuIsHave(){
        return elementMenu.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Акции'")
    public static boolean promoIsHave(){
        return elementPromo.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Бонусная программа'")
    public static boolean bonusProgramIsHave(){
        return elementBonusProgram.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Условия доставки'")
    public static boolean conditionDeliveryIsHave(){
        return elementConditionDelivery.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Контакты'")
    public static boolean contactIsHave(){
        return elementContact.isDisplayed();
    }

    @Step("Есть ли в меню пункт 'Корзина'")
    public static boolean basketIsHave(){
        return elementBasket.isDisplayed();
    }

}
