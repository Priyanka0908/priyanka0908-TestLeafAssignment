package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectableUsingCtrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement itemOne = driver.findElementByXPath("//ol[//@id='selectable']/li[1]");
		WebElement itemThree = driver.findElementByXPath("//ol[//@id='selectable']/li[3]");
		WebElement itemFive = driver.findElementByXPath("//ol[//@id='selectable']/li[5]");
		WebElement itemSeven  = driver.findElementByXPath("//ol[//@id='selectable']/li71]");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(itemOne).click(itemThree).click(itemFive).click(itemSeven).perform();
		
		
		
	}
}
