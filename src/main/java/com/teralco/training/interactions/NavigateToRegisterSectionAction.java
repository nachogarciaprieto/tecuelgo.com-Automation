package com.teralco.training.interactions;

import com.teralco.training.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class NavigateToRegisterSectionAction implements Interaction {

    private HomePage homePage;

    @Override
    @Step("{0} navigate to the register section")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("https://demoqa.com/login"));
        //actor.attemptsTo(WaitUntil.the(HomePage.BOOK_STORE_APLICATION_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        //actor.attemptsTo(Click.on(HomePage.BOOK_STORE_APLICATION_BTN));
//        actor.attemptsTo(WaitUntil.the(HomePage.LOGIN_LEFT_MENU_BTN, isClickable()).forNoMoreThan(10).seconds());
//        actor.attemptsTo(Click.on(HomePage.LOGIN_LEFT_MENU_BTN));
//        actor.attemptsTo(WaitUntil.the(HomePage.LOGIN_BTN, isClickable()).forNoMoreThan(10).seconds());
//        actor.attemptsTo(Click.on(HomePage.LOGIN_BTN));

        //actor.attemptsTo(Scroll.to(HomePage.PASSWORD_FIELD).andAlignToBottom());
        actor.attemptsTo(WaitUntil.the(HomePage.NEW_USER_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(HomePage.NEW_USER_BTN));

    }

    public static NavigateToRegisterSectionAction doNavigate() {
        return instrumented(NavigateToRegisterSectionAction.class);
    }


}
