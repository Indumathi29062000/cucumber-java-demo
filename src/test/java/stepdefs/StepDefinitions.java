package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

//step defintion file is needed for the features written
public class StepDefinitions {
	String username;
    String password;
    boolean loggedIn;

    //hook
    @Before
    public void setup() {
        System.out.println("---- Launching browser / Initializing test data ----");
    }
    
    @Given("the user opens the login page")
    public void open_login_page() {
        System.out.println("Login page opened");
    }

    @Given("the username is {string}")
    public void set_username(String uname) {
        username = uname;
        System.out.println("username:"+username);


    }

    @Given("the password is {string}")
    public void set_password(String pwd) {
        password = pwd;
        System.out.println(password);
    }

    @When("the user clicks the login button")
    public void click_login() {
        loggedIn = username != null && !username.isEmpty() && password != null;
    }

    @Then("the user should be logged in")
    public void verify_login() {
        assertTrue(loggedIn);
    }

    @But("the username should not be empty")
    public void username_not_empty() {
        assertFalse("Username is empty!", username.trim().isEmpty());
    }
}
