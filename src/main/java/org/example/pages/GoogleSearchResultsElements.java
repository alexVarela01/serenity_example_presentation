package org.example.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class GoogleSearchResultsElements extends PageObject {

    public WebElementFacade findAnyElementWithText(String text) {
        return find(org.openqa.selenium.By.xpath("//*[contains(normalize-space(),'"+text+"')]"));
    }

    public void check_result(String result) throws InterruptedException {
        findAnyElementWithText(result).isDisplayed();
        Thread.sleep(1000);
    }
}
