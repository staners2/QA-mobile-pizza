package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.corba.se.idl.toJavaPortable.Helper;
import info.esoft.pizza.helpers.Helpers;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private static SelenideElement buttonRemoveSet = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View"),
            buttonRemovePepsi = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View"),

            textPriceOrder = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View/android.widget.TextView[1]"),
            buttonBuyOrder = $x("//android.view.View[@content-desc=\"ОФОРМИТЬ ЗАКАЗ\"]"),
            buttonAgreeRemoveSet = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]"),
            // 'Пустая корзина'
            descriptionAfterRemovePizza = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"),

            inputPromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View[1]/android.widget.ListView[1]/android.view.View/android.view.View/android.widget.EditText"),
            buttonAgreePromocode = $x("//android.view.View[@content-desc=\"ПРИМЕНИТЬ\"]"),
            // TODO Если не вводить промокод, то появится пустое окно
            descriptionAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]"),
            closeWindowAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View"),

            inputName = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText"),
            selectListAddress = $x("//android.view.View[@content-desc='! Район Выберите район']"),
            selectAddress = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View"),
            inputStreet = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[8]/android.view.View[1]/android.widget.EditText"),
            inputAppartment = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText"),

            buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button"));

    @Step("Удалить из корзины набор")
    public static void removeSet(){
        buttonRemoveSet.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Подтвердить удаление из корзины набора")
    public static void agreeRemoveSet(){
        buttonAgreeRemoveSet.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Удалить из корзины пепси")
    public static void removePepsi(){
        buttonRemovePepsi.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Ввести имя")
    public static void sendName(String name){
        Helpers.scrollToElement(inputName, null);
        inputName.sendKeys(name);
    }

    @Step("Выбрать адресс из списка")
    public static void sendAddress(){
        Helpers.scrollToElement(selectListAddress, null);
        selectListAddress.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
        selectAddress.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Ввести улицу")
    public static void sendStreet(String street){
        Helpers.scrollToElement(inputStreet, null);
        inputStreet.shouldBe(Condition.visible, Duration.ofSeconds(3)).sendKeys(street);
    }

    @Step("Ввести дом")
    public static void sendAppartment(String street){
        Helpers.scrollToElement(inputAppartment, null);
        inputAppartment.shouldBe(Condition.visible, Duration.ofSeconds(3)).sendKeys(street);
    }

    @Step("Ввести промокод")
    public static void sendPromocode(String promocode){
        inputPromocode.shouldBe(Condition.visible, Duration.ofSeconds(3)).sendKeys(promocode);
    }

    @Step("Нажать кнопку 'Применить промокод'")
    public static void agreePromocode(){
        buttonAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Закрыть окно после применения промокода")
    public static void closeWindowAfterAgreePromocode(){
        closeWindowAfterAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Закрыть окно при запуске приложения о выдаче доступа к телефону")
    public static void cancelConditionAccessNumber(){
        buttonDeny.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Активна ли кнопка 'Оформить заказ'")
    public static Boolean buttonBuyOrderIsActive(){
        switch (buttonBuyOrder.getAttribute("clickable")){
            case "true":
                return true;
            case "false":
                return false;
            default:
                return null;
        }
    }

    @Step("Получить стоимость заказа")
    public static Integer getPriceOrder(){
        return Integer.parseInt(textPriceOrder.shouldBe(Condition.visible, Duration.ofSeconds(3)).text());
    }

    @Step("Является ли корзина пустой")
    public static Boolean basketIsEmpty(){
        return descriptionAfterRemovePizza.shouldBe(Condition.visible, Duration.ofSeconds(3)).text().contains("Пустая корзина");
    }

    @Step("Получить описание после применения промокода")
    public static String getDescriptionAfterAgreePromocode(){
        return descriptionAfterAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(3)).text();
    }
}
