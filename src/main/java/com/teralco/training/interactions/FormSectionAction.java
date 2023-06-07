package com.teralco.training.interactions;

import com.teralco.training.model.FormTextDto;
import com.teralco.training.ui.TextBoxSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class FormSectionAction implements Interaction {

    private FormTextDto formTextDto;

    public FormSectionAction(FormTextDto formTextDto) {
        this.formTextDto = formTextDto;
    }

    @Override
    @Step("{0} navigate to the form section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TextBoxSectionPage.ELEMENTS_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(TextBoxSectionPage.ELEMENTS_BTN));

        actor.attemptsTo(WaitUntil.the(TextBoxSectionPage.TEXT_BOX_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(TextBoxSectionPage.TEXT_BOX_BTN));

        actor.attemptsTo(WaitUntil.the(TextBoxSectionPage.EMAIL_FIELD, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Enter.theValue(formTextDto.getFullName()).into(TextBoxSectionPage.USERNAME_FIELD));
        actor.attemptsTo(Enter.theValue(formTextDto.getEmail()).into(TextBoxSectionPage.EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue(formTextDto.getCurrentAddress()).into(TextBoxSectionPage.CURRENT_ADDRESS_FIELD));
        actor.attemptsTo(Enter.theValue(formTextDto.getPermanentAddress()).into(TextBoxSectionPage.PERMANENT_ADDRESS_FIELD));
        actor.attemptsTo(Click.on(TextBoxSectionPage.SUBMIT_BTN));

        actor.attemptsTo(WaitUntil.the(TextBoxSectionPage.OUTPUT_FIELD, isCurrentlyVisible()).forNoMoreThan(10).seconds());
    }

    public static FormSectionAction setThePersonalData(FormTextDto formTextDto) {
        return instrumented(FormSectionAction.class, formTextDto);
    }

}
