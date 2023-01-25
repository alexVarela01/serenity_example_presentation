package org.example.scenarios;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleResultsSteps;

@Feature
public class GoogleResultsStepsDefinition {

    @Steps
    protected static GoogleResultsSteps googleResultsSteps;

    @Then("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) {
        googleResultsSteps.check_result(value);
    }
}
