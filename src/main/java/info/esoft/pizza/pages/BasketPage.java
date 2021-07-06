package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    // TODO Требуется рефакторинг
    private static SelenideElement buttonRemovePizza = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View");
    private static SelenideElement buttonRemovePepsi = $x("(//android.view.View[@content-desc=\"#\"])[1]/android.view.View/android.view.View");

    private static SelenideElement textPriceOrder = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View/android.widget.TextView[1]");
    private static SelenideElement buttonBuyOrder = $x("//android.view.View[@content-desc=\"ОФОРМИТЬ ЗАКАЗ\"]");
    private static SelenideElement agreeRemovePizza = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]");
    // 'Пустая корзина'
    private static SelenideElement descriptionAfterRemovePizza = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");

    private static SelenideElement inputPromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View[1]/android.widget.ListView[1]/android.view.View/android.view.View/android.widget.EditText");
    private static SelenideElement buttonAgreePromocode = $x("//android.view.View[@content-desc=\"ПРИМЕНИТЬ\"]");
    // TODO Если не вводить промокод, то появится пустое окно
    private static SelenideElement descriptionAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]");
    private static SelenideElement closeWindowAfterAgreePromocode = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View");

    private static SelenideElement inputName = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText");
    private static SelenideElement selectListAddress = $x("//android.view.View[@content-desc='! Район Выберите район']");
    private static SelenideElement selectAddress = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View");
    private static SelenideElement inputStreet = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[8]/android.view.View[1]/android.widget.EditText");
    private static SelenideElement inputAppartment = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText");

    private static SelenideElement buttonCancelAccess = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]");

    public static void removePizza(){
        buttonRemovePizza.click();
    }

    public static void removePepsi(){
        buttonRemovePepsi.click();
    }

    public static void sendName(String name){
        inputName.sendKeys(name);
    }

    public static void sendAddress(){
        selectListAddress.click();
        selectAddress.click();
    }

    public static void sendStreet(String street){
        inputStreet.sendKeys(street);
    }

    public static void sendAppartment(String street){
        inputAppartment.sendKeys(street);
    }

    public static void sendPromocode(String promocode){
        inputPromocode.sendKeys(promocode);
    }

    public static void agreePromocode(){
        buttonAgreePromocode.click();
    }

    public static void closeWindowAfterAgreePromocode(){
        closeWindowAfterAgreePromocode.click();
    }

    public static String getDescriptionAfterRemovePizza(){
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

}
