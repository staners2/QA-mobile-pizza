package info.esoft.pizza.buySet;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.FiftyOnFiftyPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.SetsPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class PossitiveTest extends BaseTest {

    @DisplayName("Совпадение информации о товаре при просмотре и приобретении")
    @Test
    public void priceEqualsWhenViewedAndPurchasedTest(){
        MainPage.openSetsPage();
        String titleView = SetsPage.getTitleSetFiftyOnFifty();
        String subtitleView = SetsPage.getSubtitleSetFiftyOnFifty();
        String priceView = SetsPage.getPriceSetFiftyOnFifty();

        SetsPage.collectionSetFiftyOnFifty();

        String titlePurchase = FiftyOnFiftyPage.getTitleSetFiftyOnFifty();
        String subtitlePurchase = FiftyOnFiftyPage.getSubtitleSetFiftyOnFifty();
        String pricePurchase = FiftyOnFiftyPage.getPriceSetFiftyOnFifty();

        boolean result = titleView.equals(titlePurchase) && subtitleView.equals(subtitlePurchase) && priceView.equals(pricePurchase);
        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Стадия выбора 'Набора', выбрав только две пиццы и набор")
    public void addTwoPizzaAndSetWhenPurchasedTest(){
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();

        FiftyOnFiftyPage.addSet();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.addPizzaOne();
        FiftyOnFiftyPage.addPizzaTwo();

        FiftyOnFiftyPage.changeOnLastPage();

        Assert.assertTrue(FiftyOnFiftyPage.buyButtonIsActive());
    }
}
