package com.teralco.training.interactions;


import com.teralco.training.ui.AdministratorMenuSectionPage;
import com.teralco.training.ui.DropDownOptionsMenuPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class LogoutAction implements Interaction {

    @Override
    @Step("{0} click on log out button")
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(WaitUntil.the(AdministratorMenuSectionPage.CLOSE_SESSION_BTN, isClickable()).forNoMoreThan(10).seconds());

        //actor.attemptsTo(Enter.theValue(loginRolesDto.getUsername()).into(LoginSectionPage.USERNAME_FIELD));
        //actor.attemptsTo(Enter.theValue(loginRolesDto.getPassword()).into(LoginSectionPage.PASSWORD_FIELD));
        //actor.attemptsTo(WaitUntil.the(DropDownOptionsMenuPage.LOG_OUT_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(AdministratorMenuSectionPage.CLOSE_SESSION_BTN));
    }

    public static LogoutAction logout() {
        return instrumented(LogoutAction.class);
    }

}
