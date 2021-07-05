package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AuthorizationPage {
    private static By inputNumber = By.xpath("");
    private static By conditionOne = By.xpath("");
    private static By conditionTwo = By.xpath("");
    private static By buttonNext = By.xpath("");

    private static By titlePage = By.xpath("");

    public static void sendNumber(AndroidDriver driver, String number){
        driver.findElement(inputNumber).sendKeys(number);
    }

    public static void agreeConditionOne(AndroidDriver driver){
        driver.findElement(conditionOne).click();
    }

    public static void agreeConditionTwo(AndroidDriver driver){
        driver.findElement(conditionTwo).click();
    }

    public static void clickNextButton(AndroidDriver driver){
        driver.findElement(buttonNext).click();
    }
}
