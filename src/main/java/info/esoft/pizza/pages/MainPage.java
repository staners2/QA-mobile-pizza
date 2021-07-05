package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainPage{
    private static By buttonDeny = By.id("com.android.permissioncontroller:id/permission_deny_button");
    private static By buttonAgreePromo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View");
    private static By buttonOpenMenu = By.xpath("");
    private static By buttonSet = By.xpath("");
    private static By buttonBasket = By.xpath("");


    public static void cancelConditionAccessNumber(AndroidDriver driver){
        driver.findElement(buttonDeny).click();
    }

    public static void closePromo(AndroidDriver driver){
        driver.findElement(buttonAgreePromo).click();
    }

    public static void openMenu(AndroidDriver driver){
        driver.findElement(buttonOpenMenu).click();
    }

    public static void openSetsPage(AndroidDriver driver){
        driver.findElement(buttonSet).click();
    }

    public static void openBasket(AndroidDriver driver){
        driver.findElement(buttonBasket).click();
    }
}
