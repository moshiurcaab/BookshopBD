package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmorderCartpage6 {
	public WebDriver driver;
   // By shipping=By.xpath("//ul[@id='shipping_method']/li[@class='shipping__list_item']/label[@class='shipping__list_label']");
	//By shipping=By.xpath("//ul[@id='shipping_method']/li[@class='shipping__list_item']");
   // By ship=By.xpath("//input[@id='shipping_method_0_flat_rate16']");//click on shiping charge
    By confirm=By.xpath("//span[contains(text(),'Confirm Order')]");//confirm order
    
    public ConfirmorderCartpage6(WebDriver driver) {
		this.driver=driver;
	}
   
   // public WebElement shipingcharge() {
    //	return driver.findElement(ship);
	//}
    public WebElement confirmclick() {
    	return driver.findElement(confirm);
	}
    
}
