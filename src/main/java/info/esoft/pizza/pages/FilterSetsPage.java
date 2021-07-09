package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class FilterSetsPage {

    private static SelenideElement buttonSelectPrice = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.ListView/android.view.View"),
            buttonAgreeFilter = $x("//android.view.View[@content-desc='ПРИМЕНИТЬ ФИЛЬТР']"),
            buttonClearFilter = $x("//android.view.View[@content-desc='ОЧИСТИТЬ ФИЛЬТР']"),

            inputMinPrice = $x("//android.widget.EditText[1]"),
            inputMaxPrice = $x("//android.widget.EditText[2]"),
            buttonAgreeChange = $x("//android.view.View[@resource-id='app']/android.view.View[3]/android.view.View[2]/android.view.View[last()]"),

            minPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[1]"),
            maxPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[3]");

    @Step("Открыть меню для изменения диапазона цены")
    public static void openChangeMenu(){
        buttonSelectPrice.click();
    }

    @Step("Ввести цену в поле 'Минимальная цена'")
    public static void sendMinPrice(String minPrice){
       inputMinPrice.sendKeys(minPrice);
    }

    @Step("Ввести цену в поле 'Максимальная цена'")
    public static void sendMaxPrice(String maxPrice){
        inputMaxPrice.sendKeys(maxPrice);
    }

    @Step("Применить изменения")
    public static void agreeChange(){
        buttonAgreeChange.click();
    }

    @Step("Прменить фильтр")
    public static void agreeFilter(){
        buttonAgreeFilter.click();
    }

    @Step("Нажать кнопку 'Очистить фильтр'")
    public static void clearFilter(){
        buttonClearFilter.click();
    }

    @Step("Получить установленную максимальную стоимость")
    public static Integer getMaxPrice(){
        return Integer.parseInt(maxPrice.text());
    }

    @Step("Получить установленную минимальную стоимость")
    public static Integer getMinPrice(){
        return Integer.parseInt(minPrice.text());
    }
}
