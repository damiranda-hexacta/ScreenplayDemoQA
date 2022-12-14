package toolsqa.designpattern.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import toolsqa.designpattern.models.DataInjection;

import static toolsqa.designpattern.utils.Helpers.*;
import static toolsqa.designpattern.ui.StudentRegistrationForm.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillStudentRegistrationForm implements Task {

    DataInjection dataInjection = new DataInjection();
    WebElementFacade elementList, birthdayList ,hobbiesList;

    @Override
    public <T extends Actor> void performAs(T actor) {
        elementList = getRandomElement(actor, GENDER_LIST);
        actor.attemptsTo(
                Enter.theValue(dataInjection.getFirstName()).into(FIRST_NAME_INPUT),
                Enter.theValue(dataInjection.getLastName()).into(LAST_NAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(EMAIL_INPUT),
                JavaScriptClick.on(elementList),
                Enter.theValue(dataInjection.getMobileNumber()).into(MOBILE_NUMBER_INPUT),
                JavaScriptClick.on(BIRTHDAY_INPUT)
        );
        birthdayList = getRandomElement(actor, BIRTHDAY_LIST);
        hobbiesList = getRandomElement(actor, HOBBIES_LIST);
        actor.attemptsTo(
                JavaScriptClick.on(birthdayList),
                JavaScriptClick.on(hobbiesList),
                Scroll.to(STATE_AND_CITY_INPUT),
                Enter.theValue(dataInjection.getCurrentAddress()).into(CURRENT_ADDRESS_INPUT),
                Enter.theValue(properties.getProperty("stateAndCity")).into(STATE_AND_CITY_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(properties.getProperty("selectCity")).into(SELECT_CITY_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(SUBMIT_BUTTON)
        );
    }

    public static FillStudentRegistrationForm success(){
        return instrumented(FillStudentRegistrationForm.class);
    }
}
