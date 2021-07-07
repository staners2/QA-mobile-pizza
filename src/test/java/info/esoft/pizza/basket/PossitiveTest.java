package info.esoft.pizza.basket;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.BasketPage;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Удаление всех товаров из корзины")
    public void deleteAllProducts(){
        Helpers.authorization();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.removeSet();
        BasketPage.agreeRemoveSet();
        Assert.assertTrue(BasketPage.getDescriptionAfterRemoveSet().equals(Const.Message.CLEAR_BASKET));
    }

    // TODO 2 теста

}
