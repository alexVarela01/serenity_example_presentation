package org.example.scenarios.steps;

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
}
