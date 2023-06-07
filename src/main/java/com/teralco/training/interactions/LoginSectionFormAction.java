package com.teralco.training.interactions;

import com.teralco.training.model.LoginRolesDto;
import com.teralco.training.model.LoginTextDto;
import com.teralco.training.model.RegisterTextDto;
import com.teralco.training.ui.LoginSectionPage;
import com.teralco.training.ui.RegisterSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginSectionFormAction implements Interaction {

    private LoginRolesDto loginRolesDto;

    public LoginSectionFormAction(LoginRolesDto loginRolesDto) {
        this.loginRolesDto = loginRolesDto;
    }

    @Override
    @Step("{0} navigate to the form section")
    public <T extends Actor> void performAs(T actor) {




        //actor.attemptsTo(WaitUntil.the(RegisterSectionPage.USERFORM_FIELD, isCurrentlyVisible()).forNoMoreThan(10).seconds());

        actor.attemptsTo(Enter.theValue(loginRolesDto.getUsername()).into(LoginSectionPage.USERNAME_FIELD));
        actor.attemptsTo(Enter.theValue(loginRolesDto.getPassword()).into(LoginSectionPage.PASSWORD_FIELD));
        //actor.attemptsTo(WaitUntil.the(LoginSectionPage.LOGIN_BTN, isClickable()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(LoginSectionPage.LOGIN_BTN));
    }

    public static LoginSectionFormAction setTheLoginData(LoginRolesDto loginRolesDto) {
        return instrumented(LoginSectionFormAction.class, loginRolesDto);
    }

}
