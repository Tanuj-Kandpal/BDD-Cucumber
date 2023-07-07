package stepdefinitons;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobjects.Pom1;
import pageobjects.Pom2;
import pageobjects.Pom3;

@RunWith(Cucumber.class)
public class Searchfilter extends Base {
	
	Pom1 option;
	
	Pom2 button;
	
	Pom3 tab;
		
	WebDriver driver;

	@Before("@sc5.1")
	public void setup() {

		loadProjectDataProperties();

		driver = initializeBrowser(prop.getProperty("browser"));

	}

	@Given("^I visited the web application$")
	public void i_visited_the_web_application() {

		option = new Pom1(driver);

		driver.get(prop.getProperty("url"));

		option.rentpgtab();
		
		button = new Pom2(driver);

		button.searchbarclicked();

	}

	@When("^I search different location in the search bar under rent option$")
	public void i_search_different_location_in_the_search_bar_under_rent_option() {

		option.rentradiobutton();

		tab = new Pom3(driver);

		tab.searchkeyword();
		
		tab.mumbaialloptionselected();

//		driver.findElement(By.cssSelector("a[id='CITY_12, PREFERENCE_R, RESCOM_R'] strong:nth-child(1)")).click();

		tab.submitbutton();

	}

	@When("^I Search location for the pg$")
	public void i_search_location_for_the_pg() {

		option.pgradiobutton();

		tab.searchkeyword();

		driver.findElement(By.cssSelector("a[id='CITY_12, PREFERENCE_R, RESCOM_R'] strong:nth-child(1)")).click();

		tab.submitbutton();

	}

	@Then("^Property with the selected checkboxes should be visible$")
	public void property_with_the_selected_checkboxes_should_be_visible() throws InterruptedException {

		Thread.sleep(25000);

		driver.findElement(By.xpath("//div[normalize-space()='No results matching your search!']")).isDisplayed();

	}

	@And("^filter was set as per the need$")
	public void filter_was_set_as_per_the_need() {

		
		WebElement maxslider = driver.findElement(By.id("budgetLeftFilter_max_node"));

		WebElement minslider = driver.findElement(By.id("budgetLeftFilter_min_node"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(maxslider, -100, 0).perform();

		action.dragAndDropBy(minslider, 200, 0).perform();
		
		tab.noofbedroomselected();
		
		tab.typeofpropertyselected();
		
		tab.verifiedpropertyselected();
		
		tab.propertywithphotoselected();
		
		tab.postedbyselected();
		
		tab.furnishingstatusselected();
		
		tab.availableforselected();
		
		tab.localitiesselected();
		
		tab.ageofpropertyselected();
		
		tab.newprojectsocitiesselected();
		
		tab.amenitiessselected();
	
		
		
//
//		driver.findElement(By.xpath("//span[normalize-space()='2 BHK']")).click();
//
//		driver.findElement(By.xpath("//span[normalize-space()='Residential Apartment']")).click();
//
//		driver.findElement(By.cssSelector("label[for='verified_Y'] span[class='toggle__switchButton']")).click();
//
//		driver.findElement(By.cssSelector("label[for='media_media_PHOTO'] span[class='toggle__switchButton']")).click();
//
//		driver.findElement(By.cssSelector("div[id='__Owner__'] span")).click();
//
//		driver.findElement(By.xpath("//span[normalize-space()='Semifurnished']")).click();
//
//		driver.findElement(By.cssSelector("div[id='FA'] span")).click();
//
//		driver.findElement(By.cssSelector("label[for='1107_top']")).click();
//
//		driver.findElement(By.id("1-5")).click();  // age of property
//
//		driver.findElement(By.cssSelector("div[id='building_id'] div[class='accordion_content__fullWidth list_header_semiBold'] div")).click(); // newProjects/Societies

//    driver.findElement(By.cssSelector("label[for='289759_top']")).click();

		driver.findElement(By.cssSelector("div[id='area_min'] div[class='leftFilters__menu_head']")).click();// area of
																												// the
																												// property

		WebElement maxareaslider = driver.findElement(By.id("area_max_node"));

		WebElement minareaslider = driver.findElement(By.id("area_min_node"));

		Actions areaaction = new Actions(driver); // area slider

		areaaction.dragAndDropBy(maxareaslider, -50, 0).perform();

		areaaction.dragAndDropBy(minareaslider, 100, 0).perform();
		
		
		tab.availablefromselected();
		
		tab.availablefromclicked();
	

//		driver.findElement(By.xpath("//span[normalize-space()='Parking']")).click();     ///amenities
//
//		driver.findElement(By.cssSelector("div[id='availableFrom'] div[class='accordion_content__fullWidth list_header_semiBold'] div[class='leftFilters__menu_head'] div span[class='section_header_semiBold']")).click();
//
//		driver.findElement(By.cssSelector("div[id='A'] span")).click();

	}

	@Then("^I should be able to get filtered pg only$")
	public void i_should_be_able_to_get_filtered_pg_only() {
		
		driver.findElement(By.cssSelector("div[class='zrp__zrpContent'] div[class='title_l_bold']")).isDisplayed();

	}

	@And("^set different filter according to the requirement$")
	public void set_different_filter_according_to_the_requirement() {

		driver.findElement(By.cssSelector("label[for='verified_Y'] span[class='toggle__switchButton']")).click();  //pg requirement
		
		
		driver.findElement(By.cssSelector("label[for='media_media_PHOTO']")).click();
		
		driver.findElement(By.cssSelector("label[for='bathroom_attached_Y']")).click();
		
		WebElement maxpgslider = driver.findElement(By.id("budgetLeftFilter_max_node"));

		WebElement minpgslider = driver.findElement(By.id("budgetLeftFilter_min_node"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(maxpgslider, -50, 0).perform();

		action.dragAndDropBy(minpgslider, 100, 0).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Residential Apartment']")).click();
		
		driver.findElement(By.cssSelector("div[id='WP'] span")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Private Room']")).click();
		
		driver.findElement(By.cssSelector("div[id='1-2'] span")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='1 RK/1 BHK']")).click();
		
		driver.findElement(By.cssSelector("div[id='103'] span")).click();
		
		driver.findElement(By.cssSelector("label[for='4954_top']")).click();
		
		driver.findElement(By.cssSelector("div[id='building_id'] div[class='accordion_content__fullWidth list_header_semiBold'] div")).click();
		
		//amenties
		
		driver.findElement(By.xpath("//span[normalize-space()='Parking']")).click();
		
		//furniture status
		
		driver.findElement(By.cssSelector("div[id='furnish'] div[class='leftFilters__menu_head']")).click();
		
		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(1) > div:nth-child(1) > div:nth-child(15) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2)")).click();
		
		//posted by
		
		driver.findElement(By.cssSelector("div[id='class'] div[class='leftFilters__menu_head']")).click();
		
		driver.findElement(By.cssSelector("div[id='__Owner__'] span")).click();
		
	
	}

	@After("@whole5")
	public void closure() {

		driver.close();
	}

}
