package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        buttonFilter.click();
    }

    @Step("Начать собирать набор 50/50")
    public static void collectionSetFiftyOnFifty(){
        buttonCollectSetFiftyOnFifty.click();
    }

    @Step("Получить название набора 50/50")
    public static String getTitleSetFiftyOnFifty(){
        return titleSetFiftyOnFifty.getText();
    }

    @Step("Получить описание набора 50/50")
    public static String getSubtitleSetFiftyOnFifty(){
        return subtitleSetFiftyOnFifty.getText();
    }

    @Step("Получить кол-во товаров подходящие под выбранный фильтр")
    public static Integer getCountProducts(){
        String textCount = textCountOffer.text().substring(textCountOffer.text().length(), textCountOffer.text().length() - 12);
        return Integer.getInteger(textCount);
    }

    // TODO String index out of range: -3 ERROR
    @Step("Получить стоимость набора 50/50")
    public static Integer getPriceSet(){
        String price = priceSetFiftyOnFifty.text().substring(priceSetFiftyOnFifty.text().length(), priceSetFiftyOnFifty.text().length() - 3);
        price = price.substring(price.length() - (price.length()-3));
        return Integer.getInteger(price);
    }
}
