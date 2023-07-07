package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_html_report.html","pretty"},features="features",
glue="stepdefinitons" , tags ="@homepage")
public class Runner extends AbstractTestNGCucumberTests {
	
	
	
}
