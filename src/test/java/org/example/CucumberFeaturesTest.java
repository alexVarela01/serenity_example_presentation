package org.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        monochrome = true,
        tags = "@SearchFeature"
)
public class CucumberFeaturesTest {}


