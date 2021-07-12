package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DrinkPage {

    // Pepsi 1.5l
    private static SelenideElement buttonBuyPepsi = $x("(//android.view.View[@content-desc='КУПИТЬ'])[2]"),
            buttonOkInstruction = $x("//android.view.View[@content-desc='ВСЕ ПОНЯТНО!']"),
    buttonUpCountPepsi = $x(".//android.view.View[contains(@content-desc, 'Pepsi 1.5 л')]/../android.view.View[2]/android.view.View/android.view.View[2]");

    @Step("Покупка Pepsi")
    public static void buyPepsi(){
        buttonBuyPepsi.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Добавление еще одной Pepsi")
    public static void upCountPepsi(){
        buttonUpCountPepsi.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Закрыть окно инструкции после первой покупки товара")
    public static void closeInstruction(){
        buttonOkInstruction.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }
}
