package com.newtours.qa.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		strict = true,
		dryRun = false,
		monochrome = true,
		plugin = "html:target/cucumber-report.html",
		features = "src/main/java/com/newtours/qa/features/FlightDetails.feature",
		glue	= "com/newtours/qa/stepdefinition"
)

public class TestRunner
{
	
}