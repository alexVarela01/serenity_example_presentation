package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;


public class GoogleSearchResultsElements extends PageObject {

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElementFacade next_button;

    public WebElementFacade findAnyElementWithText(String text) {
        return find(org.openqa.selenium.By.xpath("//*[contains(normalize-space(),'"+text+"')]"));
    }

    public void check_result(String result) throws InterruptedException {
        findAnyElementWithText(result).isDisplayed();
        Thread.sleep(1000);
    }

    public void scroll_bottom() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250000)", "");
        Thread.sleep(1000);
    }

    public void click_on_button(String button){
        switch(button){
            case "Next":{
                if (next_button.isDisplayed()) next_button.click();
            }
        }
    }
}
