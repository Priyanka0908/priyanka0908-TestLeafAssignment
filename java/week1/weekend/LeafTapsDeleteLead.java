package week1.weekend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsDeleteLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// open the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter the password
		driver.findElementById("password").sendKeys("crmsfa");

		// Clicking Login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads
		driver.findElementByLinkText("Leads").click();

		// Click on Find Leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);

		// click on phone
		driver.findElementByXPath("//span[text()='Phone']").click();

		// Enter PhoneNumber
		driver.findElementByName("phoneNumber").sendKeys("1234");

		// CLick on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);

		// Capture Lead ID of first resulting lead
		WebElement firstResultingRow = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		String firstID = firstResultingRow.getText();
		System.out.println("The Lead ID of the first resulting row is :" + firstID);

		// Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();

		// Delete the lead
		driver.findElementByClassName("subMenuButtonDangerous").click();

		// Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		
		// Enter captured lead ID
		driver.findElementByName("id").sendKeys(firstID);
		
		// Click Find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		// Capture No Records to display attribute
		String noRecordFound = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		if (noRecordFound.contains("No records")) {
			System.out.println("Verified: " + noRecordFound);

		} else {
			System.out.println("Not Verified");
		}
		
		// close the browser
		driver.close();
	}
}