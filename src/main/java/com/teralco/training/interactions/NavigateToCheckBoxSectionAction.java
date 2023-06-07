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

public class NavigateToCheckBoxSectionAction implements Interaction {

    private HomePage homePage;

    @Override
    @Step("{0} navigate to the check box section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(homePage));
        actor.attemptsTo(Scroll.to(HomePage.ELEMENTS_BTN).andAlignToBottom());
        actor.attemptsTo(WaitUntil.the(HomePage.ELEMENTS_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(HomePage.ELEMENTS_BTN));

        actor.attemptsTo(Scroll.to(HomePage.WEB_TABLES_BTN).andAlignToBottom());
        actor.attemptsTo(WaitUntil.the(HomePage.WEB_TABLES_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(HomePage.CHECKBOX_SECTION_BTN));
    }

    public static NavigateToCheckBoxSectionAction doNavigate() {
        return instrumented(NavigateToCheckBoxSectionAction.class);
    }


}
