package toolsqa.tests.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import toolsqa.designpattern.interactions.OpenTheBrowser;
import toolsqa.designpattern.tasks.FillStudentRegistrationForm;
import toolsqa.designpattern.ui.StudentRegistrationForm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class FormAuthSD {

    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Liliana").can(BrowseTheWeb.with(studentRegistrationForm.getDriver()));
    }

    @Given("^that a web user wants to login$")
    public void that_a_web_user_wants_to_login() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on());
    }


    @When("^he fills all the requested fields with the correct credentials$")
    public void he_fills_all_the_requested_fields_with_the_correct_credentials() {
        theActorInTheSpotlight().attemptsTo(FillStudentRegistrationForm.success());
    }

    @Then("^he should see the secure area page$")
    public void he_should_see_the_secure_area_page() {
    }

}
