package stepdefinitons;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.Pom3;

@RunWith(Cucumber.class)
public class Searchlocation extends Base {

	WebDriver driver;

	@Before("@wholeepic3")
	public void setup() {

		loadProjectDataProperties();

		driver = initializeBrowser(prop.getProperty("browser"));

	}

	@Given("^I visted the website url$")
	public void i_visted_the_website_url() {
		
		driver.get(prop.getProperty("url"));

	}

	@When("^I clicked on the search bar$")
	public void i_clicked_on_the_search_bar() {

		driver.findElement(By.cssSelector("#ResRentTab")).click();
		
		driver.findElement(By.id("keyword")).click();
		
	}

	@Then("^Without searching any location$")
	public void without_searching_any_location() {
		
		driver.findElement(By.id("keyword")).click();
	}

	@Then("^clicking on the search button$")
	public void clicking_on_the_search_button() {
		
		driver.findElement(By.id("submit_query")).click();

	}

	@And("^I should get an error message$")
	public void i_should_an_get_error_message() {
		
		driver.findElement(By.cssSelector(".text")).isDisplayed();

	}
	
	   @When("^I Search the location in the search bar$")
	    public void i_search_the_location_in_the_search_bar() {
		   		   
		   Pom3 keys = new Pom3(driver);
		   
		   keys.searchkeyword();
		   
	    }

	    @Then("^I was able to get different location options$")
	    public void i_was_able_to_get_different_location_options() {
	    	   
	    	driver.findElement(By.id("suggestions_custom")).isDisplayed();
	    
	    }
	    
	    @And("^clear option should claer all the selected location$")
	    public void clear_option_should_claer_all_the_selected_location()  {
	    	
	    	driver.findElement(By.id("clrAl")).click();
	       
	    }


	@After("@wholeepic3")
	public void closure() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

}
