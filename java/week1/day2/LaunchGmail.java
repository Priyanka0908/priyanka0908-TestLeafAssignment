package week1.day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("http://gmail.co.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Capabilities capabilities = driver.getCapabilities();
		System.out.println(capabilities);
	}
}