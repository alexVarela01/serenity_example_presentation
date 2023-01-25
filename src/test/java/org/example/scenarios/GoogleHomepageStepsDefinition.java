package org.example.scenarios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleHomepageSteps;

@Feature
public class GoogleHomepageStepsDefinition {

    @Steps
    protected static GoogleHomepageSteps googleHomepageSteps;

    @Given("^user navigates to google$")
    public void navigate_google() {
        googleHomepageSteps.navigate_google();
    }

    @Given("^the search page is opened and cookies banner is closed$")
    public void check_search_page_opened() {
        googleHomepageSteps.check_search_page_opened();
    }

    @When("^the user fills in the search field with \"([^\"]*)\" and clicks on the search button$")
    public void perform_search(String value) {
        googleHomepageSteps.perform_search(value);
    }

}
