package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage1 {
	
	public WebDriver driver;
	By authorlink=By.partialLinkText("লেখক");


public Homepage1(WebDriver driver) {
	this.driver=driver;
}
	
	public WebElement author() {
		return driver.findElement(authorlink);
		
	}
}


