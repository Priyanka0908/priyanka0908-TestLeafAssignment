package week1.day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundPageTextDeal {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("priyanka.dubey@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Priyanka", Keys.TAB);
		String attribute = driver.findElementByName("username").getAttribute("value");
		System.out.println(attribute);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		boolean Status = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(Status);
	}
}
