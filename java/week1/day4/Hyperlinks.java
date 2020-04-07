package week1.day4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");

		// without clicking find the URL
		WebElement eleLink = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		String linkWhere = eleLink.getAttribute("href");
		System.out.println(linkWhere);

		// Verify am I broken?
		WebElement eleVerify = driver.findElementByLinkText("Verify am I broken?");
		eleVerify.click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("404")) {
			System.out.println("Broken");
		} else {
			System.out.println("Looks good");
		}
	}
}