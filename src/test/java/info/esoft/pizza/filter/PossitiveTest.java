package info.esoft.pizza.filter;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.pages.FilterSetsPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.MenuPage;
import info.esoft.pizza.pages.SetsPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Применение фильтра с диапазоном 700-799 руб.")
    public void filterOnDistanse(){
        MainPage.openSetsPage();
        SetsPage.openFilter();
        FilterSetsPage.openChangeMenu();
        FilterSetsPage.sendMinPrice(Const.Filter.MIN_PRICE);
        FilterSetsPage.sendMaxPrice(Const.Filter.MAX_PRICE);
        FilterSetsPage.agreeChange();
        FilterSetsPage.agreeFilter();

        Assert.assertTrue(SetsPage.getCountProducts().equals(Const.Filter.COUNT_PRODUCT));
    }

    @Test
    @DisplayName("Очистить фильтр с диапазоном 700-799")
    public void clearFilter(){
        MainPage.openSetsPage();
        SetsPage.openFilter();
        FilterSetsPage.openChangeMenu();
        FilterSetsPage.sendMinPrice(Const.Filter.MIN_PRICE);
        FilterSetsPage.sendMaxPrice(Const.Filter.MAX_PRICE);
        FilterSetsPage.agreeChange();
        FilterSetsPage.agreeFilter();

        SetsPage.openFilter();
        FilterSetsPage.clearFilter();

        Assert.assertTrue(SetsPage.getCountProducts().equals(Const.Filter.COUNT_PRODUCT_AFTER_CLEAR));
    }

    @Test
    @DisplayName("Применить фильтр с диапазоном 799-700 руб.")
    public void setIncorrectFilter(){
        MainPage.openSetsPage();
        SetsPage.openFilter();
        FilterSetsPage.openChangeMenu();
        FilterSetsPage.sendMinPrice(Const.Filter.MAX_PRICE);
        FilterSetsPage.sendMaxPrice(Const.Filter.MIN_PRICE);

        Integer minPrice = FilterSetsPage.getMinPrice();
        Integer maxPrice = FilterSetsPage.getMaxPrice();

        Assert.assertTrue(minPrice == Const.Filter.MIN_PRICE_AFTER_INPUT_INCORRECT && maxPrice == Const.Filter.MAX_PRICE_AFTER_INPUT_INCORRECT);
    }
}
