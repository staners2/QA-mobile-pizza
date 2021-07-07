package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class SetsPage {

    // TODO Дописать пути
    private static SelenideElement buttonFilter = $x("//android.view.View[@content-desc='ФИЛЬТР ТОВАРОВ']"),
            textCountOffer = $x("//android.view.View[contains(@text, 'предложения')]"),
            buttonCollectSetFiftyOnFifty = $x("(//android.view.View[@content-desc=\"СОБРАТЬ\"])[1]"),
            titleSetFiftyOnFifty = $x("//android.view.View[@content-desc=\"50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.   от 700 р.\"]/android.view.View[2]"),
            subtitleSetFiftyOnFifty = $x("//android.view.View[@content-desc=\"50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.   от 700 р.\"]/android.view.View[3]"),
            priceSetFiftyOnFifty = $x("//android.view.View[@content-desc=\"50/50 Не можете решить, какую пиццу выбрать?Выбирать больше не нужно: закажите 2 любимые пиццы в одной!Внимание: Акция действует только на ассортимент пицц 36см.   от 700 р.\"]/android.view.View[4]/android.view.View");

    public static void openFilter(){
        buttonFilter.click();
    }

    public static void collectionSetFiftyOnFifty(){
        buttonCollectSetFiftyOnFifty.click();
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

    public static Integer getCountProducts(){
        String textCount = textCountOffer.text().substring(textCountOffer.text().length(), textCountOffer.text().length() - 12);
        return Integer.getInteger(textCount);
    }

    public static Integer getPriceSet(){
        String price = priceSetFiftyOnFifty.text().substring(priceSetFiftyOnFifty.text().length(), priceSetFiftyOnFifty.text().length() - 3);
        price = price.substring(price.length() - (price.length()-3));
        return Integer.getInteger(price);
    }
}
