package org.example.scenarios.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import org.example.pages.GoogleSearchResultsElements;

@Slf4j
public class GoogleSearchResultsSteps {

    private GoogleSearchResultsElements googleSearchResultsElements;

    @Step("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) throws InterruptedException {
        googleSearchResultsElements.check_result(value);
    }

    @Step("^the user scrolls to the bottom$")
    public void scroll_bottom() throws InterruptedException {
        googleSearchResultsElements.scroll_bottom();
    }

    @Step("^the user clicks on the \"([^\"]*)\" button$")
    public void click_button(String button) throws InterruptedException {
        googleSearchResultsElements.click_on_button(button);
    }

    @Step("^the user should be on the page \"([^\"]*)\"$")
    public void validate_page(String pageNumber) throws InterruptedException {
        googleSearchResultsElements.check_result("Page "+pageNumber);
    }
}
