package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FilterSetsPage {
    private static By buttonSelectPrice = By.xpath("");
    private static By buttonAgreeFilter = By.xpath("");
    private static By buttonClearFilter = By.xpath("");

    private static By inputMinPrice = By.xpath("");
    private static By inputMaxPrice = By.xpath("");
    private static By buttonAgreeChange = By.xpath("");

    public static void openChangeMenu(AndroidDriver driver){
        driver.findElement(buttonSelectPrice).click();
    }

    public static void sendMinPrice(AndroidDriver driver, String minPrice){
        driver.findElement(inputMinPrice).sendKeys(minPrice);
    }

    public static void sendMaxPrice(AndroidDriver driver, String maxPrice){
        driver.findElement(inputMaxPrice).sendKeys(maxPrice);
    }

    public static void agreeChange(AndroidDriver driver){
        driver.findElement(buttonAgreeChange).click();
    }

    public static void agreeFilter(AndroidDriver driver){
        driver.findElement(buttonAgreeFilter).click();
    }

    public static void clearFilter(AndroidDriver driver){
        driver.findElement(buttonClearFilter).click();
    }
}
