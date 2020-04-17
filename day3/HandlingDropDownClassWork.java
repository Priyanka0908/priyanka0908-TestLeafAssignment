package week2.day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownClassWork {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesmanager");
		WebElement elePassword = driver.findElementByName("PASSWORD");
		elePassword.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Priyanka");
		driver.findElementById("createLeadForm_lastName").sendKeys("Dubey");
		// Step 1> Choose drop down ->WebElemnet
		WebElement sourcedropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select employeeDropdown = new Select(sourcedropDown);
		// Select the drop down option by VisibleText
		employeeDropdown.selectByVisibleText("Employee");
		// Choose drop down ->WebElemnet
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryDropdown = new Select(industry);
		// Select last option in Industry with index
		List<WebElement> options = industryDropdown.getOptions();
		int count = options.size();
		industryDropdown.selectByIndex(count - 1);
		// Choose Drop down ->WebElemnet
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select ownershipDropdown = new Select(ownership);
		ownershipDropdown.selectByValue("OWN_LLC_LLP");
		driver.findElementByName("submitButton").click();
		driver.close();
	}
}