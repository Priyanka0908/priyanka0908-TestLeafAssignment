package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeDriver is launched
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//URL launch
		driver.get("https://acme-test.uipath.com/account/login");
		//Implicit wait to load result set
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//User name and Password are provide
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		//Login button clicked
		driver.findElementById("buttonLogin").click();
		//Mouse Over on Vendors
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");  
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();	
		//Search for Vendor
		driver.findElementByLinkText("Search for Vendor").click();
		//Enter Vendor Name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		//Click Search
		driver.findElementById("buttonSearch").click();
		//Find Country Name
		String countryName = driver.findElementByXPath("(//table[@class='table']//td)[5]").getText();
		System.out.println(countryName);
		//Click Logout
		driver.findElementByLinkText("Log Out").click();
		//Close the browser
		driver.close();
	
		
	}
}
