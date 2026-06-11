package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Base.Browser;
import utility.LogUtil;
import utility.waits;

public class BookingStay{
	
	By HotelIcon = By.xpath("//li[@data-cy='menu_Homestays']");
	By SearchCity = By.xpath("//label[@for='city']");
	By EnterCity = By.xpath("//input[@autocomplete='off']");
	By location = By.xpath("//p[text()='Koramangala']");
	By Checkin = By.xpath("(//span[text()='24'])[1]");
	By Checkout = By.xpath("(//span[text()='26'])[2]");
	By Apply = By.xpath("//button[@data-cy='RoomsGuestsNew_327']");
	By search = By.xpath("//button[@id='hsw_search_button']");
	By Breakfast = By.xpath("(//span[@data-testid='checkboxFilter'])[5]");
	By PriceNavigation = By.xpath("//ul[@class='filterList']");
	By Price = By.xpath("//label[@for='₹ 4000 - ₹ 8000']");
	By numberOfProperties = By.xpath("//div[@id='seoH1DontRemoveContainer']");
	public void stay()
	{
		LogUtil.info("Started to Searching Hotel");
		waits.waitForClickable(HotelIcon).click();
	}
	public void SearchCity() {
		LogUtil.info("Searching City");
		waits.waitForClickable(SearchCity).click();
	}
	public void EnterCity() {
	waits.waitForClickable(EnterCity).sendKeys("Bangalore");
	}
   public void location() {
	   LogUtil.info("Entered Location");
	   waits.waitForClickable(location).click();
   }
 public void checkIn() {
	 LogUtil.info("Entered Check-In");
	 waits.waitForClickable(Checkin).click();
		
 }
 public void checkOut() {
	 LogUtil.info("Entered Check-Out");
	 waits.waitForClickable(Checkout).click();
 }
 public void Apply() {
	 waits.waitForClickable(Apply).click();
 }
 public void Submit()
 {
	 LogUtil.info("Submitted Selection");
	 waits.waitForClickable(search).click(); 
 }
 public void Breakfast()
 {
	 LogUtil.info("Searching Hotel with Breakfast");
	waits.waitForClickable(Breakfast).click(); 
 }
 public void scroll()
 {
	 JavascriptExecutor js = (JavascriptExecutor) Browser.driver;
	 js.executeScript("arguments[0].scrollIntoView();", PriceNavigation);
 }
 public void PriceSelection()
 {
	 LogUtil.info("Selecting Price");
	 waits.waitForClickable(Price).click(); 
 }
 public String totalProperties()
 { 
	 
	    waits.waitForVisible(numberOfProperties);
		String totalProperties = Browser.driver.findElement(numberOfProperties).getText();
		System.out.println("Total Properties: " + totalProperties);
		return totalProperties;
 }
 
   }
		
	
