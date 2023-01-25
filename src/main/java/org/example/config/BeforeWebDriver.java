package org.example.config;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Class to add epo proxy configuration to remote web driver.
 *
 * @author SG93017
 *
 */
public class BeforeWebDriver implements BeforeAWebdriverScenario {
    @Override
    public DesiredCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver supportedWebDriver, TestOutcome testOutcome, DesiredCapabilities desiredCapabilities) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/linux/chromedriver");
        desiredCapabilities.setCapability("name",testOutcome.getTitle());
        return desiredCapabilities;
    }
}
