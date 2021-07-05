package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;

public class BasketPage {

    private static By buttonRemovePizza = By.xpath("");
    private static By buttonRemovePepsi = By.xpath("");

    private static By textPriceOrder = By.xpath("");
    private static By buttonBuyOrder = By.xpath("");
    private static By agreeRemovePizza = By.xpath("");
    private static By descriptionAfterRemovePizza = By.xpath("");

    private static By inputPromocode = By.xpath("");
    private static By buttonAgreePromocode = By.xpath("");
    private static By descriptionAfterAgreePromocode = By.xpath("");

    private static By inputName = By.xpath("");
    private static By selectListAddress = By.xpath("");
    private static By selectAddress = By.xpath("");
    private static By inputStreet = By.xpath("");
    private static By inputAppartment = By.xpath("");

    private static By buttonCancelAccess = By.xpath("");

    public static void removePizza(AndroidDriver driver){
        driver.findElement(buttonRemovePizza).click();
    }

    public static void removePepsi(AndroidDriver driver){
        driver.findElement(buttonRemovePepsi).click();
    }

    public static void sendName(AndroidDriver driver, String name){
        driver.findElement(inputName).sendKeys(name);
    }

    public static void sendAddress(AndroidDriver driver){
        driver.findElement(selectListAddress).click();
        driver.findElement(selectAddress).click();
    }

    public static void sendStreet(AndroidDriver driver, String street){
        driver.findElement(inputStreet).sendKeys(street);
    }

    public static void sendAppartment(AndroidDriver driver, String street){
        driver.findElement(inputAppartment).sendKeys(street);
    }

    public static void sendPromocode(AndroidDriver driver, String promocode){
        driver.findElement(inputPromocode).sendKeys(promocode);
    }

    public static void agreePromocode(AndroidDriver driver){
        driver.findElement(buttonAgreePromocode).click();
    }

    public static String getDescriptionAfterRemovePizza(AndroidDriver driver){
        return driver.findElement(descriptionAfterRemovePizza).getText();
    }

    // TODO Реализовать проверку на активную кнопку
    public static Boolean buttonBuyOrderIsActiv(AndroidDriver driver){
        driver.findElement(buttonBuyOrder);
        return true;
    }

    public static String getPriceOrder(AndroidDriver driver){
        return driver.findElement(textPriceOrder).getText();
    }

    public static void cancelAccess(AndroidDriver driver){
        driver.findElement(buttonCancelAccess).click();
    }

}
