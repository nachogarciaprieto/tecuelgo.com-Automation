package com.teralco.training.questions;

import com.teralco.training.ui.AdministratorMenuSectionPage;
import com.teralco.training.ui.HomePage;
import com.teralco.training.ui.TextBoxSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.teralco.training.ui.AdministratorMenuSectionPage.USER_ADMIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class LoginAdministratorQuestion implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {



        actor.attemptsTo(WaitUntil.the(AdministratorMenuSectionPage.USER_ADMIN_BUTTON, isClickable()).forNoMoreThan(10).seconds());

        //actor.attemptsTo(Scroll.to(OFFER_PROPERTY).andAlignToBottom());
        boolean isAdminUserButtonVisible = USER_ADMIN_BUTTON.resolveFor(actor).isClickable();

        boolean isVisible;
        if (isAdminUserButtonVisible) {
            isVisible = true;
        } else {
            isVisible = false;
        }
        return isVisible;

    }


    public static Question<Boolean> isAdminLogged() {
        return new LoginAdministratorQuestion();
    }

}


