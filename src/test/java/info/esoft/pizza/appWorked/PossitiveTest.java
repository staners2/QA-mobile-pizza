package info.esoft.pizza.appworked;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Приложение запускается")
    public void appIsWorked(){
        Assert.assertTrue(MainPage.setIsHaveInMenu());
    }

}
