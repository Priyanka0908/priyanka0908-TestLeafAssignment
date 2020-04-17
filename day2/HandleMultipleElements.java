package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

				// enter first name 1.size() returns size and print
				List<WebElement> allFirstNames = driver.findElementsByXPath("//label[text()='First name:']");
				 int size = allFirstNames.size();
				 System.out.println(size);
				 
				 //Print the first element
				 WebElement firstMatch = allFirstNames.get(0);
				 System.out.println(firstMatch.getAttribute("class"));
	}
}
