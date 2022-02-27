package Academy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AddcartBookbyauthorpage5;
import pageObjects.Authorspage2;
import pageObjects.ChekOutPage7;
import pageObjects.ConfirmorderCartpage6;
import pageObjects.Filterderauthor3;

import pageObjects.Homepage1;
import pageObjects.filterBookAuthorpage4;
import resources.base;

public class runpage1 extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	    @BeforeTest
		public void initialize() throws IOException {
			
			driver=initializeDriver();
			
			
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			//Thread.sleep(2000);
		}
	
	//click on authors
		@Test(priority=1)
		public void Homepage() throws IOException {
			
		//	ExtentTest test= extent.createTest("Homepage");
	    Homepage1 hp=new Homepage1(driver);
			
			hp.author().click();//clck on author
			//Thread.sleep(2000);//
			//extent.flush();
		}
		//click on humayun ahamed
		@Test(priority=2)
		public void authors() throws IOException,InterruptedException {
			//ExtentTest test= extent.createTest("authors");
			
	     Authorspage2 ap=new Authorspage2(driver);
			
			
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",ap.humayunahamed());
			
			ap.humayunahamed().click();//click on humayun ahamed
			//Thread.sleep(2000);
			Assert.assertEquals(ap.varifyhumayun().getText(), "হুমায়ূন আহমেদ");
			
			System.out.println("Test completed");
			
			//extent.flush();
		}
		//select author from filter by authors 
		@Test(priority=3)
		public void filterbookbyauthor() throws IOException, InterruptedException {
			//ExtentTest test= extent.createTest("filterbookbyauthor");
			
			Filterderauthor3 ha=new Filterderauthor3(driver);
			ha.anyauthorlink().click();
			Thread.sleep(3000);
			ha.selectauthor();
			Thread.sleep(2000);
			
			//extent.flush();
		}
		//select book 
		@Test(priority=4)
		public void selectauthorbook() throws IOException, InterruptedException {
			//ExtentTest test= extent.createTest("selectauthorbook");
			
			filterBookAuthorpage4 fp=new filterBookAuthorpage4(driver);
			
			fp.selectbook().click();
			Thread.sleep(2000);
			//extent.flush();		
		}
		//click plus minus button and addto cart
		@Test(priority=5)
		public void Addtocart() throws IOException,InterruptedException {
			//ExtentTest test= extent.createTest("Addtocart");
			for(int i=0;i<3;i++) {
				driver.findElement(By.xpath("//input[@class='plus button is-form']")).click();
				Thread.sleep(2000);
				
			}
			
			AddcartBookbyauthorpage5 ac=new AddcartBookbyauthorpage5(driver);
			ac.addtocart().click();
			//extent.flush();
		}
		// click confirm button
		@Test(priority=6)
		public void cart() throws IOException, InterruptedException {
		//ExtentTest test= extent.createTest("cart");
		ConfirmorderCartpage6 co=new ConfirmorderCartpage6(driver);
		co.confirmclick().click();
		Thread.sleep(2000);
		//extent.flush();
		}
		@Test(priority=7)
		public void checkout() throws InterruptedException {
			//ExtentTest test= extent.createTest("checkout");
			ChekOutPage7 co=new ChekOutPage7(driver);
			co.selectfirstname().sendKeys("moshiur");
			co.selectlastname().sendKeys("rahman");
			Thread.sleep(2000);
			WebElement anycountry=driver.findElement(By.xpath("//select[@id='billing_country']"));
			Select country=new Select(anycountry);
			country.selectByVisibleText("Bangladesh");
			
			co.streetadress().sendKeys("abcde");
			co.towncity().sendKeys("Chattogram");
			WebElement dist=driver.findElement(By.xpath("//select[@id='billing_state']"));
			Select district=new Select(dist);
			district.selectByVisibleText("Chattogram");
			co.Postcode().sendKeys("2405");
			co.Billingmobilenum().sendKeys("01725");
			co.Billingemail().sendKeys("mrrahman123@gmail.com");
			co.Additionalinfo().sendKeys("N/A");
			Thread.sleep(2000);
			//try {
			WebElement currier=driver.findElement(By.xpath("//ul[@id='shipping_method']/li[@class='shipping__list_item']"));
			Select shipping=new Select(currier);
			shipping.selectByVisibleText("Sundarban Courier (Condition):");
			//}catch(Exception e){
				//System.out.println("this exception is for selet shipping"+e);
			//}
			Thread.sleep(2000);
			co.PlaceOrder().click();
			Thread.sleep(2000);
			//extent.flush();
			}
			
		 @AfterTest
		 public void teardown() {
		 	driver.close();
		 	//driver=null;
		 }

	
}
