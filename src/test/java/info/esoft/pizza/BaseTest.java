package info.esoft.pizza;

import com.codeborne.selenide.Selenide;
import info.esoft.pizza.helpers.Settings;
import info.esoft.pizza.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;
import java.sql.Driver;

public class BaseTest extends Settings {

/*    protected static MainPage mainPage;
    protected static MenuPage menuPage;
    protected static SetsPage setsPage;
    protected static FiftyOnFiftyPage fiftyOnFiftyPage;
    protected static FilterSetsPage filterSetsPage;
    protected static AuthorizationPage authPage;*/

    @BeforeEach
    public void Up() throws MalformedURLException {
        setSettingsForDriver();
        System.out.println("Driver start");
        MainPage.cancelConditionAccessNumber();
        MainPage.closePromo();
    }

    @AfterEach
    public void Down(){
        Selenide.closeWebDriver();
        System.out.println("Driver quit");
    }
}
