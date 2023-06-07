package com.teralco.training.tasks;

import com.teralco.training.interactions.NavigateToRegisterSectionAction;
import com.teralco.training.interactions.RegisterSectionFormAction;
import com.teralco.training.model.RegisterTextDto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterSectionTask implements Task {

    private RegisterTextDto registerTextDto;

    public RegisterSectionTask(RegisterTextDto registerTextDto) {
        this.registerTextDto = registerTextDto;
    }

    @Override
    @Step("{0} fill the form in the register section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(NavigateToRegisterSectionAction.doNavigate());
        actor.attemptsTo(RegisterSectionFormAction.setThePersonalData(registerTextDto));
    }

    public static RegisterSectionTask completeTheRegisterData(RegisterTextDto registerTextDto) {
        return instrumented(RegisterSectionTask.class, registerTextDto);
    }

}
