package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/io/cucumber/skeleton/sample.feature"},
//	dryRun = false,
//	monochrome=true,
	tags= "not @p1",
		
		plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
}
