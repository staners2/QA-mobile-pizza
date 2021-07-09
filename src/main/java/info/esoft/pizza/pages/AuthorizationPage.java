package info.esoft.pizza.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
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

    @Step("Ввод номера телефона")
    public static void sendNumber(String number){
        inputNumber.sendKeys(number);
    }

    @Step("Подтверждение соглашения на обработку персональных данных")
    public static void agreeConditionOne(){
        conditionOne.click();
    }

    @Step("Подтверждение соглашения на распространение персональных данных")
    public static void agreeConditionTwo(){
        conditionTwo.click();
    }

    @Step("Нажатие кнопки 'далее' для входа в аккаунт")
    public static void clickNextButton(){
        buttonNext.click();
    }

    @Step("Появление окна 'Личный кабинет'")
    public static boolean isInputValidData(){
        return titlePage.isDisplayed();
    }
}
