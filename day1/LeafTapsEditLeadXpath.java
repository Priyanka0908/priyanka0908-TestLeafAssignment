package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsEditLeadXpath {

	public static void main(String[] args) throws InterruptedException {

		// System Property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to load the URL of the leaf taps application
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Enter user name
		WebElement eleUsername = driver.findElementByXPath("(//input[@id='username'])");
		eleUsername.sendKeys("DemoSalesmanager");

		// Enter password
		WebElement elePassword = driver.findElementByXPath("(//input[@id='password'])");
		elePassword.sendKeys("crmsfa");

		// click login button
		driver.findElementByXPath("(//input[@value='Login'])").click();

		// click on CRM/SFA
		driver.findElementByXPath("(//div[@id='label']/a)").click();

		// click on Leads
		driver.findElementByXPath("(//a[text()='Leads'])").click();

		// click on find leads
		driver.findElementByXPath("(//a[text()='Find Leads'])").click();
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

		// click on edit button
		driver.findElementByLinkText("Edit").click();
		//driver.findElementByXPath("//a[@text='Edit']").click();

		// edit company name
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Edit Company Name");
		Thread.sleep(2000);
		//System.out.println(editCompanyName);
		String editCompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getText();
		System.out.println(editCompanyName);
		
		// Click on update button
		driver.findElementByXPath("(//input[@name='submitButton'])").click();
		
		// Verify the updated name
		String verifyUpdatedName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();

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
