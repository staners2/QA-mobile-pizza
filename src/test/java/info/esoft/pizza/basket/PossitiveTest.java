package info.esoft.pizza.basket;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.BasketPage;
import info.esoft.pizza.pages.DrinkPage;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Удаление всех товаров из корзины")
    public void deleteAllProducts(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.removeSet();
        BasketPage.agreeRemoveSet();

        Assert.assertTrue(BasketPage.basketIsEmpty());
    }

    @Test
    @DisplayName("Добавление товара в корзину при нескольких переходах в корзину")
    public void addProductInBasketAndExitBasketTest(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.closeBasket();
        MainPage.clickMenuInNavigatePanel();
        MainPage.openDrinkPage();
        DrinkPage.buyPepsi();
        DrinkPage.upCountPepsi();
        MainPage.openBasket();

        Assert.assertTrue(BasketPage.getPriceOrder() == Const.Basket.PRICE_SET_AND_TWO_PEPSI);
    }

    @Test
    @DisplayName("Удаление одного товара из корзины")
    public void removeOneProductFromBasketTest(){
        Helpers.authorization();
        Helpers.collectionFiftyOnFiftySet();
        MainPage.openDrinkPage();
        DrinkPage.buyPepsi();
        DrinkPage.upCountPepsi();
        MainPage.openBasket();
        BasketPage.cancelConditionAccessNumber();
        BasketPage.removePepsi();

        Assert.assertTrue(BasketPage.getPriceOrder() == Const.Basket.PRICE_SET_AND_ONE_PEPSI);
    }

}
