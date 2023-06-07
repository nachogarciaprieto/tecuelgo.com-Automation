package com.teralco.training.tasks;

import com.teralco.training.interactions.LogoutAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutTask implements Task {


    @Override
    @Step("{0} log out")
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(DropDownOptionsMenuAction.dropDownOptionsMenu());
        actor.attemptsTo(LogoutAction.logout());
    }

    public static LogoutTask logoutTask() {
        return instrumented(LogoutTask.class);
    }

}
