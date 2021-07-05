package info.esoft.pizza;

import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IsWorkedApplicationTest extends BaseTest{

    @DisplayName("Запуск приложения")
    @Test
    public void AppIsWorkedTest() throws InterruptedException {
        try{
            mainPage.cancelConditionAccessNumber(driver);
            mainPage.closePromo(driver);
            Assert.assertTrue(true);
        }
        catch (Exception ex){
            Assert.assertTrue(false);
        }
    }
}
