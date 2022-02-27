package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChekOutPage7 {
	public WebDriver driver;
	
	By Firstname=By.xpath("//input[@id='billing_first_name']");//first name
	By Lastname=By.id("billing_last_name");//last name
	By Country=By.className("country_to_state country_select fl-select");//country select 
	By adress=By.cssSelector("input#billing_address_1");//adress write
	By city=By.xpath("//input[@id='billing_city']");//town/city click
	By postcode=By.cssSelector("input#billing_postcode");// post code write
	By mobile=By.xpath("//input[@id='billing_phone']");//mobile num write
	By mail=By.cssSelector("#billing_email");//email write
	By additionalinfo=By.xpath("//textarea[@id='order_comments']");//additional information
	By placeorder=By.xpath("//button[@id='place_order']");
	
	
	public ChekOutPage7(WebDriver driver) {
		this.driver=driver;
	}
		public WebElement selectfirstname() {
			return driver.findElement(Firstname);
		}
		public WebElement selectlastname() {
			return driver.findElement(Lastname);
		}
		public WebElement selectcountry() {
			return driver.findElement(Country);
		}
		public WebElement streetadress() {
			return driver.findElement(adress);
		}
		public WebElement towncity() {
			return driver.findElement(city);
		}
		public WebElement Postcode() {
			return driver.findElement(postcode);
		}
		public WebElement Billingmobilenum() {
			return driver.findElement(mobile);
		}
		public WebElement Billingemail() {
			return driver.findElement(mail);
		}
		public WebElement Additionalinfo() {
			return driver.findElement(additionalinfo);
		}
		public WebElement PlaceOrder() {
			return driver.findElement(placeorder);
		}
	
}
