package com.teralco.training.glue;

import com.teralco.training.model.*;
import com.teralco.training.questions.*;
import com.teralco.training.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemosQaSteps {

    private FormTextDto formTextDto;
    private AlertTextDto alertTextDto;


    // PROYECTO TECUELGO.COM

    @Given("^that (Nacho|Administrator|Vendor|User) wants to login in the system$")
    public void thatNachoWantsToLoginInTheSystem(String actorName) { theActorCalled(actorName);

    }


    @When("he fills the login form with {loginRolesDataTypes} rol")
    public void heFillsTheLoginFormWithRol(LoginRolesDataTypes loginRolesDataTypes) {

        LoginRolesDto loginRolesDto = null;



        if(loginRolesDataTypes.equals(LoginRolesDataTypes.ADMINISTRATOR)){

            loginRolesDto = LoginRolesDataBuilder.build(LoginRolesDataTypes.ADMINISTRATOR);
        }

       if(loginRolesDataTypes.equals(LoginRolesDataTypes.VENDOR)){

            loginRolesDto = LoginRolesDataBuilder.build(LoginRolesDataTypes.VENDOR);
        }

        if(loginRolesDataTypes.equals(LoginRolesDataTypes.USER)){

            loginRolesDto = LoginRolesDataBuilder.build(LoginRolesDataTypes.USER);
        }



        theActorInTheSpotlight()
                .attemptsTo(
                        LoginSectionTask.completeTheLoginData(loginRolesDto)
                );
    }


    @Then("the administrator menu is opened")
    public void theAdministratorMenuIsOpened() {
        theActorInTheSpotlight().should(
                seeThat(
                        "The user edition button is displayed",
                        LoginAdministratorQuestion.isAdminLogged(),
                        Matchers.equalTo(true)
                )
        );
    }


    @Then("the vendor menu is opened")
    public void theVendorMenuIsOpened() {
        theActorInTheSpotlight().should(
                seeThat(
                        "The user manage button is displayed",
                        LoginVendorQuestion.isVendorLogged(),
                        Matchers.equalTo(true)
                )
        );
    }

    @Then("the user menu is opened")
    public void theUserMenuIsOpened() {
        theActorInTheSpotlight().should(
                seeThat(
                        "The user profile button is displayed",
                        LoginVendorQuestion.isVendorLogged(),
                        //LoginTextSuccessfullyQuestion.isLogged(),
                        Matchers.equalTo(true)
                )
        );
    }
}

