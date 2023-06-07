package com.teralco.training.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginTextSuccessfullyQuestion implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {

        //actor.attemptsTo(WaitUntil.the(HomePage.DROP_DOWN_OPTIONS_BTN, isCurrentlyVisible()).forNoMoreThan(10).seconds());


        String mapURL = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        return mapURL.equals("https://tecuelgo.com/");
    }

    public static Question<Boolean> isLogged() {
        return new LoginTextSuccessfullyQuestion();
    }

}


