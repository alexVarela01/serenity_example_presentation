package org.example.scenarios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleSteps;

@Feature
public class GoogleStepsDefinition {

    @Steps
    protected static GoogleSteps googleSteps;

    @Given("^user navigates to google$")
    public void navigate_google() {
        googleSteps.navigate_google();
    }

    @Given("^the search page is opened and cookies banner is closed$")
    public void check_search_page_opened() {
        googleSteps.check_search_page_opened();
    }

    @When("^the user fills in the search field with \"([^\"]*)\" and clicks on the search button$")
    public void perform_search(String value) {
        googleSteps.perform_search(value);
    }

    @Then("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) {
        googleSteps.check_result(value);
    }
}
