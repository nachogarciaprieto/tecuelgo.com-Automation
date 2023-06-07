package com.teralco.training.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.teralco.training.ui.ModalSectionPage.*;

public class ModalWindowClosedSuccessfullyQuestion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return !CLOSE_MODAL_BTN.resolveFor(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isTheWindowClosed() {

        return new ModalWindowClosedSuccessfullyQuestion();
    }
}


