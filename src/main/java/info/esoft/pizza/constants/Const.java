package info.esoft.pizza.constants;

import com.codeborne.selenide.Configuration;

public interface Const {
    interface Account{
        String NAME = "test";
        String NUMBER = "79555555555";
        String STREET = "test";
        String APPARTAMENT = "test";
        String HOUSE = "22";

        String PROMOCODE_ERROR = "123456";
    }

    interface Filter{
        int COUNT_PRODUCT = 1;
        int COUNT_PRODUCT_AFTER_CLEAR = 4;

        String MIN_PRICE = "700";
        String MAX_PRICE = "799";

        int MIN_PRICE_AFTER_INPUT_INCORRECT = 700;
        int MAX_PRICE_AFTER_INPUT_INCORRECT = 700;
    }

    interface Message{
        String CLEAR_BASKET = "Пустая корзина";
        String DESCRIPTION_ERROR_PROMOCODE = "Вы указали неверный или не действующий номер карты или скидки";
    }

    interface Basket{
        int PRICE_ONE_SET = 700;
        String PRICE_SET_AND_ONE_PEPSI = "880";
        String PRICE_SET_AND_TWO_PEPSI = "1 060";
    }

    interface Duration{
        int SEARCH_DURATION = 35;
    }
}
