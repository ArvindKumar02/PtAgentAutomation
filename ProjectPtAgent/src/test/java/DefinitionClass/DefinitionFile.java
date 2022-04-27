package DefinitionClass;

import ExecutionClass.ExecuteTest;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefinitionFile {

    public static WindowsDriver driver = ExecuteTest.driver;

    @Given("user launch's Application")
    public void user_launch_s_application() {
        driver.findElementById("").click();

    }

    @When("user enters UserID and Password")
    public void user_enters_user_id_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user is navigated to Workspace")
    public void user_is_navigated_to_workspace() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user closes the connect Window")
    public void user_closes_the_connect_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user is navigated to working Space")
    public void user_is_navigated_to_working_space() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user closes the Application")
    public void user_closes_the_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
