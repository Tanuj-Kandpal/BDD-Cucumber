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
import org.testng.Assert;
import pageobjects.Page1;
import pageobjects.Page3;

//@RunWith(Cucumber.class)
public class Searchresult extends Base {

    WebDriver driver;

    Page3 tab;

    @Before("@search")
    public void setup() {

        loadProjectDataProperties();

        driver = initializeBrowser(prop.getProperty("browser"));

    }

    @Given("^I visited the weburl$")
    public void i_visited_the_weburl() {

        driver.get(prop.getProperty("url"));

    }

    @When("^I selected the rent option$")
    public void i_selected_the_rent_option() {


        Page1 option = new Page1(driver);

        option.rentpgtab();


    }

    @Then("^I search location in the search bar$")
    public void i_search_location_in_the_search_bar() {

        tab = new Page3(driver);

        tab.searchkeyword();

        driver.findElement(By.cssSelector("a[id='CITY_12, PREFERENCE_R, RESCOM_R'] strong:nth-child(1)")).click();

        tab.submitbutton();


    }

    @And("^Different properties option are available for selected location$")
    public void different_properties_option_are_available_for_selected_location() {

        driver.findElement(By.xpath("//h1[normalize-space()='Property for Rent in Mumbai']")).isDisplayed();

    }

    @And("^Property dealer contact options are available$")
    public void property_dealer_contact_options_are_available() {

        Assert.assertTrue(driver.findElement(By.linkText("View Phone Number")).isDisplayed());

    }

    @When("^I selected the pg option$")
    public void i_selected_the_pg_option() {

        Page1 option = new Page1(driver);

        option.rentpgtab();

        driver.findElement(By.id("keyword")).click();

        option.pgRadioButton();

    }

    @Then("^I search for the pg location$")
    public void i_search_for_the_pg_location() {

        driver.findElement(By.id("keyword")).sendKeys("Pune");

    }

    @And("^I should be able to move to search result page$")
    public void i_should_be_able_to_move_to_search_result_page() {

        tab.submitbutton();


    }

    @And("^contact details should be present$")
    public void contact_details_should_be_present() {

        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='PG in Pune']")).isDisplayed());

    }

    @After("@search")
    public void closure() throws InterruptedException {

        Thread.sleep(3000);
        driver.close();
    }

}
