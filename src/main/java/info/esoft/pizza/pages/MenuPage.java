package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    public static WebDriver driver;

    private static By imageLogo = By.xpath("");

    // Элементы меню
    private static By elementEnterAccount = By.xpath("");
    private static By elementMenu = By.xpath("");
    private static By elementPromo = By.xpath("");
    private static By elementBonusProgram = By.xpath("");
    private static By elementConditionDelivery = By.xpath("");
    private static By elementContact = By.xpath("");
    private static By elementBasket = By.xpath("");

    public void enterAccount(WebDriver driver){
        driver.findElement(elementEnterAccount).click();
    }

    // TODO IsDisplayed покажет ошибку?
    public boolean enterAccountIsHave(){
        return driver.findElement(elementEnterAccount).isDisplayed();
    }

    public boolean menuIsHave(){
        return driver.findElement(elementMenu).isDisplayed();
    }

    public boolean promoIsHave(){
        return driver.findElement(elementPromo).isDisplayed();
    }

    public boolean bonusProgramIsHave(){
        return driver.findElement(elementBonusProgram).isDisplayed();
    }

    public boolean conditionDeliveryIsHave(){
        return driver.findElement(elementConditionDelivery).isDisplayed();
    }

    public boolean contactIsHave(){
        return driver.findElement(elementContact).isDisplayed();
    }

    public boolean basketIsHave(){
        return driver.findElement(elementBasket).isDisplayed();
    }

}
