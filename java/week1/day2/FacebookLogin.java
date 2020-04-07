package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("testingselenium2020@gmail.com");		
		driver.findElementById("pass").sendKeys("testingselenium");
		driver.findElementById("loginbutton").click();
	}

}
