package stepdefinitons;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageobjects.Pom1;
import pageobjects.Pom2;

@RunWith(Cucumber.class)

public class Rentpgoptiontype extends Base {
	
	Pom1 option;
	
	Pom2 button;
	
	WebDriver driver;

	@Before("@epic2.2")
	public void setup() {

		loadProjectDataProperties();

		driver = initializeBrowser(prop.getProperty("browser"));

	}

	@Given("^I visted the url$")
	public void i_visted_the_url() {

		driver.get(prop.getProperty("url"));

	}

	@Given("^Rent option is selected$")
	public void rent_option_is_selected() {
		
		
		option = new Pom1(driver);
		
		button = new Pom2(driver);
		
		option.rentpgtab();
		
		button.searchbarclicked();
		
		button.rentradiobuttondisplay();

	}

	@Then("^I was able to select different budget$")
	public void i_was_able_to_select_different_budget() {
		
		button.budgetoptionclicked();
	
		button.minpricedisplayed();
		
		button.minimunpriceclicked();
		
		button.maxpricedisplayed();
		
		button.maximumpriceclicked();

	}

	@And("^Also Bedroom slection is possible$")
	public void also_bedroom_slection_is_possible() {
		
		button.bedroomclicked();
		
		button.bedroomisselected();

	}

	@And("^Also Posted By option should work$")
	public void also_posted_by_option_should_work() {
		
		button.postedbyclicked();
		
		button.postedbyisselected();

	}

	@And("^clear all option sholuld clear all the selected details$")
	public void clear_all_option_sholuld_clear_all_the_selected_details() {
		
		button.clearallclicked();

	}

	@Given("^Pg option is available$")
	public void pg_option_is_available() {

		option = new Pom1(driver);
		
		button = new Pom2(driver);
		
		option.rentpgtab();
		
		button.searchbarclicked();
		
		option.pgradiobutton();
		
		
	}
	


    @Then("^I should able to select the budget option$")
    public void i_should_able_to_select_the_budget_option() {
    	
    	button.budgetoptionclicked();
    	
    	button.minpricedisplayed();
    	
    	button.minimunpriceclicked();
    	
    	button.maxpricedisplayed();
    	
    	button.maximumpriceclicked();


    }
    

    @And("^Available selction should work properly$")
    public void available_selction_should_work_properly() {
    	
    	
    	button.availableforclicked();
    	
    	button.availableforoptionisselected();
      
    }

	@Then("^I should able to select the sharing option$")
	public void i_should_able_to_select_the_sharing_option() {
		
		
		button.Sharingoptionclicked();
		
		button.Sharingoptionisselected();
		
		
		
	}


	@And("^Selection of dealer should function properly$")
	public void selection_of_dealer_should_function_properly() {
		
		
		button.postedbyclicked();
		
		button.postedbyisselected();
			

	}

	@And("^At last clear all function should work properly$")
	public void at_last_clear_all_function_should_work_properly() {
		
		button.clearallclicked();

	}

	@After("@epic2.2")
	public void closure() throws InterruptedException {

		Thread.sleep(5000);
		driver.close();
	}

}
