package org.example.scenarios;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Steps;
import org.example.scenarios.steps.GoogleSearchResultsSteps;

@Feature
public class GoogleSearchResultsStepsDefinition {

    @Steps
    protected static GoogleSearchResultsSteps googleSearchResultsSteps;

    @Then("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) throws InterruptedException {
        googleSearchResultsSteps.check_result(value);
    }

    @When("^the user scrolls to the bottom$")
    public void scroll_bottom() throws InterruptedException {
        googleSearchResultsSteps.scroll_bottom();
    }

    @When("^the user clicks on the \"([^\"]*)\" button$")
    public void click_button(String button) throws InterruptedException {
        googleSearchResultsSteps.click_button(button);
    }

    @Then("^the user should be on the page \"([^\"]*)\"$")
    public void validate_page(String pageNumber) throws InterruptedException {
        googleSearchResultsSteps.validate_page(pageNumber);
    }
}
