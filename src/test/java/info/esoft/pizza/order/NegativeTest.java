package info.esoft.pizza.order;

import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.BasketPage;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NegativeTest {

    @Test
    @DisplayName("Оформление заказа без введенных данных")
    public void orderWithIncorrectData(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();

        Assert.assertFalse(!BasketPage.buttonBuyOrderIsActive());
    }

    @Test
    @DisplayName("Введен неправильный промокод")
    public void orderWithIncorrectPromocode(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();

        BasketPage.sendPromocode(Const.Account.PROMOCODE_ERROR);
        BasketPage.agreePromocode();

        Assert.assertFalse(BasketPage.getDescriptionAfterAgreePromocode().equals(Const.Message.DESCRIPTION_ERROR_PROMOCODE));
    }
}
