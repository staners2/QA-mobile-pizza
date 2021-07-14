package info.esoft.pizza.order;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.BasketPage;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest{

    // TODO Запустить еще раз
    @Test
    @DisplayName("Оформление заказа с корректно введенными данными")
    public void formAnOrderWithCorrectData(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.sendName(Const.Account.NAME);
        BasketPage.sendAddress();
        // TODO Кривой ввод в input
        BasketPage.sendStreet(Const.Account.STREET);
        BasketPage.sendHouse(Const.Account.HOUSE);
        BasketPage.buyOrder();

        Assert.assertTrue(BasketPage.buttonBuyOrderIsActive());
    }
}
