package com.teralco.training.interactions;

import com.teralco.training.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class NavigateToFormSectionAction implements Interaction {

    private HomePage homePage;

    @Override
    @Step("{0} navigate to the form section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(homePage));
        actor.attemptsTo(Scroll.to(HomePage.FORM_SECTION_BTN).andAlignToBottom());
        actor.attemptsTo(WaitUntil.the(HomePage.FORM_SECTION_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(HomePage.FORM_SECTION_BTN));
    }

    public static NavigateToFormSectionAction doNavigate() {
        return instrumented(NavigateToFormSectionAction.class);
    }


}
