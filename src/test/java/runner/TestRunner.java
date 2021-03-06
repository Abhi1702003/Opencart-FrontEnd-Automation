package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", 
glue = { "stepDefinations" }, 
monochrome = true,
plugin = { "pretty", "html:target/cucumberReports","json:target/cucumber.json" },
tags = "@LoginUser or @RegisterUser")
public class TestRunner {

}
