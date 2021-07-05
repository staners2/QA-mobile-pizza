package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FiftyOnFiftyPage {

    private static By buttonPageOnSelectPizza = By.xpath("");
    private static By buttonLastPageInUpMenu = By.xpath("");
    private static By buttonBuy = By.xpath("");
    private static By buttonOkInstruction = By.xpath("");
    private static By buttonBack = By.xpath("");

    private static By titleSetFiftyOnFifty = By.xpath("");
    private static By subtitleSetFiftyOnFifty = By.xpath("");
    private static By priceSetFiftyOnFifty = By.xpath("");

    private static By buttonAddSet = By.xpath("");
    // Пицца с названием "Гавайка"
    private static By buttonAddPizzaOne = By.xpath("");
    // Пицца с названием "Четыре сыра"
    private static By buttonAddPizzaTwo = By.xpath("");

    public static void addSet(AndroidDriver driver){
        driver.findElement(buttonAddSet).click();
    }

    public static void addPizzaOne(AndroidDriver driver){
        driver.findElement(buttonAddPizzaOne).click();
    }

    public static void addPizzaTwo(AndroidDriver driver){
        driver.findElement(buttonAddPizzaTwo).click();
    }

    public static void changeOnLastPage(AndroidDriver driver){
        driver.findElement(buttonLastPageInUpMenu).click();
    }

    public static void nextPageOnSelectPizza(AndroidDriver driver){
        driver.findElement(buttonPageOnSelectPizza).click();
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

    // TODO Реализовать проверку на активную/не активную кнопку
    public static Boolean buyButtonIsActive(AndroidDriver driver){
        driver.findElement(buttonBuy);
        return true;
    }

    // Открывает страницу SetsPage
    public static void closePageAfterBuy(AndroidDriver driver){
        driver.findElement(buttonOkInstruction).click();
        driver.findElement(buttonBack).click();
    }
}
