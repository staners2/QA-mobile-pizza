package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
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

    public static void enterAccount(){
        elementEnterAccount.click();
    }

    public static boolean enterAccountIsHave(){
        return elementEnterAccount.isDisplayed();
    }

    public static boolean menuIsHave(){
        return elementMenu.isDisplayed();
    }

    public static boolean promoIsHave(){
        return elementPromo.isDisplayed();
    }

    public static boolean bonusProgramIsHave(){
        return elementBonusProgram.isDisplayed();
    }

    public static boolean conditionDeliveryIsHave(){
        return elementConditionDelivery.isDisplayed();
    }

    public static boolean contactIsHave(){
        return elementContact.isDisplayed();
    }

    public static boolean basketIsHave(){
        return elementBasket.isDisplayed();
    }

}
