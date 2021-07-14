package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import io.qameta.allure.Step;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private static SelenideElement buttonRemoveSet = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View"),
            buttonRemovePepsi = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View"),
            buttonBuyOrder = $x("//android.view.View[@content-desc='ОФОРМИТЬ ЗАКАЗ']"),
            modalDialogOrderBuySuccessful = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]"),
            buttonBackspace = $x("//android.view.View[@text ='arrow_left_md']"),

            textPriceOrder = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View/android.widget.TextView[1]"),
            buttonAgreeRemoveSet = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]"),
            // 'Пустая корзина'
            descriptionAfterRemovePizza = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"),

            inputPromocode = $x("//android.view.View [@resource-id='DELIVERY']/android.widget.ListView[1]/android.view.View/android.view.View/android.widget.EditText"),
            buttonAgreePromocode = $x("//android.view.View[@content-desc=\"ПРИМЕНИТЬ\"]"),
            // TODO Если не вводить промокод, то появится пустое окно
            descriptionAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]"),
            closeWindowAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View"),

            inputName = $x("//android.view.View [@resource-id='DELIVERY']/android.widget.ListView[2]/android.view.View[1]//android.widget.EditText"),
            selectListAddress = $x("//android.view.View[@content-desc='! Район Выберите район']"),
            selectAddress = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View"),
            inputStreet = $x("//android.view.View [@resource-id='DELIVERY']/android.view.View[4]/android.view.View/android.widget.EditText"),
            inputHouse = $x("//android.view.View [@resource-id='DELIVERY']/android.view.View[6]/android.view.View/android.widget.EditText"),


            buttonCancelGiveNumber = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]");

    @Step("Удалить из корзины набор")
    public static void removeSet(){
        buttonRemoveSet.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Подтвердить удаление из корзины набора")
    public static void agreeRemoveSet(){
        buttonAgreeRemoveSet.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Удалить из корзины пепси")
    public static void removePepsi(){
        buttonRemovePepsi.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Ввести имя")
    public static void sendName(String name){
        Helpers.scrollToElement(inputName, null);
        inputName.sendKeys(name);
    }

    @Step("Выбрать адресс из списка")
    public static void sendAddress(){
        Helpers.scrollToElement(selectListAddress, null);
        selectListAddress.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
        selectAddress.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Ввести улицу")
    public static void sendStreet(String street){
        Helpers.scrollToElement(inputStreet, null);
        inputStreet.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).sendKeys(street);
    }

    @Step("Ввести дом")
    public static void sendHouse(String street){
        Helpers.scrollToElement(inputHouse, null);
        inputHouse.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).sendKeys(street);
    }

    @Step("Ввести промокод")
    public static void sendPromocode(String promocode){
        inputPromocode.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).sendKeys(promocode);
    }

    @Step("Нажать кнопку 'Применить промокод'")
    public static void agreePromocode(){
        buttonAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Закрыть окно после применения промокода")
    public static void closeWindowAfterAgreePromocode(){
        closeWindowAfterAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Закрыть окно при запуске приложения о выдаче доступа к телефону")
    public static void cancelConditionAccessNumber(){
        try{
            buttonCancelGiveNumber.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
        }
        catch (ElementNotFound ex){
            System.out.println("Condition access number is not found");
        }

    }

    @Step("Выйти из корзины")
    public static void closeBasket(){
        buttonBackspace.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }

    @Step("Активна ли кнопка 'Оформить заказ'")
    public static Boolean buttonBuyOrderIsActive(){
        if (modalDialogOrderBuySuccessful.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Получить стоимость заказа")
    public static String getPriceOrder(){
        return textPriceOrder.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).text();
    }

    @Step("Является ли корзина пустой")
    public static Boolean basketIsEmpty(){
        return descriptionAfterRemovePizza.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).text().contains(Const.Message.CLEAR_BASKET);
    }

    @Step("Получить описание после применения промокода")
    public static String getDescriptionAfterAgreePromocode(){
        return descriptionAfterAgreePromocode.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).text();
    }

    @Step("Оформить заказ")
    public static void buyOrder(){
/*        Helpers.scrollToElement(buttonBuyOrder, null);*/
        buttonBuyOrder.shouldBe(Condition.visible, Duration.ofSeconds(Const.Duration.SEARCH_DURATION)).click();
    }
}
