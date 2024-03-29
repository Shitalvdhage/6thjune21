package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;





	@RunWith(Cucumber.class)
	@CucumberOptions
	(
		features="src/main/java/com/features",
	    glue= "com.stepdefinition",
		monochrome= true,
		dryRun=false, 
		plugin= {"pretty","html:target/report.html"}

	)
	public class TestRunner {

	

	}
