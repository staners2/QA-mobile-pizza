package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class FilterSetsPage {

    private static SelenideElement buttonSelectPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]");
    private static SelenideElement buttonAgreeFilter = $x("//android.view.View[@content-desc='ПРИМЕНИТЬ ФИЛЬТР']");
    private static SelenideElement buttonClearFilter = $x("//android.view.View[@content-desc='ОЧИСТИТЬ ФИЛЬТР']");

    private static SelenideElement inputMinPrice = $x("//android.widget.EditText[1]");
    private static SelenideElement inputMaxPrice = $x("//android.widget.EditText[2]");
    private static SelenideElement buttonAgreeChange = $x("//android.view.View[@resource-id='app']/android.view.View[3]/android.view.View[2]/android.view.View[last()]");

    private static SelenideElement textMinPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[1]");
    private static SelenideElement textMaxPrice = $x("//android.view.View[contains(@content-desc, 'Цена, руб.')]/android.view.View/android.widget.TextView[3]");

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
}
