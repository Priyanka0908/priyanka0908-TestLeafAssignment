package week2.day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Step 1> Find dropdown ->WebElemnet
		WebElement dropdown1 = driver.findElementById("dropdown1");

		// Step 2> Convert the WebElement -> Select is class
		Select dd = new Select(dropdown1);
		// Step 3> Interact with drop down with methods
		dd.selectByVisibleText("UFT/QTP");
		// Visible Text-> Use data for specific language(EN)
		// If using multi lingual application, prefer to use value
		dd.selectByValue("4");
		// Select last item in the drop down, first find the total options available
		List<WebElement> options = dd.getOptions();
		// Find the count of the list item size()
		int count = options.size();
		// Select the last one, since number it is index method
		dd.selectByIndex(count - 1);
		// To select multiple items
		WebElement drop2 = driver.findElementByXPath("//select[last()]");
		Select dropDown5 = new Select(drop2);
		boolean multipleSelection = dropDown5.isMultiple();
		System.out.println(multipleSelection);
	}
}
