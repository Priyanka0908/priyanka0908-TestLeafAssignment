package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElementCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		// 1>How many Links are available ?
		// Find the link by tag name and get the size
		List<WebElement> totalLinks = driver.findElementsByTagName("a");
		System.out.println(totalLinks.size());
		// 2>Click the first Link on the page and print the title
		// Click the first link and print the title
		totalLinks.get(0).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();

		// 3>Click on the last 'Go To Home Page' link
		// Click on the last 'Go to Home Page' link
		/*
		 * List<WebElement> element = driver.findElementsByLinkText("Go to Home Page");
		 * System.out.println(element.size()); element.get(element.size()-1).click();
		 */

		WebElement ele = driver.findElementByXPath("(//a[text()='Go to Home Page'])[last()]/following-sibling::label");
		System.out.println(ele.getText());
	}
}
