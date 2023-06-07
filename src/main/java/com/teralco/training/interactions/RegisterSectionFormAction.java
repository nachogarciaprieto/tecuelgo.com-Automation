package com.teralco.training.interactions;

import com.teralco.training.model.RegisterTextDto;
import com.teralco.training.ui.RegisterSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegisterSectionFormAction implements Interaction {

    private RegisterTextDto registerTextDto;

    public RegisterSectionFormAction(RegisterTextDto registerTextDto) {
        this.registerTextDto = registerTextDto;
    }

    @Override
    @Step("{0} navigate to the form section")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(RegisterSectionPage.REGISTER_BTN, isClickable()).forNoMoreThan(10).seconds());


        //actor.attemptsTo(WaitUntil.the(RegisterSectionPage.USERFORM_FIELD, isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Enter.theValue(registerTextDto.getfirstname()).into(RegisterSectionPage.FIRSTNAME_FIELD));
        actor.attemptsTo(Enter.theValue(registerTextDto.getlastname()).into(RegisterSectionPage.LASTNAME_FIELD));
        actor.attemptsTo(Enter.theValue(registerTextDto.getusername()).into(RegisterSectionPage.USERNAME_FIELD));
        actor.attemptsTo(Enter.theValue(registerTextDto.getpassword()).into(RegisterSectionPage.PASSWORD_FIELD));
        actor.attemptsTo(Click.on(RegisterSectionPage.CAPTCHA_CHECK));


        actor.attemptsTo(Click.on(RegisterSectionPage.REGISTER_BTN));


    }

    public static RegisterSectionFormAction setThePersonalData(RegisterTextDto registerTextDto) {
        return instrumented(RegisterSectionFormAction.class, registerTextDto);
    }

}
