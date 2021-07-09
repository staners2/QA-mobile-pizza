package info.esoft.pizza.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class SetsPage {

    private static SelenideElement buttonFilter = $x("//android.view.View[@content-desc='ФИЛЬТР ТОВАРОВ']"),
            textCountOffer = $x("//android.view.View[contains(@text, 'предложения')]"),
            buttonCollectSetFiftyOnFifty = $x("(//android.view.View[@content-desc=\"СОБРАТЬ\"])[1]"),

            titleSetFiftyOnFifty = $x("//android.view.View[contains(@content-desc, '50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.')]/android.view.View[2]"),
            subtitleSetFiftyOnFifty = $x("//android.view.View[contains(@content-desc, '50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.')]/android.view.View[3]"),
            priceSetFiftyOnFifty = $x("//android.view.View[contains(@content-desc, '50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.')]/android.view.View[4]/android.view.View");

    @Step("Открыть фильтр товаров")
    public static void openFilter(){
        buttonFilter.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Начать собирать набор 50/50")
    public static void collectionSetFiftyOnFifty(){
        buttonCollectSetFiftyOnFifty.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
    }

    @Step("Получить название набора 50/50")
    public static String getTitleSetFiftyOnFifty(){
        return titleSetFiftyOnFifty.shouldBe(Condition.visible, Duration.ofSeconds(3)).text();
    }

    @Step("Получить описание набора 50/50")
    public static String getSubtitleSetFiftyOnFifty(){
        return subtitleSetFiftyOnFifty.shouldBe(Condition.visible, Duration.ofSeconds(3)).text();
    }

    @Step("Получить кол-во товаров подходящие под выбранный фильтр")
    public static Integer getCountProducts(){
        String textCount = textCountOffer.text().substring(0, textCountOffer.text().length() - 12);
        return Integer.parseInt(textCount);
    }

    @Step("Получить стоимость набора 50/50")
    public static Integer getPriceSet(){
        String price = priceSetFiftyOnFifty.text().substring(0, priceSetFiftyOnFifty.text().length() - 3);
        price = price.substring(3, price.length());
        return Integer.parseInt(price);
    }
}
