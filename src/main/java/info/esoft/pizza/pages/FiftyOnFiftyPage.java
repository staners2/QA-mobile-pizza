package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiftyOnFiftyPage {

    public static WebDriver driver;

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

    public static void addSet(){
        driver.findElement(buttonAddSet).click();
    }

    public static void addPizzaOne(){
        driver.findElement(buttonAddPizzaOne).click();
    }

    public static void addPizzaTwo(){
        driver.findElement(buttonAddPizzaTwo).click();
    }

    public static void changeOnLastPage(){
        driver.findElement(buttonLastPageInUpMenu).click();
    }

    public static void nextPageOnSelectPizza(){
        driver.findElement(buttonPageOnSelectPizza).click();
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

    // TODO Реализовать проверку на активную/не активную кнопку
    public static Boolean buyButtonIsActive(){
        driver.findElement(buttonBuy);
        return true;
    }

    // Открывает страницу SetsPage
    public static void closePageAfterBuy(){
        driver.findElement(buttonOkInstruction).click();
        driver.findElement(buttonBack).click();
    }
}
