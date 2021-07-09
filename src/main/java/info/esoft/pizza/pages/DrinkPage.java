package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DrinkPage {

    // Pepsi 1.5l
    private static SelenideElement buttonBuyPepsi = $x(""),
            buttonOkInstruction = $x(""),
            buttonUpCountPepsi = $x(""),
            buttonBasket = $x("//android.view.View[@content-desc='КОРЗИНА']");

    @Step("Покупка Pepsi")
    public static void buyPepsi(){
        buttonBuyPepsi.click();
    }

    @Step("Добавление еще одной Pepsi")
    public static void upCountPepsi(){
        buttonUpCountPepsi.click();
    }

    @Step("Закрыть окно инструкции после первой покупки товара")
    public static void closeInstruction(){
        buttonOkInstruction.click();
    }
}
