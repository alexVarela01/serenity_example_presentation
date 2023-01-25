package org.example.scenarios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleSteps;

@Feature
public class GoogleStepsDefinition {

    @Steps
    protected static GoogleSteps googleSteps;

    @Given("^user navigates to google$")
    public void navigate_google() throws Throwable {
        googleSteps.navigate_google();
    }

    @Given("^the search page is opened and cookies banner is closed$")
    public void check_search_page_opened() throws Throwable {
        googleSteps.check_search_page_opened();
    }

    @Then("^the user fills in the search field with \"([^\"]*)\" and clicks on the search button$")
    public void perform_search(String value) throws InterruptedException {
        googleSteps.perform_search(value);
    }
}