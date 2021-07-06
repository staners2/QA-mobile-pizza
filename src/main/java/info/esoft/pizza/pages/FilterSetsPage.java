package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterSetsPage {

    public static WebDriver driver;

    private static By buttonSelectPrice = By.xpath("");
    private static By buttonAgreeFilter = By.xpath("");
    private static By buttonClearFilter = By.xpath("");

    private static By inputMinPrice = By.xpath("");
    private static By inputMaxPrice = By.xpath("");
    private static By buttonAgreeChange = By.xpath("");

    public static void openChangeMenu(){
        driver.findElement(buttonSelectPrice).click();
    }

    public static void sendMinPrice(String minPrice){
        driver.findElement(inputMinPrice).sendKeys(minPrice);
    }

    public static void sendMaxPrice(String maxPrice){
        driver.findElement(inputMaxPrice).sendKeys(maxPrice);
    }

    public static void agreeChange(){
        driver.findElement(buttonAgreeChange).click();
    }

    public static void agreeFilter(){
        driver.findElement(buttonAgreeFilter).click();
    }

    public static void clearFilter(){
        driver.findElement(buttonClearFilter).click();
    }
}
