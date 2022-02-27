package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authorspage2 {
	
	public WebDriver driver;
	By humayun=By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");//for click humayun ahamed
	
	By varifyhumayunAhamed=By.xpath("//h1[contains(text(),'হুমায়ূন আহমেদ')]");
	
	
	
	
	public Authorspage2(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement humayunahamed() {
		return driver.findElement(humayun);
	}
	public WebElement varifyhumayun() {
		return driver.findElement(varifyhumayunAhamed);
	}
	
	
	
	

}
