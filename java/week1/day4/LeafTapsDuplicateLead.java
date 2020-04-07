package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsDuplicateLead {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to load the URL of the leaf taps application
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesmanager");

		WebElement elePassword = driver.findElementByName("PASSWORD");
		elePassword.sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementByLinkText("Find Leads").click();

		driver.findElementByXPath("//span[text()='Email']").click();

		driver.findElementByName("emailAddress").sendKeys("test");

		WebElement firstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]");
		String firstNameResultingSet = firstName.getText();
		System.out.println("First name displayed is " + firstNameResultingSet);

		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();

		driver.findElementByLinkText("Duplicate Lead").click();

		String duplicateTitle = driver.getTitle();
		System.out.println(duplicateTitle);

		boolean verifiedTitle = duplicateTitle.contains("Duplicate");
		System.out.println("Current page verified title is : " + verifiedTitle);

		if (!verifiedTitle) {
			System.out.println("Current page verified title is : " + verifiedTitle);
		}

		WebElement duplicateLeadName = driver.findElementById("createLeadForm_firstName");
		String newLeadName = duplicateLeadName.getAttribute("value");

		if (newLeadName.equalsIgnoreCase(firstNameResultingSet)) {

			System.out.println("Duplicate Name are same");
			driver.close();
		} else {
			System.out.println("Duplicate name are not same");
			driver.close();
		}
	}
}
