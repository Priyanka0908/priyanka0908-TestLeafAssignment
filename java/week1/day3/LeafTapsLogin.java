package week1.day3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {
		// Add System property--> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//Launch Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Wait for the elements to appear
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleH2 = driver.findElementByTagName("h2");
		String text = eleH2.getText();
		System.out.println(text);
		
		String attribute = driver.findElementById("login").getAttribute("method");
		System.out.println(attribute);
	}
}