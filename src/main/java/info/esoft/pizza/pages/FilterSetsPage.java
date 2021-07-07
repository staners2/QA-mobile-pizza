package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class FilterSetsPage {

    private static SelenideElement buttonSelectPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]"),
            buttonAgreeFilter = $x("//android.view.View[@content-desc='ПРИМЕНИТЬ ФИЛЬТР']"),
            buttonClearFilter = $x("//android.view.View[@content-desc='ОЧИСТИТЬ ФИЛЬТР']"),

            inputMinPrice = $x("//android.widget.EditText[1]"),
            inputMaxPrice = $x("//android.widget.EditText[2]"),
            buttonAgreeChange = $x("//android.view.View[@resource-id='app']/android.view.View[3]/android.view.View[2]/android.view.View[last()]"),

            textMinPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[1]"),
            textMaxPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[3]");

    public static void openChangeMenu(){
        buttonSelectPrice.click();
    }

    public static void sendMinPrice(String minPrice){
       inputMinPrice.sendKeys(minPrice);
    }

    public static void sendMaxPrice(String maxPrice){
        inputMaxPrice.sendKeys(maxPrice);
    }

    public static void agreeChange(){
        buttonAgreeChange.click();
    }

    public static void agreeFilter(){
        buttonAgreeFilter.click();
    }

    public static void clearFilter(){
        buttonClearFilter.click();
    }

    public static Integer getMaxPrice(){
        return Integer.parseInt(inputMaxPrice.text());
    }

    public static Integer getMinPrice(){
        return Integer.parseInt(inputMinPrice.text());
    }
}
