package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSortableAdvUI {

	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//implicit wait for 30 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Launch the URL
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		//click sortable
		driver.findElementByXPath("(//img[@alt='sortable']").click();	
		//Locate source and target to sort
		WebElement drag = driver.findElementByXPath("//u1[@id='sortable']/li[1]");
		int x = driver.findElementByXPath("//u1[@id='sortable']/li[4]").getLocation().getX();
		int y = driver.findElementByXPath("//u1[@id='sortable']/li[4]").getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		//drag and drop
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, x, y);
	}
}
