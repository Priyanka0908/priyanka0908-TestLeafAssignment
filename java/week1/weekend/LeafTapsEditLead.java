package week1.weekend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsEditLead {

	public static void main(String[] args) throws InterruptedException {
		// System Property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to load the URL of the leaf taps application
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Enter username
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesmanager");

		// Enter password
		WebElement elePassword = driver.findElementByName("PASSWORD");
		elePassword.sendKeys("crmsfa");

		// click login button
		driver.findElementByClassName("decorativeSubmit").click();

		// click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// click on Leads
		driver.findElementByLinkText("Leads").click();

		// click on find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);

		// enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Babu");

		// click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

		// click first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();

		// verify title
		String editLeadTitle = driver.getTitle();
		System.out.println(editLeadTitle);

		// click on edit title
		driver.findElementByLinkText("Edit").click();

		// edit company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Edit Company Name");
		String editCompanyName = driver.findElementById("updateLeadForm_companyName").getText();
		System.out.println(editCompanyName);

		// Click on update button
		driver.findElementByName("submitButton").click();

		// Verify the updated name
		String verifyUpdatedName = driver.findElementById("viewLead_companyName_sp").getText();

		System.out.println(verifyUpdatedName);
		if (verifyUpdatedName.contains(editCompanyName)) {
			System.out.println("Name is updated");
		} else {
			System.out.println("Name is not updated");
		}

		// close the browser
		driver.close();
	}

}
