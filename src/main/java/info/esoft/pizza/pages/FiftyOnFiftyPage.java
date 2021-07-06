package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class FiftyOnFiftyPage {

    private static SelenideElement buttonPageOnSelectPizza = $x("//android.view.View[@content-desc=\"Пиццы\"]");
    private static SelenideElement buttonLastPage = $x("//android.view.View[@content-desc=\"Завершить\"]");
    private static SelenideElement buttonBuy = $x("//android.view.View[@content-desc=\"КУПИТЬ\"]");
    private static SelenideElement buttonOkInstruction = $x("//android.view.View[@content-desc=\"ВСЕ ПОНЯТНО!\"]");
    private static SelenideElement buttonBack = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]");

    // TODO Требуется рефакторинг
    private static SelenideElement titleSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]");
    private static SelenideElement subtitleSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");
    private static SelenideElement priceSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]");

    private static SelenideElement buttonAddSet = $x("//android.view.View[@content-desc=\"ДОБАВИТЬ\"]");
    // Пицца с названием "Гавайка"
    private static SelenideElement buttonAddPizzaOne = $x("(//android.view.View[@content-desc=\"ДОБАВИТЬ\"])[1]");
    // Пицца с названием "Четыре сыра"
    private static SelenideElement buttonAddPizzaTwo = $x("(//android.view.View[@content-desc=\"ДОБАВИТЬ\"])[2]");

    public static void addSet(){
        buttonAddSet.click();
    }

    public static void addPizzaOne(){
        buttonAddPizzaOne.click();
    }

    public static void addPizzaTwo(){
        buttonAddPizzaTwo.click();
    }

    public static void changeOnLastPage(){
        buttonLastPage.click();
    }

    public static void nextPageOnSelectPizza(){
        buttonPageOnSelectPizza.click();
    }

    public static String getTitleSetFiftyOnFifty(){
        return titleSetFiftyOnFifty.getText();
    }

    public static String getSubtitleSetFiftyOnFifty(){
        return subtitleSetFiftyOnFifty.getText();
    }

    public static String getPriceSetFiftyOnFifty(){
        return priceSetFiftyOnFifty.getText();
    }

    // TODO Реализовать проверку на активную/не активную кнопку
    public static Boolean buyButtonIsActive(){
        return Boolean.getBoolean(buttonBuy.getAttribute("clickable"));
    }

    // Открывает страницу SetsPage
    public static void closePageAfterBuy(){
        buttonOkInstruction.click();
        buttonBack.click();
    }
}
