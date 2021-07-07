package info.esoft.pizza.appWorked;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Приложение работает")
    public void appIsWorked(){
        Assert.assertTrue(MainPage.setIsHaveInMenu());
    }

}
