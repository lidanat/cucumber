package testing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    @Given("^I have 42 cukes in my belly$")
    public void i_have_cukes_in_my_belly() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Exception 1");
    }
    @When("^I wait 1 hour$")
    public void i_wait_hour() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Exception 2");
    }
    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Exception 2");
    }
}
