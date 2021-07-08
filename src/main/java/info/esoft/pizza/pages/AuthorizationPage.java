package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    private static SelenideElement inputNumber = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]//android.widget.EditText"),
            conditionOne = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]//android.widget.ListView/android.view.View[2]/android.view.View[1]"),
            conditionTwo = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]//android.widget.ListView/android.view.View[3]/android.view.View[1]"),
            buttonNext = $x("//android.view.View[@content-desc='ПРОДОЛЖИТЬ →']"),
    // Личный кабинет
            titlePage = $x("//android.view.View[@resource-id='app']/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]");

    public static void sendNumber(String number){
        inputNumber.sendKeys(number);
    }

    public static void agreeConditionOne(){
        conditionOne.click();
    }

    public static void agreeConditionTwo(){
        conditionTwo.click();
    }

    public static void clickNextButton(){
        buttonNext.click();
    }

    public static boolean isInputValidData(){
        return titlePage.isDisplayed();
    }
}
