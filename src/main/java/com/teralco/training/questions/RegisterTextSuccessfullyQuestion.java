package com.teralco.training.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegisterTextSuccessfullyQuestion implements Question<Boolean> {

    private String alertMsg;

    public RegisterTextSuccessfullyQuestion(String alertMsg) {
        this.alertMsg = alertMsg;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String alertText = BrowseTheWeb.as(actor).getAlert().getText();
        return alertText.contains(alertMsg);
    }

    public static Question<Boolean> isExpectedAlertShowed(String alertMsg) {
        return new RegisterTextSuccessfullyQuestion(alertMsg);
    }

}


