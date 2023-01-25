package org.example.scenarios;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleSearchResultsSteps;

@Feature
public class GoogleSearchResultsStepsDefinition {

    @Steps
    protected static GoogleSearchResultsSteps googleSearchResultsSteps;

    @Then("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) {
        googleSearchResultsSteps.check_result(value);
    }
}
