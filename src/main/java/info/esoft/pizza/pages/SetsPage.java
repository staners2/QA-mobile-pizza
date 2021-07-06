package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetsPage {

    public static WebDriver driver;
    private static By buttonFilter = By.xpath("");
    private static By blockSets = By.xpath("");
    private static By buttonCollectSetFiftyOnFifty = By.xpath("");
    private static By titleSetFiftyOnFifty = By.xpath("");
    private static By subtitleSetFiftyOnFifty = By.xpath("");
    private static By priceSetFiftyOnFifty = By.xpath("");

    public static void openFilter(){
        driver.findElement(buttonFilter).click();
    }

    public static void collectionSetFiftyOnFifty(){
        driver.findElement(buttonCollectSetFiftyOnFifty).click();
    }

    public static String getTitleSetFiftyOnFifty(){
        return driver.findElement(titleSetFiftyOnFifty).getText();
    }

    public static String getSubtitleSetFiftyOnFifty(){
        return driver.findElement(subtitleSetFiftyOnFifty).getText();
    }

    public static String getPriceSetFiftyOnFifty(){
        return driver.findElement(priceSetFiftyOnFifty).getText();
    }

    // TODO Реализовать возврат кол-ва товаров
    public static Integer getCountProducts(){
        driver.findElement(blockSets);
        return 5;
    }

}
