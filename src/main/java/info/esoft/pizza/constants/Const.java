package info.esoft.pizza.constants;

public interface Const {
    interface Account{
        String NAME = "test";
        String NUMBER = "79555555555";
        String STREET = "test";
        String APPARTAMENT = "test";
        String HOUSE = "test";

        String PROMOCODE_ERROR = "123456";
    }

    interface Filter{
        Integer COUNT_PRODUCT = 1;
        Integer COUNT_PRODUCT_AFTER_CLEAR = 4;

        String MIN_PRICE = "700";
        String MAX_PRICE = "799";

        Integer MIN_PRICE_AFTER_INPUT_INCORRECT = 700;
        Integer MAX_PRICE_AFTER_INPUT_INCORRECT = 700;
    }

    interface Message{
        String CLEAR_BASKET = "";
        String DESCRIPTION_ERROR_PROMOCODE = "";
    }

    interface Basket{
        Integer PRICE_ONE_SET = 100;
        Integer PRICE_SET_AND_ONE_PEPSI = 880;
        Integer PRICE_SET_AND_TWO_PEPSI = 1060;
    }
}
