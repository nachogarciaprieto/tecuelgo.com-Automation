package com.teralco.training.glue;

import com.teralco.training.tasks.LoginSectionTask;
import com.teralco.training.tasks.LogoutTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Hooks {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After("@CloseSession")
    public void closeSession() {
        //System.out.println("Close Session");

//theActorInTheSpotlight().attemptsTo(LoginSectionTask.completeTheLoginData(LoginSectionTask));

        theActorInTheSpotlight().attemptsTo(LogoutTask.logoutTask());




    }
}
