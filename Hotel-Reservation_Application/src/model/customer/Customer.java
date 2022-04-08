package model.customer;
import java.util.regex.Pattern;

public class Customer {
    private static final String email_regex = "^(.+)@(.+).(.+)$";

    private final String firstName;
    private final String lastName;
    private final String email;


    public Customer(String firstName, String lastName, String email){
        this.isInvalidEmail(email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }
    private void isInvalidEmail(final String email){
       Pattern check = Pattern.compile(email_regex);

       if(!check.matcher(email).matches()){
           throw new IllegalArgumentException("Invalid email");
       }
    }
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName
                + " Last Name: " + this.lastName
                + " Email: " + this.email;
    }
}

