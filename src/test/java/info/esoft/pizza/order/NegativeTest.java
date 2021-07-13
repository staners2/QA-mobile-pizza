package info.esoft.pizza.order;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.BasketPage;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NegativeTest extends BaseTest {

    @Test
    @DisplayName("Оформление заказа без введенных данных")
    public void orderWithIncorrectData(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.buyOrder();

        Assert.assertFalse(BasketPage.buttonBuyOrderIsActive());
    }

    @Test
    @DisplayName("Ввод неправильного промокода")
    public void orderWithIncorrectPromocode(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();

        BasketPage.sendPromocode(Const.Account.PROMOCODE_ERROR);
        BasketPage.agreePromocode();

        Assert.assertTrue(BasketPage.getDescriptionAfterAgreePromocode().contains(Const.Message.DESCRIPTION_ERROR_PROMOCODE));
    }
}
