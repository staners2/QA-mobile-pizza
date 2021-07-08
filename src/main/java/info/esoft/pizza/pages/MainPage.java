package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage{

    private static SelenideElement buttonDeny = $(By.id("com.android.permissioncontroller:id/permission_deny_button")),
            buttonAgreePromo = $x("//android.view.View[@resource-id='app']/android.view.View[5]/android.view.View[2]/android.view.View"),
            buttonOpenMenu = $x("//android.view.View[@content-desc='#']"),
            buttonSet = $x("//android.view.View [@resource-id='app']/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.ListView/android.view.View[3]/android.view.View"),
            buttonBasket = $x("//android.view.View[@content-desc='КОРЗИНА']"),

            buttonMenuInNav = $x("//android.view.View[@content-desc='МЕНЮ']");

    // TODO Delete this
    public static SelenideElement lastElement = $x("//android.widget.ListView/android.view.View[last()]/android.view.View");
    public static SelenideElement searchElement = $x("//android.view.View [@resource-id='app']/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.ListView/android.view.View[3]/android.view.View");


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
        buttonSet.scrollTo();
        buttonSet.click();
    }

    public static void openBasket(){
        buttonBasket.scrollTo();
        buttonBasket.click();
    }

    public static void clickMenuInNavigatePanel(){
        buttonMenuInNav.click();
    }

    public static boolean setIsHaveInMenu(){
        buttonSet.scrollTo();
        return buttonSet.isDisplayed();
    }
}
