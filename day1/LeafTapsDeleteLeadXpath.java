package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsDeleteLeadXpath {

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

		// Click on Phone
		driver.findElementByXPath("//span[text()='Phone']").click();

		// Enter Phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234");

		// CLick on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);

		// Capture the resulting lead
		String firstResultingRow = driver
				.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]").getText();
		System.out.println(firstResultingRow);

		// CLick first resulting lead ID
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]").click();

		// Click Delete Lead
		driver.findElementByXPath("//a[text()='Delete']").click();

		// Click on Find Leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		// Enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstResultingRow);

		// CLick on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);

		// Confirm whether it is deleted
		String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if (text.contains("No records to display")) {
			System.out.println("Lead is successfully deleted");
		}

		// Close the browser
		driver.close();
	}
}
