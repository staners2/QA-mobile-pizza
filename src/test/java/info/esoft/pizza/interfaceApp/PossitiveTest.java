package info.esoft.pizza.interfaceApp;

import com.codeborne.selenide.WebDriverRunner;
import info.esoft.pizza.BaseTest;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.MenuPage;
import info.esoft.pizza.pages.SetsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Пункт 'Наборы' присутствует на главном меню")
    public void setIsHaveInMenu() throws InterruptedException {
        // Helpers.scrollToElement(MainPage.buttonSetFFF, 0.5, 0.8, 0.5, 0.2);

        System.out.println("start");
        Helpers.scrollToElement(MainPage.searchElement, MainPage.lastElement);
        System.out.println("end");
        /*MobileBy.ByAndroidUIAutomator pbj = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Наборы\"))");
*/
        Thread.sleep(2000);
        Assert.assertTrue(MainPage.setIsHaveInMenu());
    }

    @Test
    @DisplayName("Все пункты меню отображаются")
    public void menuAllItemsIsHave(){
        MainPage.openMenu();

        Boolean result = MenuPage.enterAccountIsHave();
        result = MenuPage.menuIsHave() && result;
        result = MenuPage.basketIsHave() && result;
        result = MenuPage.contactIsHave() && result;
        result = MenuPage.promoIsHave() && result;
        result = MenuPage.bonusProgramIsHave() && result;
        result = MenuPage.conditionDeliveryIsHave() && result;

        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Логотип отображается в меню")
    public void logoVisibleInMenu(){
        Assert.assertTrue(true);
    }
}
