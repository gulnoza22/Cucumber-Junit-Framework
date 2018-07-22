package com.prestashop.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//runwith come from Junit
@RunWith(Cucumber.class)
// comes from Cucumber
@CucumberOptions(
		tags="@login",
		//it shows the location of the feature
		features = "src/test/resources/com/prestashop/features",
		// If dryRun=true is just for getting step definition methods from console and it will not open browser
		glue="com/prestashop/step_definitions")
//		dryRun=false)// false will open the browser and test
public class CukesRunner {

}
