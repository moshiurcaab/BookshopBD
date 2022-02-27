package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddcartBookbyauthorpage5 {
	public WebDriver driver;
	By selectaddtocart=By.xpath("//button[contains(text(),'Add to cart')]");
	
	
	public AddcartBookbyauthorpage5(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement addtocart() {
		return driver.findElement(selectaddtocart);
	}
	
}
