package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FiftyOnFiftyPage {

    private static SelenideElement buttonPageOnSelectPizza = $x("//android.view.View[@content-desc=\"Пиццы\"]"),
            buttonLastPage = $x("//android.view.View[@content-desc=\"Завершить\"]"),
            buttonNextPage = $x("//android.view.View[@content-desc='ДАЛЕЕ']/android.widget.TextView"),
            buttonBuy = $x("//android.view.View[@content-desc=\"КУПИТЬ\"]"),
            buttonOkInstruction = $x("//android.view.View[@content-desc=\"ВСЕ ПОНЯТНО!\"]"),
            buttonBack = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]"),

            titleSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]"),
            subtitleSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"),
            priceSetFiftyOnFifty = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]"),

            buttonAddSet = $x("//android.view.View[@content-desc=\"ДОБАВИТЬ\"]"),
            // Пицца с названием "Гавайка"
            buttonAddPizzaOne = $x("(//android.view.View[@content-desc=\"ДОБАВИТЬ\"])[1]"),
            // Пицца с названием "Четыре сыра"
            buttonAddPizzaTwo = $x("(//android.view.View[@content-desc=\"ДОБАВИТЬ\"])[2]");

    @Step("Добавить сет в набор")
    public static void addSet(){
        buttonAddSet.click();
    }

    @Step("Добавить пиццу 'Гавайка'")
    public static void addPizzaOne(){
        buttonAddPizzaOne.click();
    }

    @Step("Добавить пиццу 'Четыре сыра'")
    public static void addPizzaTwo(){
        buttonAddPizzaTwo.click();
    }

    @Step("Пролистать до страницу 'Завершение' сборки набора")
    public static void changeOnLastPage() {
        try{
            buttonNextPage.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
            buttonNextPage.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
            buttonNextPage.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step("Переключить на страницу выбора 'Пиццы'")
    public static void nextPageOnSelectPizza(){
        buttonPageOnSelectPizza.click();
    }

    @Step("Нажать кнопку 'купить' набор")
    public static void buySet(){
        buttonBuy.click();
    }

    @Step("Получить название набора 50/50")
    public static String getTitleSetFiftyOnFifty(){
        return titleSetFiftyOnFifty.getText();
    }

    @Step("Получить описание набора 50/50")
    public static String getSubtitleSetFiftyOnFifty(){
        return subtitleSetFiftyOnFifty.getText();
    }

    @Step("Получить стоимость набора 50/50")
    public static Integer getPriceSet(){
        String price = priceSetFiftyOnFifty.text().substring(priceSetFiftyOnFifty.text().length(), priceSetFiftyOnFifty.text().length() - 3);
        price = price.substring(price.length() - (price.length()-3));
        return Integer.getInteger(price);
    }

    @Step("Проверить доступно ли нажатие кнопки 'Купить' набор")
    public static Boolean buyButtonIsActive(){
        switch (buttonBuy.getAttribute("clickable")){
            case "true":
                return true;
            case "false":
                return false;
            default:
                return null;
        }
    }

    @Step("Закрыть окно после покупки набора")
    public static void closePageAfterBuy(){
        buttonOkInstruction.click();
        buttonBack.click();
        MainPage.clickMenuInNavigatePanel();
    }
}
