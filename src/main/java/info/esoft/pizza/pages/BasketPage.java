package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {

    public static WebDriver driver;

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

    public static void removePizza(){
        driver.findElement(buttonRemovePizza).click();
    }

    public static void removePepsi(){
        driver.findElement(buttonRemovePepsi).click();
    }

    public static void sendName(String name){
        driver.findElement(inputName).sendKeys(name);
    }

    public static void sendAddress(){
        driver.findElement(selectListAddress).click();
        driver.findElement(selectAddress).click();
    }

    public static void sendStreet(String street){
        driver.findElement(inputStreet).sendKeys(street);
    }

    public static void sendAppartment(String street){
        driver.findElement(inputAppartment).sendKeys(street);
    }

    public static void sendPromocode(String promocode){
        driver.findElement(inputPromocode).sendKeys(promocode);
    }

    public static void agreePromocode(){
        driver.findElement(buttonAgreePromocode).click();
    }

    public static String getDescriptionAfterRemovePizza(){
        return driver.findElement(descriptionAfterRemovePizza).getText();
    }

    // TODO Реализовать проверку на активную кнопку
    public static Boolean buttonBuyOrderIsActiv(){
        driver.findElement(buttonBuyOrder);
        return true;
    }

    public static String getPriceOrder(){
        return driver.findElement(textPriceOrder).getText();
    }

    public static void cancelAccess(){
        driver.findElement(buttonCancelAccess).click();
    }

}
