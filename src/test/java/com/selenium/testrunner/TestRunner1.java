package com.selenium.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/Calculator_Data_DrivenFeature.feature"},
		glue= {"com.selenium.cucumber"},
		plugin= {"pretty","html:target/cucumber-report.html"},
		monochrome = true,
		tags="@DataDriven"
		
		)


public class TestRunner1 {

}
