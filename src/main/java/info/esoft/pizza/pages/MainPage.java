package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage{

    private static SelenideElement buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button"));
    private static SelenideElement buttonAgreePromo = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View");
    private static SelenideElement buttonOpenMenu = $x("//android.view.View[@content-desc='#']");
    private static SelenideElement buttonSet = $x("//android.view.View[@content-desc='Пицца']");
    private static SelenideElement buttonBasket = $x("//android.view.View[@content-desc='КОРЗИНА']");

    private static SelenideElement buttonMenuInNav = $x("//android.view.View[@content-desc='МЕНЮ']");

    public static void cancelConditionAccessNumber(){
        buttonDeny.click();
    }

    public static void closePromo(){
        buttonAgreePromo.click();
    }

    public static void openMenu(){
        buttonOpenMenu.click();
    }

    public static void openSetsPage(){
        buttonSet.click();
    }

    public static void openBasket(){
        buttonBasket.click();
    }

    public static void clickMenuInNavigatePanel(){
        buttonMenuInNav.click();
    }
}
