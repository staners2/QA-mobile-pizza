package info.esoft.pizza.authorization;

import com.sun.tools.javac.Main;
import info.esoft.pizza.BaseTest;
import info.esoft.pizza.constants.Const;
import info.esoft.pizza.pages.AuthorizationPage;
import info.esoft.pizza.pages.MainPage;
import info.esoft.pizza.pages.MenuPage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NegativeTest extends BaseTest {

    @Test
    @DisplayName("Войти в аккаунт не вводя номер и подтвердив все соглашения")
    public void noInputNumber(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();

        Assert.assertFalse(!AuthorizationPage.isInputValidData());
    }

    @Test
    @DisplayName("Ввести номер и не подтверждать все соглашения")
    public void inputNumberAndNotAgreeAllCondition(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.clickNextButton();

        Assert.assertFalse(!AuthorizationPage.isInputValidData());
    }

    @Test
    @DisplayName("Ввести номер и не подтверждать первое соглашения")
    public void inputNumberAndNotAgreeOneCondition(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();

        Assert.assertFalse(!AuthorizationPage.isInputValidData());
    }

    @Test
    @DisplayName("Ввести номер и не подтверждать второе соглашения")
    public void inputNumberAndNotAgreeTwoCondition(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.clickNextButton();

        Assert.assertFalse(!AuthorizationPage.isInputValidData());
    }
}
