package toolsqa.designpattern.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StudentRegistrationForm extends PageObject {

    public static final Target FIRST_NAME_INPUT = Target.the("First name input").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").locatedBy("#lastName");
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("userEmail"));
    public static final Target GENDER_LIST =Target.the("List of different gender").locatedBy("//input[contains(@id,'gender-radio-')]");
    public static final Target MOBILE_NUMBER_INPUT = Target.the("Mobile number input").located(By.id("userNumber"));
    public static final Target BIRTHDAY_INPUT = Target.the("Birthday input").located(By.id("dateOfBirthInput"));
    public static final Target BIRTHDAY_LIST = Target.the("Data of register").locatedBy("//div[contains(@class,'react-datepicker__day react-datepicker__day')]");
    public static final Target HOBBIES_LIST = Target.the("List of different hobbies").locatedBy("//input[contains(@id,'hobbies-checkbox-')]");
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("Current Address input").located(By.id("currentAddress"));
    public static final Target STATE_AND_CITY_INPUT = Target.the("State and city input").located(By.id("react-select-3-input"));
    public static final Target SELECT_CITY_INPUT = Target.the("Select city input").located(By.id("react-select-4-input"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit button").located(By.id("submit"));
    public static final Target FULL_NAME_VALIDATION = Target.the("Full name validation table").locatedBy("(//td)[2]");





}
