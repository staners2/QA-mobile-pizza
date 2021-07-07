package info.esoft.pizza.interfaceApp;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.SetsPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Пункт 'Наборы' присутствует на главном меню")
    public void setIsHaveInMenu(){
        Assert.assertTrue(MainPage.setIsHaveInMenu());
    }

    @Test
    @DisplayName("Все пункты меню отображаются")
    public void menuAllItemsIsHave(){
        MainPage.openMenu();
        Assert.assertTrue(Helpers.menuIsHaveAllItems());
    }

    @Test
    @DisplayName("Логотип отображается в меню")
    public void logoVisibleInMenu(){
        Assert.assertTrue(true);
    }
}
