package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	
	public WebDriver driver;
	 public Pom1(WebDriver driver) {
		 
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id="ResRentTab")
	 WebElement rentpg;
	 
	 public void rentpgtab() {
		 rentpg.click();
	 }
	 
	 
	 @FindBy(css="div[id='rent_op_wrap'] div:nth-child(1) a:nth-child(1)")
	 WebElement rentradiobutton;
	 
	public void rentradiobutton() {
		
		rentradiobutton.click();
	}
	
	@FindBy(xpath="//div[@id='rent_op_wrap']//div[1]//a[2]")
	WebElement pgradiobutton;
	
	public void pgradiobutton() {
		
		pgradiobutton.click();
	}
	
	@FindBy(className = "addPdElip")
	WebElement allresidential;
	
	public void allresendtialbutton() {
		
		allresidential.click();
	}
	
	@FindBy(css="a[id='resddli'] i[class='iconS checked']")
	WebElement allresidentialdropdown;
	
	public void allresidentialdropdown() {
		
		allresidentialdropdown.click();
	}
	
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(1)")
	WebElement ResidentialApartment;
	
	public void residentialapartmentdisplay() {
		
		ResidentialApartment.isDisplayed();
	}
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(2)")
	WebElement Housevilla;
	
	public void housevilladisplay() {
		
		Housevilla.isDisplayed();
	}
	
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(3)")
	WebElement Builderfloor;
	
	public void builderfloordisplay() {
		Builderfloor.isDisplayed();
	}
	
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(5)")
	WebElement Studioapartment;
	
	public void studioapartmentdisplay() {
		
		Studioapartment.isDisplayed();
	}
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(6)")
	WebElement Farmhouse;
	
	public void farmhousedisplay() {
		
		Farmhouse.isDisplayed();
	}
	
	@FindBy(css="div[class='child initChecked DCresOpen'] a:nth-child(7)")
	WebElement Servicedepartment;
	
	public void servicedepartmentdisplay() {
		
		Servicedepartment.isDisplayed();
	}
	
	@FindBy(xpath="//a[contains(text(),'Other')]")
	WebElement Other;
	
	public void otherdispalay() {
		
		Other.isDisplayed();
	}
	
	
	//Commercial properties
	

	@FindBy(css="#comddli")
	WebElement Commercialproperties;
	
	public void commercialpropertiesclick() {
		
		Commercialproperties.click();
	}
	
	
	@FindBy(id="92")
	WebElement Bareshell;
	
	public void bareshellclick() {
		
		Bareshell.click();
	}
	
	@FindBy(id="93")
	WebElement Coworkingoffice;
	
	public void coworkingofficeclick() {
		
		Coworkingoffice.click();
	}
	
	@FindBy(css="div[class='child DCcomOpen'] a:nth-child(4)")
	WebElement Retailshop;
	
	public void retailshopdisplayed() {
		Retailshop.isDisplayed();
	}
	
	@FindBy(xpath="//a[normalize-space()='Commercial Land/Inst. Land']")
	WebElement Commercialland;
	
	public void commerciallanddisplayed() {
		
		Commercialland.isDisplayed();
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Industrial Lands/Plots']")
	WebElement Industriallands;
	
	public void industriallanddisplayed() {
		
		Industriallands.isDisplayed();
	}
	
	@FindBy(css="div[class='child DCcomOpen'] a:nth-child(7)")
	WebElement Agriculture;
	
	public void agriculturedisplayed() {
		Agriculture.isDisplayed();
	}
	
	@FindBy(css="div[class='child DCcomOpen'] a:nth-child(8)")
	WebElement Hotel;
	
	public void hoteldisplayed() {
		Hotel.isDisplayed();
	}
	
	
	@FindBy(css="div[class='tab-items'] a:nth-child(9)")
	WebElement Guesthouse;
	
	public void guesthousedisplayed() {
		
		Guesthouse.isDisplayed();
	}
	
	@FindBy(css="div[class='tab-items'] a:nth-child(10)")
	WebElement Warhouse;
	
	public void warhousedisplayed() {
		
		Warhouse.isDisplayed();
	}
	
	@FindBy(css="div[class='tab-items'] a:nth-child(11)")
	WebElement Coldstorage;
	
	public void coldstoragedisplayed() {
		
		Coldstorage.isDisplayed();
	}
	
	@FindBy(css="div[class='tab-items'] a:nth-child(12)")
	WebElement Factory;
	
	public void Factorydisplayed() {
		
		Factory.isDisplayed();
	}
	
	@FindBy(css="div[class='tab-items'] a:nth-child(13)")
	WebElement Manufacturing;
	
	public void manufacturingdisplayed() {
		
		Manufacturing.isDisplayed();
	}
	
	@FindBy(css="div[class='tab-items'] a:nth-child(14)")
	WebElement commercialother;
	
	public void otherdisplayed() {
		
		commercialother.isDisplayed();
	}
	
	
}


