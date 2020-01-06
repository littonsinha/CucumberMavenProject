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
		tags = "",
		features = "src/main/java/com/newtours/qa/features",
		glue	= "com/newtours/qa/stepdefinition"
)

public class TestRunner
{
	
}