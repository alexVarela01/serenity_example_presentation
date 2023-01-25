package org.example.scenarios.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.GoogleHomepageElements;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoogleHomepageSteps {

    private GoogleHomepageElements googleHomepageElements;

    @Step("user navigates to google")
    public void navigate_google(){
        googleHomepageElements.open();
        log.info("Title : {}", googleHomepageElements.getTitle());
    }

    @Step("^the search page is opened and cookies banner is closed$")
    public void check_search_page_opened() {
        googleHomepageElements.check_search_page_opened();
    }

    @Step("^the user fills in the search field with \"([^\"]*)\" and clicks on the search button$")
    public void perform_search(String value) {
        googleHomepageElements.fill_search_input(value);
        googleHomepageElements.click_search();
    }
}
