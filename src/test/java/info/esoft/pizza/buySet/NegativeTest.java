package info.esoft.pizza.buySet;

import com.sun.tools.javac.Main;
import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.FiftyOnFiftyPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.SetsPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NegativeTest extends BaseTest {

    @Test
    @DisplayName("Стадия выбора 'Набора', выбрав только одну пиццу")
    public void addOnePizzaWhenPurchasedSetTest(){
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.addPizzaOne();
        FiftyOnFiftyPage.changeOnLastPage();

        Assert.assertFalse(!FiftyOnFiftyPage.buyButtonIsActive());
    }

    @Test
    @DisplayName("Стадия выбора 'Набора', выбрав только две пиццы")
    public void addTwoPizzaWhenPurchasedSetTest() {
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.addPizzaOne();
        FiftyOnFiftyPage.addPizzaTwo();
        FiftyOnFiftyPage.changeOnLastPage();

        Assert.assertFalse(!FiftyOnFiftyPage.buyButtonIsActive());
    }

    @Test
    @DisplayName("Стадия выбора 'Набора', выбрав только набор")
    public void addSetWhenPurchasedSetTest() throws InterruptedException {
        MainPage.openSetsPage();
        SetsPage.collectionSetFiftyOnFifty();
        FiftyOnFiftyPage.addSet();
        FiftyOnFiftyPage.nextPageOnSelectPizza();
        FiftyOnFiftyPage.changeOnLastPage();

        Assert.assertFalse(!FiftyOnFiftyPage.buyButtonIsActive());
    }
}
