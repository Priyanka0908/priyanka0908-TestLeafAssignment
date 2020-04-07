package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDeal {

	public static void main(String[] args) {
		
				// add system property -> webdriver.chrome.driver
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

				// Open the chrome browser
				// ChromeDriver (C) -> Written by Selenium Team
				ChromeDriver driver = new ChromeDriver();

				// Wait (for the element to appear for the max time: 30)
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// Load the URL :: get ->
				driver.get("http://www.leafground.com/pages/checkbox.html");
				
				// Find the selenium check box
				
				WebElement eleCheckBox = driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]");
				boolean checked = eleCheckBox.isSelected();
				System.out.println(checked);
				
				if(!checked) {
					eleCheckBox.click();
				}
	}

}
