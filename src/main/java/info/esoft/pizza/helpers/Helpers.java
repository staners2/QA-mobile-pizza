package info.esoft.pizza.helpers;

import com.sun.tools.javac.Main;
import info.esoft.pizza.constants.Const;
import org.openqa.selenium.By;
import info.esoft.pizza.pages.*;

public class Helpers {
    public static void authorization(){
        MainPage.openMenu();
        MenuPage.enterAccount();
        AuthorizationPage.sendNumber(Const.Account.NUMBER);
        AuthorizationPage.agreeConditionOne();
        AuthorizationPage.agreeConditionTwo();
        AuthorizationPage.clickNextButton();
        MainPage.clickMenuInNavigatePanel();
    }
}
