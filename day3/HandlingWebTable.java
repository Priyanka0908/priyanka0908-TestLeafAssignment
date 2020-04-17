package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS",Keys.TAB);
		//Step 1: Find the table(WebElement):-
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//Step 2: Find the row count
		driver.findElementsByTagName("tr");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int rowsCount = allRows.size();
		System.out.println(rowsCount);
	}
}