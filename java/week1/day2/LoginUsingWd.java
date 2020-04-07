package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingWd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().refresh();
		driver.navigate().to("https://google.co.in");
		driver.close();
		driver.quit();
	}

}
