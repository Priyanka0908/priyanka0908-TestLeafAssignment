package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Click allow on show notifications pop-up
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		// ChromeDriver is launched
		ChromeDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// URL launch
		driver.get("https://www.redbus.in/");
		
		//Enter Source
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		
		//Enter Destination
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
			
		//Select Onward Date
		driver.findElementByXPath("//label[@for='onward_cal']").click();
		Thread.sleep(1000);
		
		//Select April 30
		driver.findElementByXPath("(//td[text()='30'])[2]").click();
		
		//Click Search buses
		driver.findElementById("search_btn").click();
		
		//Select before 6AM
		driver.findElementByXPath("(//label[@for='dtBefore 6 am'])[1]").click();
		
		//Select Sleeper
		driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();
		
		driver.findElementByLinkText("Seats Available").click();
		
		//close browser
		driver.close();
	}

}
