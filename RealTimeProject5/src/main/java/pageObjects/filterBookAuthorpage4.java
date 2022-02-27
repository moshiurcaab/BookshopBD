package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filterBookAuthorpage4 {
	public WebDriver driver;
	By bookselect=By.partialLinkText("দেবী");//select debi
	//By addtocart=By.xpath("//strong[contains(text(),'+')]");
	

	
	
	public filterBookAuthorpage4(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement selectbook() {
		return driver.findElement(bookselect);
	}
	//public WebElement selectbook() {
	//	return driver.findElement(addtocart);
	//}
		
}

