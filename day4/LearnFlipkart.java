package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		// Hover the cursor on Electronics
		WebElement electronicElement = driver.findElementByXPath("//span[text()='Electronics']");
		// Actions
		Actions builder = new Actions(driver);
		builder.moveToElement(electronicElement).perform();
		Thread.sleep(3000);
		WebElement miLink = driver.findElementByLinkText("Mi");
		miLink.click();
		//builder.moveToElement(miLink).perform();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Mi")) {
			System.out.println("MI page is re-directed");
		} else {
			System.out.println("MI page is not re-directed");
		}
		driver.close();
	}
}