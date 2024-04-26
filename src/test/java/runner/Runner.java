package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_report","pretty"},features="features",
glue="stepdefinitons" , tags ="@whole5")
public class Runner extends AbstractTestNGCucumberTests {
	
	
	
}
