package smarttech.ny.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".//Features/"},
		glue = {"smarttech.ny.stepdefinitions"}
		)

public class MyRunner extends AbstractTestNGCucumberTests{

}
