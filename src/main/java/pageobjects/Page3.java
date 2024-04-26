package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {

    public WebDriver driver;

    public Page3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "keyword")
    WebElement searchkeyword;

    public void searchkeyword() {
        searchkeyword.sendKeys("Mumbai");
    }

    @FindBy(id = "submit_query")
    WebElement submitbutton;

    public void submitbutton() {
        submitbutton.click();
    }

    @FindBy(css = "a[id='CITY_12, PREFERENCE_R, RESCOM_R'] strong:nth-child(1)")
    WebElement Mumbaiall;

    public void mumbaialloptionselected() {
        Mumbaiall.click();
    }

    @FindBy(xpath = "//span[normalize-space()='2 BHK']")
    WebElement Noofbedrooms;

    public void noofbedroomselected() {
        Noofbedrooms.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Residential Apartment']")
    WebElement Typeofproperty;

    public void typeofpropertyselected() {

        Typeofproperty.click();
    }

    @FindBy(css = "label[for='verified_Y'] span[class='toggle__switchButton']")
    WebElement Verifiedproperty;

    public void verifiedpropertyselected() {

        Verifiedproperty.click();
    }

    @FindBy(css = "label[for='media_media_PHOTO'] span[class='toggle__switchButton']")
    WebElement Propertywithphoto;

    public void propertywithphotoselected() {

        Propertywithphoto.click();
    }

    @FindBy(css = "div[id='__Owner__'] span")
    WebElement Postedby;

    public void postedbyselected() {
        Postedby.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Semifurnished']")
    WebElement Furnshingstatus;

    public void furnishingstatusselected() {
        Furnshingstatus.click();
    }


    @FindBy(css = "div[id='FA'] span")
    WebElement Availablefor;

    public void availableforselected() {

        Availablefor.click();
    }

    @FindBy(css = "label[for='1107_top']")
    WebElement Localities;

    public void localitiesselected() {

        Localities.click();
    }


    @FindBy(id = "1-5")
    WebElement Ageofproperty;

    public void ageofpropertyselected() {

        Ageofproperty.click();
    }


    @FindBy(css = "div[id='building_id'] div[class='accordion_content__fullWidth list_header_semiBold'] div")
    WebElement Newprojectsocities;

    public void newprojectsocitiesselected() {

        Newprojectsocities.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Parking']")
    WebElement Amenities;

    public void amenitiessselected() {

        Amenities.click();
    }

    @FindBy(css = "div[id='availableFrom'] div[class='accordion_content__fullWidth list_header_semiBold'] div[class='leftFilters__menu_head'] div span[class='section_header_semiBold']")
    WebElement Availablefrom;

    public void availablefromclicked() {

        Availablefrom.click();
    }

    @FindBy(css = "div[id='A'] span")
    WebElement Availablefromselected;

    public void availablefromselected() {

        Availablefromselected.click();
    }
}
