package info.esoft.pizza.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage {

    public static WebDriver driver;

    private static By inputNumber = By.xpath("");
    private static By conditionOne = By.xpath("");
    private static By conditionTwo = By.xpath("");
    private static By buttonNext = By.xpath("");

    private static By titlePage = By.xpath("");

    public static void sendNumber(String number){
        driver.findElement(inputNumber).sendKeys(number);
    }

    public static void agreeConditionOne(){
        driver.findElement(conditionOne).click();
    }

    public static void agreeConditionTwo(){
        driver.findElement(conditionTwo).click();
    }

    public static void clickNextButton(){
        driver.findElement(buttonNext).click();
    }
}
