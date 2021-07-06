package info.esoft.pizza;

import info.esoft.pizza.helpers.Helpers;
import info.esoft.pizza.pages.MainPage;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IsWorkedApplicationTest extends BaseTest{

    @Ignore
    @DisplayName("Запуск приложения")
    @Test
    public void AppIsWorkedTest() throws InterruptedException {
        try{
            Assert.assertTrue(true);
        }
        catch (Exception ex){
            Assert.assertTrue(false);
        }
    }

    @Ignore
    @Test
    public void test(){
        mainPage.openMenu();

        Assert.assertTrue(authPage.inputValidData());
    }
}
