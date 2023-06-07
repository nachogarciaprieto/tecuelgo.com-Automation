package com.teralco.training.interactions;

import com.teralco.training.ui.HomePage;
import com.teralco.training.ui.ModalSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class NavigateToModalsSectionAction implements Interaction {

    private HomePage homePage;

    @Override
    @Step("{0} navigate to the check box section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(homePage));
        actor.attemptsTo(Scroll.to(HomePage.ALERTS_FRAMES_WINDOWS_BTN).andAlignToBottom());
        actor.attemptsTo(WaitUntil.the(HomePage.ALERTS_FRAMES_WINDOWS_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(HomePage.ALERTS_FRAMES_WINDOWS_BTN));



        actor.attemptsTo(Scroll.to(HomePage.ALERTS_BTN).andAlignToTop());
        //actor.attemptsTo(Scroll.to(AlertSectionPage.NESTED_FRAMES_BTN));
        actor.attemptsTo(WaitUntil.the(ModalSectionPage.MODAL_DIALOGS_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(ModalSectionPage.MODAL_DIALOGS_BTN));
    }

    public static NavigateToModalsSectionAction doNavigate() {
        return instrumented(NavigateToModalsSectionAction.class);
    }


}
