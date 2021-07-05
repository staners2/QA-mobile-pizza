package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MenuPage {
    private static By imageLogo = By.xpath("");

    // Элементы меню
    private static By elementEnterAccount = By.xpath("");
    private static By elementMenu = By.xpath("");
    private static By elementPromo = By.xpath("");
    private static By elementBonusProgram = By.xpath("");
    private static By elementConditionDelivery = By.xpath("");
    private static By elementContact = By.xpath("");
    private static By elementBasket = By.xpath("");

    public void enterAccount(AndroidDriver driver){
        driver.findElement(elementEnterAccount).click();
    }

    // TODO IsDisplayed покажет ошибку?
    public boolean enterAccountIsHave(AndroidDriver driver){
        return driver.findElement(elementEnterAccount).isDisplayed();
    }

    public boolean menuIsHave(AndroidDriver driver){
        return driver.findElement(elementMenu).isDisplayed();
    }

    public boolean promoIsHave(AndroidDriver driver){
        return driver.findElement(elementPromo).isDisplayed();
    }

    public boolean bonusProgramIsHave(AndroidDriver driver){
        return driver.findElement(elementBonusProgram).isDisplayed();
    }

    public boolean conditionDeliveryIsHave(AndroidDriver driver){
        return driver.findElement(elementConditionDelivery).isDisplayed();
    }

    public boolean contactIsHave(AndroidDriver driver){
        return driver.findElement(elementContact).isDisplayed();
    }

    public boolean basketIsHave(AndroidDriver driver){
        return driver.findElement(elementBasket).isDisplayed();
    }

}
