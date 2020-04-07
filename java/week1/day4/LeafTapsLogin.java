package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		// login button color on LeafTaps Login
		String bgColor = driver.findElement(By.tagName("h2")).getCssValue("background-color");
		System.out.println("The Bg color is: " + bgColor);
		// font size of Username
		String fontSize = driver.findElementByXPath("//label[@for='username']").getCssValue("font-size");
		System.out.println("The font size is: " + fontSize);
		// Width of the login button
		int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		System.out.println("The width is: " + width);
		// Find x position of the username text box
		WebElement eleUserName = driver.findElementById("username");
		System.out.println("The x value is: " + eleUserName.getLocation().getX());
	}
}
