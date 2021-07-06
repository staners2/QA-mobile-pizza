package info.esoft.pizza;

import info.esoft.pizza.helpers.Settings;
import info.esoft.pizza.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;

public class BaseTest extends Settings {

    protected static MainPage mainPage;
    protected static MenuPage menuPage;
    protected static SetsPage setsPage;
    protected static FiftyOnFiftyPage fiftyOnFiftyPage;
    protected static FilterSetsPage filterSetsPage;


    @BeforeEach
    public void Up() throws MalformedURLException {
        System.out.println("Driver start");
        driver = createAndroidDriver();

        MainPage.driver = driver;
        MenuPage.driver = driver;
        SetsPage.driver = driver;
        FiftyOnFiftyPage.driver = driver;
        FilterSetsPage.driver = driver;
        AuthorizationPage.driver = driver;
        BasketPage.driver = driver;
    }

    @AfterEach
    public void Down(){
        driver.quit();
        System.out.println("Driver quit");
    }
}
