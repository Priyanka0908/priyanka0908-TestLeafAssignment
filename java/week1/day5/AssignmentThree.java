package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Click allow on show notifications pop-up
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				
				// ChromeDriver is launched
				ChromeDriver driver = new ChromeDriver(options);
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				// URL launch
				driver.get("https://www.amazon.in/");
				//Click Book Links
				driver.findElementByLinkText("Books").click();
				//Search with selenium in search box and select second option
				WebElement searchButton=driver.findElementById("twotabsearchtextbox");
				searchButton.sendKeys("Selenium ");
				Actions builder = new Actions (driver);
				builder.moveToElement(searchButton).perform();
				//Click on Selenium WebDriver option from the list
				driver.findElementByXPath("(//div[@class='s-suggestion'])[2]").click();
				//Get the name of the book and print it
				String bookTitle = driver.findElementByXPath("//span[text()='Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition']").getText();
				System.out.println("Title of the book is "+bookTitle);
				//Get the name of the author and print it
				String authorName = driver.findElementByLinkText("Unmesh Gundecha").getText();
				System.out.println("The author Name is " +authorName);
				//Get the price of the book and print it
				String bookPrice = driver.findElementByXPath("//span[text()='453']").getText();
				System.out.println("The cost of the book is " +bookPrice);
				//Close the Driver
				driver.close();
				
				
			
	}

}
