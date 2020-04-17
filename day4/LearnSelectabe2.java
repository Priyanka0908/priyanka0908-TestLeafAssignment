package week2.day4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement itemTwo = driver.findElementByXPath("//ol[//@id='selectable']/li[2]");
		WebElement itemFour = driver.findElementByXPath("//ol[//@id='selectable']/li[4]");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(itemTwo).release(itemFour).perform();
		

	}

}
