package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Filterderauthor3 {
	public WebDriver driver;
	
	By anyauthors=By.xpath("//span[contains(text(),'Any Author')]");//clcik any author
	
	
	
	
	public Filterderauthor3(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement anyauthorlink() {
		return driver.findElement(anyauthors);
	}
	//select humayun or selinaaktar
	public void selectauthor() {
		//try {
			WebElement author=driver.findElement(By.xpath("//span[contains(text(),'Any Author')]"));
			Select anyauthor=new Select(author);
			anyauthor.selectByVisibleText("হুমায়ূন আহমেদ");
			//}catch (Exception e) {
			//     System.out.println("this Exception is for selection author  :"+e);
		 //  }
		//finally {
			
	//	}
		}
	}
	
	


