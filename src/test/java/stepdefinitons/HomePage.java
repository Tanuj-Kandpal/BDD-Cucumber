package stepdefinitons;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import pageobjects.Page1;
import pageobjects.Page2;
import pageobjects.Page3;

//@RunWith(Cucumber.class)

public class HomePage extends Base {

	WebDriver driver;

	Page1 option;

	Page2 button;

	@Before("@homepage")
	public void setup() {

		loadProjectDataProperties();

		driver = initializeBrowser(prop.getProperty("browser"));

	}

	@Given("^I visited the website$")
	public void i_visited_the_website() {

		driver.get(prop.getProperty("url"));
	}

	@Then("I click on the rentpg option")
	public void i_click_on_the_rentpg_option() {

		Page1 page = new Page1(driver);

		page.rentpgtab();

	}

	@And("I was able to select all residentials drop down options")
	public void i_was_able_to_select_all_residentials_drop_down_options() {

		option = new Page1(driver);

		option.allResendtialButton();

		option.allResidentialDropdown();

		option.residentialapartmentdisplay();

		option.housevilladisplay();

		option.builderfloordisplay();

		option.studioapartmentdisplay();

		option.farmhousedisplay();

		option.servicedepartmentdisplay();

		option.otherdispalay();

	}

	@Then("I should able to select commercial properties")
	public void i_should_able_to_select_commercial_properties() {

		option.allResendtialButton();

		option.commercialpropertiesclick();

		option.commercialpropertiesclick();

		option.bareshellclick();

		option.coworkingofficeclick();

		option.retailshopdisplayed();

		option.commerciallanddisplayed();

		option.industriallanddisplayed();

		option.farmhousedisplay();

		option.hoteldisplayed();

		option.guesthousedisplayed();

		option.warhousedisplayed();

		option.coldstoragedisplayed();

		option.Factorydisplayed();

		option.manufacturingdisplayed();

		option.otherdisplayed();

	}

	// Rent Pg option

	@Given("Rent option is selected")
	public void rent_option_is_selected() {

		button = new Page2(driver);

		option.rentpgtab();

		button.searchbarclicked();

		button.rentradiobuttondisplay();

	}

	@Then("I was able to select different budget")
	public void i_was_able_to_select_different_budget() {

		button.budgetoptionclicked();

		button.minpricedisplayed();

		button.minimunpriceclicked();

		button.maxpricedisplayed();

		button.maximumpriceclicked();

	}

	@And("Also Bedroom slection is possible")
	public void also_bedroom_slection_is_possible() {

		button.bedroomclicked();

		button.bedroomisselected();

	}

	@And("Also Posted By option should work")
	public void also_posted_by_option_should_work() {

		button.postedbyclicked();

		button.postedbyisselected();

	}

	@And("clear all option sholuld clear all the selected details")
	public void clear_all_option_sholuld_clear_all_the_selected_details() {

		button.clearallclicked();

	}

	@Given("Pg option is available")
	public void pg_option_is_available() {

		option = new Page1(driver);

		button = new Page2(driver);

		option.rentpgtab();

		button.searchbarclicked();

		option.pgRadioButton();

	}

	@Then("I should able to select the budget option")
	public void i_should_able_to_select_the_budget_option() {

		button.budgetoptionclicked();

		button.minpricedisplayed();

		button.minimunpriceclicked();

		button.maxpricedisplayed();

		button.maximumpriceclicked();

	}

	@And("Available selction should work properly")
	public void available_selction_should_work_properly() {

		button.availableforclicked();

		button.availableforoptionisselected();

	}

	@Then("I should able to select the sharing option")
	public void i_should_able_to_select_the_sharing_option() {

		button.Sharingoptionclicked();

		button.Sharingoptionisselected();

	}

	@And("Selection of dealer should function properly")
	public void selection_of_dealer_should_function_properly() {

		button.postedbyclicked();

		button.postedbyisselected();

	}

	@And("At last clear all function should work properly")
	public void at_last_clear_all_function_should_work_properly() {

		button.clearallclicked();

	}

	// Search location

	@When("I clicked on the search bar")
	public void i_clicked_on_the_search_bar() {

		driver.findElement(By.cssSelector("#ResRentTab")).click();

		driver.findElement(By.id("keyword")).click();

	}

	@Then("Without searching any location")
	public void without_searching_any_location() {

		driver.findElement(By.id("keyword")).click();
	}

	@Then("clicking on the search button")
	public void clicking_on_the_search_button() {

		driver.findElement(By.id("submit_query")).click();

	}

	@And("I should get an error message")
	public void i_should_an_get_error_message() {

		driver.findElement(By.cssSelector(".text")).isDisplayed();

	}

	@When("I Search the location in the search bar")
	public void i_search_the_location_in_the_search_bar() {

		Page3 keys = new Page3(driver);

		keys.searchkeyword();

	}

	@Then("I was able to get different location options")
	public void i_was_able_to_get_different_location_options() {

		driver.findElement(By.id("suggestions_custom")).isDisplayed();

	}

	@And("clear option should claer all the selected location")
	public void clear_option_should_claer_all_the_selected_location() {

		driver.findElement(By.id("clrAl")).click();

	}

	@After("@homepage")
	public void closure() throws InterruptedException {

		Thread.sleep(5000);
		driver.close();
	}

}
