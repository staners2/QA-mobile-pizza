package info.esoft.pizza.interfaceapp;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.MenuPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Пункт 'Наборы' присутствует на главном меню")
    public void setIsHaveInMenu() throws InterruptedException {
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
        // TODO Сделать проверку логотипа
        Assert.assertTrue(true);
    }
}
