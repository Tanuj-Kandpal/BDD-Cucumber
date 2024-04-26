package stepdefinitons;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import base.Base;
import pageobjects.Page1;

//@RunWith(Cucumber.class)

public class Propertytype extends Base{

	WebDriver driver;
	
	Page1 allresidential;
	
	Page1 commercial;

	@Before("@epic1")
	public void setup() {
		
		loadProjectDataProperties();
		
		driver = initializeBrowser(prop.getProperty("browser"));
			
	 }

	@Given("^I visted the website$")
	public void i_visted_the_website() {
		

		driver.get(prop.getProperty("url"));
	}

	@Then("^I click on the rentpg option$")
	public void i_click_on_the_rentpg_option() {
		
		Page1 page = new Page1(driver);
		
		page.rentpgtab();
		

	}

	@And("^I was able to select all residentials drop down options$")
	public void i_was_able_to_select_all_residentials_drop_down_options() {
		
		allresidential = new Page1(driver);

		allresidential.allResendtialButton();
		
		allresidential.allResidentialDropdown();
		
		allresidential.residentialapartmentdisplay();
		
		allresidential.housevilladisplay();
		
		allresidential.builderfloordisplay();
		
		allresidential.studioapartmentdisplay();
		
		allresidential.farmhousedisplay();
		
		allresidential.servicedepartmentdisplay();
		
		allresidential.otherdispalay();
	
	}

	@Then("^I should able to select commercial properties$")
	public void i_should_able_to_select_commercial_properties() {

		commercial = new Page1(driver);
		
		commercial.allResendtialButton();
		
		commercial.commercialpropertiesclick();
		
		commercial.commercialpropertiesclick();
		
		commercial.bareshellclick();
		
		commercial.coworkingofficeclick();
		
		commercial.retailshopdisplayed();
		
		commercial.commerciallanddisplayed();
		
		commercial.industriallanddisplayed();
		
		commercial.farmhousedisplay();
		
		commercial.hoteldisplayed();
		
		commercial.guesthousedisplayed();
		
		commercial.warhousedisplayed();
		
		commercial.coldstoragedisplayed();
		
		commercial.Factorydisplayed();
		
		commercial.manufacturingdisplayed();
		
		commercial.otherdisplayed();
		
	}

	@After("@epic1")
	public void closure() throws InterruptedException {

		Thread.sleep(5000);
		driver.close();
	}

}
