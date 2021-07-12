package info.esoft.pizza.buyset;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.FiftyOnFiftyPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.SetsPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @DisplayName("Совпадение информации о товаре при просмотре и приобретении")
    @Test
    public void priceEqualsWhenViewedAndPurchasedTest(){
        MainPage.openSetsPage();
        String titleView = SetsPage.getTitleSetFiftyOnFifty();
        String subtitleView = SetsPage.getSubtitleSetFiftyOnFifty();
        int priceView = SetsPage.getPriceSet();

        SetsPage.collectionSetFiftyOnFifty();

        String titlePurchase = FiftyOnFiftyPage.getTitleSetFiftyOnFifty();
        String subtitlePurchase = FiftyOnFiftyPage.getSubtitleSetFiftyOnFifty();
        int pricePurchase = FiftyOnFiftyPage.getPriceSet();

        boolean result = titlePurchase.contains(titleView) && subtitlePurchase.contains(subtitleView) && pricePurchase == priceView;

        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Стадия выбора 'Набора', выбрав только две пиццы и набор")
    public void addTwoPizzaAndSetWhenPurchasedTest() {
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();

        FiftyOnFiftyPage.addSet();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.addPizzaOne();
        FiftyOnFiftyPage.addPizzaTwo();

        FiftyOnFiftyPage.changeOnLastPage();
        FiftyOnFiftyPage.buySet();
        Assert.assertTrue(FiftyOnFiftyPage.buyButtonIsActive());
    }
}
