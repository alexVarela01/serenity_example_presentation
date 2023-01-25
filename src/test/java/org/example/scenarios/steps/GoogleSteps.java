package org.example.scenarios.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.GoogleSearchElements;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoogleSteps {

    private GoogleSearchElements googleSearchElements;

    @Step("user navigates to google")
    public void navigate_google(){
        googleSearchElements.open();
        log.info("Title : {}", googleSearchElements.getTitle());
    }

    @Step("^the search page is opened and cookies banner is closed$")
    public void check_search_page_opened() {
        googleSearchElements.check_search_page_opened();
    }

    @Step("^the user fills in the search field with \"([^\"]*)\" and clicks on the search button$")
    public void perform_search(String value) {
        googleSearchElements.fill_search_input(value);
        googleSearchElements.click_search();
    }

    @Step("^the user should see \"([^\"]*)\" as the search result$")
    public void check_result(String value) {
        googleSearchElements.check_result(value);
    }
}
