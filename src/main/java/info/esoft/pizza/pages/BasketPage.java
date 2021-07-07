package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    // TODO Требуется рефакторинг
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

            buttonCancelAccess = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]"),
            buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static void removeSet(){
        buttonRemoveSet.click();
    }

    public static void agreeRemoveSet(){
        buttonAgreeRemoveSet.click();
    }

    public static void removePepsi(){
        buttonRemovePepsi.click();
    }

    public static void sendName(String name){
        inputName.scrollTo();
        inputName.sendKeys(name);
    }

    public static void sendAddress(){
        selectListAddress.scrollTo();
        selectListAddress.click();
        selectAddress.click();
    }

    public static void sendStreet(String street){
        inputStreet.scrollTo();
        inputStreet.sendKeys(street);
    }

    public static void sendAppartment(String street){
        inputAppartment.scrollTo();
        inputAppartment.sendKeys(street);
    }

    public static void sendPromocode(String promocode){
        inputPromocode.scrollTo();
        inputPromocode.sendKeys(promocode);
    }

    public static void agreePromocode(){
        buttonAgreePromocode.scrollTo();
        buttonAgreePromocode.click();
    }

    public static void closeWindowAfterAgreePromocode(){
        closeWindowAfterAgreePromocode.click();
    }

    public static void cancelConditionAccessNumber(){
        buttonDeny.click();
    }

    public static String getDescriptionAfterRemoveSet(){
        return descriptionAfterRemovePizza.getText();
    }

    public static Boolean buttonBuyOrderIsActive(){
        return Boolean.getBoolean(buttonBuyOrder.getAttribute("clickable"));
    }

    public static String getPriceOrder(){
        return textPriceOrder.getText();
    }

    public static void cancelAccess(){
        buttonCancelAccess.click();
    }

    public static Boolean basketIsEmpty(){
        return descriptionAfterRemovePizza.text().contains("Пустая корзина");
    }

    public static String getDescriptionAfterAgreePromocode(){
        return descriptionAfterAgreePromocode.text();
    }
}
