package toolsqa.designpattern.models;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private final String firstName, lastName, email, mobileNumber, currentAddress;

    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = "9999933333";
        this.currentAddress = faker.address().fullAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

}
