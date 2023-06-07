package com.teralco.training.questions;

import com.teralco.training.ui.ClientMenuSectionPage;
import com.teralco.training.ui.VendorMenuSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.teralco.training.ui.ClientMenuSectionPage.USER_CLIENT_BUTTON;
import static com.teralco.training.ui.VendorMenuSectionPage.USER_VENDOR_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginClientQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(USER_CLIENT_BUTTON, isClickable()).forNoMoreThan(10).seconds());

        //actor.attemptsTo(Scroll.to(OFFER_PROPERTY).andAlignToBottom());
        boolean isClientUserButtonVisible = USER_CLIENT_BUTTON.resolveFor(actor).isClickable();

        boolean isVisible;
        if (isClientUserButtonVisible) {
            isVisible = true;
        } else {
            isVisible = false;
        }
        return isVisible;

    }

    public static Question<Boolean> isClientLogged() {
        return new LoginClientQuestion();
    }

}


