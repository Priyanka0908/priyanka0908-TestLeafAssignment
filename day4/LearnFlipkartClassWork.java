package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipkartClassWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electronicElement = driver.findElementByXPath("//span[text()='TVs & Appliances']");

		Actions builder = new Actions(driver);
		builder.moveToElement(electronicElement).perform();
		Thread.sleep(3000);
		driver.findElementByLinkText("LG").click();
		System.out.println(driver.findElementByXPath("//div[contains(text(),'LG All-in-One 80cm (32 inch)')]").getText());
		driver.close();
		

	}

}
