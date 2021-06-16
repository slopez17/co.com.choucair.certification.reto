package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.UtestData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public  void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Martha wants to sign up for an account at utest$")
    public void thanMarthaWantsToSignUpForAnAccountAtUtest() {
        OnStage.theActorCalled("Martha").wasAbleTo(OpenUp.thePage(), Start.theRegisterProcess());
    }

    @When("^she fills out the requiered information on utest platform$")
    public void sheFillsOutTheRequieredInformationOnUtestPlatform(List<UtestData> utestData) throws Exception  {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteStep1.withSelfInformation(
                utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrMonthOfBirth(),
                utestData.get(0).getStrDayOfBirth(),
                utestData.get(0).getStrYearOfBirth()),
                CompleteStep2.withDefaultLocation(),
                CompleteStep3.withDefaultDevices(),
                CompleteStep4.withTermsAcceptance(utestData.get(0).getStrPassword())
        );

    }

    @Then("^she reads$")
    public void sheReads(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrConfirmMessage())));
    }
}
