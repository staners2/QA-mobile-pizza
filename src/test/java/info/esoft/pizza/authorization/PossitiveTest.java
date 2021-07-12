package info.esoft.pizza.authorization;

import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.pages.AuthorizationPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.MenuPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PossitiveTest extends BaseTest {

    @Test
    @DisplayName("Авторизация проходит успешно")
    public void authorizeSuccessful(){
        MainPage.openMenu();
        MenuPage.enterAccount();

        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();

        // TODO Решить вопрос с методом isInput
        Assert.assertTrue(AuthorizationPage.isInputValidData());
    }
}
