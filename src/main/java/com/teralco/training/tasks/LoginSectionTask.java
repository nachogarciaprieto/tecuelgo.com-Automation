package com.teralco.training.tasks;

import com.teralco.training.interactions.LoginSectionFormAction;
import com.teralco.training.interactions.NavigateToLoginSectionAction;
import com.teralco.training.interactions.NavigateToRegisterSectionAction;
import com.teralco.training.interactions.RegisterSectionFormAction;
import com.teralco.training.model.LoginRolesDataTypes;
import com.teralco.training.model.LoginRolesDto;
import com.teralco.training.model.LoginTextDto;
import com.teralco.training.model.RegisterTextDto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSectionTask implements Task {

    private final LoginRolesDto loginRolesDto;


    public LoginSectionTask(LoginRolesDto loginRolesDto) {
        this.loginRolesDto = loginRolesDto;
    }

    @Override
    @Step("{0} fill the form in the register section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(NavigateToLoginSectionAction.goLogin());
        actor.attemptsTo(LoginSectionFormAction.setTheLoginData(loginRolesDto));
    }

    public static LoginSectionTask completeTheLoginData(LoginRolesDto loginRolesDto) {
        return instrumented(LoginSectionTask.class, loginRolesDto);
    }

}
