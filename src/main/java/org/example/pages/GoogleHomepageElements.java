package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class GoogleHomepageElements extends PageObject {

    @FindBy(xpath = "//input[@title='Search']")
    WebElementFacade search_input;

    @FindBy(xpath = "(//input[@name='btnK'])[1]")
    WebElementFacade search_button;

    @FindBy(xpath = "//img[@id='hplogo']")
    WebElementFacade google_logo;

    @FindBy(xpath = "//h1[normalize-space()='Before you continue to Google']")
    WebElementFacade cookiesTitle_modal;

    @FindBy(xpath = "//div[normalize-space()='Accept all']")
    WebElementFacade acceptCookies_button;

    public void click_search() {
        if (search_button.isClickable()) {
            search_button.click();
        }
    }

    public void fill_search_input(String searchText) {
        if(!searchText.equals("")) {
            if (search_input.isDisplayed()) {
                search_input.clear();
                search_input.sendKeys(searchText);
            }
        }
    }

    public void check_search_page_opened() {
        if (google_logo.isDisplayed()) {
            google_logo.waitUntilVisible();
        }

        if (cookiesTitle_modal.isDisplayed()){
            acceptCookies_button.click();
        }

        cookiesTitle_modal.shouldNotBeVisible();
    }
}
