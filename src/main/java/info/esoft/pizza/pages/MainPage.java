package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage{

    public static WebDriver driver;
    private static By buttonDeny = By.id("com.android.permissioncontroller:id/permission_deny_button");
    private static By buttonAgreePromo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View");
    private static By buttonOpenMenu = By.xpath("");
    private static By buttonSet = By.xpath("");
    private static By buttonBasket = By.xpath("");


    public static void cancelConditionAccessNumber(){
        driver.findElement(buttonDeny).click();
    }

    public static void closePromo(){
        driver.findElement(buttonAgreePromo).click();
    }

    public static void openMenu(){
        driver.findElement(buttonOpenMenu).click();
    }

    public static void openSetsPage(){
        driver.findElement(buttonSet).click();
    }

    public static void openBasket(){
        driver.findElement(buttonBasket).click();
    }
}
