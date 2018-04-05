package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, 
		features = "src/test/java/feature", 
		glue = { "stepdefinition" }, 
		tags= {"~@not_run"},
		format={"json:src/test/java/reports/cucumber.json"})
		//plugin = {"json", "html:src/test/java/reports" })
public class Run {

}
