package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

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
		driver.findElementByName("submitButton").click();
		String viewLeadtitle = driver.getTitle();
		System.out.println(viewLeadtitle);
		WebElement firstName = driver.findElementById("viewLead_firstName_sp");
		String inputName = firstName.getText();
		System.out.println(inputName);
		String expectedName = "Priyanka";
		if (inputName.equalsIgnoreCase(expectedName))
				{
			System.out.println("Result is verified");
		}
		else {
			System.out.println("Result cannot be verified");
		}
		driver.close();
	}

}