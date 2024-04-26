package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {


    public WebDriver driver;

    public Page2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[id='BG_Banner'] div[id='rent_op_wrap'] div:nth-child(1) a:nth-child(1) i:nth-child(1)")
    WebElement rentradiobutton;

    public void rentradiobuttondisplay() {

        rentradiobutton.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='priceLbl']")
    WebElement Budget;

    public void budgetoptionclicked() {

        Budget.click();
    }

    @FindBy(linkText = "Min")
    WebElement Minprice;

    public void minpricedisplayed() {

        Minprice.isDisplayed();
    }


    @FindBy(linkText = "15,000")
    WebElement Minimumprice;

    public void minimunpriceclicked() {
        Minimumprice.click();
    }

    @FindBy(linkText = "Max")
    WebElement Maxprice;

    public void maxpricedisplayed() {

        Maxprice.isDisplayed();
    }

    @FindBy(linkText = "10,000")
    WebElement Maximumprice;

    public void maximumpriceclicked() {

        Maximumprice.click();
    }

    @FindBy(xpath = "//div[normalize-space()='Bedroom']")
    WebElement Bedroom;

    public void bedroomclicked() {

        Bedroom.click();
    }

    @FindBy(id = "bd_5")
    WebElement Bedroomselection;

    public void bedroomisselected() {

        Bedroomselection.click();
    }

    @FindBy(css = "div[id='posted_by_wrap'] div[class='vmid']")
    WebElement Postedby;

    public void postedbyclicked() {

        Postedby.click();
    }

    @FindBy(id = "p_o")
    WebElement Postedbyselection;

    public void postedbyisselected() {

        Postedbyselection.click();
    }


    @FindBy(id = "clrAl")
    WebElement Clearall;

    public void clearallclicked() {

        Clearall.click();
    }

    @FindBy(id = "keyword")
    WebElement Searchclick;

    public void searchbarclicked() {
        Searchclick.click();
    }


    @FindBy(id = "availableForLabel")
    WebElement Availablefor;

    public void availableforclicked() {

        Availablefor.click();
    }

    @FindBy(id = "forGirls")
    WebElement Availableforoption;

    public void availableforoptionisselected() {

        Availableforoption.click();
    }


    @FindBy(css = "#sharingLabel")
    WebElement Sharing;

    public void Sharingoptionclicked() {

        Sharing.click();
    }

    @FindBy(css = "div[id='sharing_wrap'] a:nth-child(2)")
    WebElement Sharingoption;

    public void Sharingoptionisselected() {

        Sharingoption.click();
    }


}
