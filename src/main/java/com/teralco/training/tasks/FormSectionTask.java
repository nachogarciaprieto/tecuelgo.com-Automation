package com.teralco.training.tasks;

import com.teralco.training.interactions.FormSectionAction;
import com.teralco.training.interactions.NavigateToFormSectionAction;
import com.teralco.training.model.FormTextDto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormSectionTask implements Task {

    private FormTextDto formTextDto;

    public FormSectionTask(FormTextDto formTextDto) {
        this.formTextDto = formTextDto;
    }

    @Override
    @Step("{0} fill the form in the form section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(NavigateToFormSectionAction.doNavigate());
        actor.attemptsTo(FormSectionAction.setThePersonalData(formTextDto));
    }

    public static FormSectionTask completeThePersonalData(FormTextDto formTextDto) {
        return instrumented(FormSectionTask.class, formTextDto);
    }

}
