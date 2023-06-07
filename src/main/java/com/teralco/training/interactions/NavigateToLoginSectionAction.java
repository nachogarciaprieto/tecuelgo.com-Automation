package com.teralco.training.interactions;

import com.teralco.training.ui.HomePage;
import com.teralco.training.ui.LoginSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class NavigateToLoginSectionAction implements Interaction {

    private HomePage homePage;

    @Override
    @Step("{0} navigate to the register section")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("http://tecuelgo.com"));
        actor.attemptsTo(WaitUntil.the(LoginSectionPage.LOGIN_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        //actor.attemptsTo(Click.on(HomePage.BOOK_STORE_APLICATION_BTN));
//        actor.attemptsTo(WaitUntil.the(HomePage.LOGIN_LEFT_MENU_BTN, isClickable()).forNoMoreThan(10).seconds());
//        actor.attemptsTo(Click.on(HomePage.LOGIN_LEFT_MENU_BTN));
//        actor.attemptsTo(WaitUntil.the(HomePage.LOGIN_BTN, isClickable()).forNoMoreThan(10).seconds());
//        actor.attemptsTo(Click.on(HomePage.LOGIN_BTN));

        //actor.attemptsTo(Scroll.to(HomePage.PASSWORD_FIELD).andAlignToBottom());
        //actor.attemptsTo(WaitUntil.the(HomePage.NEW_USER_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        //actor.attemptsTo(Click.on(HomePage.NEW_USER_BTN));

    }

    public static NavigateToLoginSectionAction goLogin() {
        return instrumented(NavigateToLoginSectionAction.class);
    }


}
