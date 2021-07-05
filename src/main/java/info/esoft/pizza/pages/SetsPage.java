package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SetsPage {

    private static By buttonFilter = By.xpath("");
    private static By blockSets = By.xpath("");
    private static By buttonCollectSetFiftyOnFifty = By.xpath("");
    private static By titleSetFiftyOnFifty = By.xpath("");
    private static By subtitleSetFiftyOnFifty = By.xpath("");
    private static By priceSetFiftyOnFifty = By.xpath("");

    public static void openFilter(AndroidDriver driver){
        driver.findElement(buttonFilter).click();
    }

    public static void collectionSetFiftyOnFifty(AndroidDriver driver){
        driver.findElement(buttonCollectSetFiftyOnFifty).click();
    }

    public static String getTitleSetFiftyOnFifty(AndroidDriver driver){
        return driver.findElement(titleSetFiftyOnFifty).getText();
    }

    public static String getSubtitleSetFiftyOnFifty(AndroidDriver driver){
        return driver.findElement(subtitleSetFiftyOnFifty).getText();
    }

    public static String getPriceSetFiftyOnFifty(AndroidDriver driver){
        return driver.findElement(priceSetFiftyOnFifty).getText();
    }

    // TODO Реализовать возврат кол-ва товаров
    public static Integer getCountProducts(AndroidDriver driver){
        driver.findElement(blockSets);
        return 5;
    }

}
