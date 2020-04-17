package week2.day3;

import java.util.List;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Get the table and store it as a WebElement
		WebElement tabletext = driver.findElementById("table_id");
		// Find the number of rows based on its tag name and store it in a list
		List<WebElement> rownumber = tabletext.findElements(By.tagName("tr"));
		// Print the size of the rows
		int rowcount = rownumber.size();
		System.out.println(rowcount);	
		// Find the number of columns based on its tag name and store it in a list
		List<WebElement> colnumber = tabletext.findElements(By.tagName("td"));
		// Print the size of the column
		int colcount = colnumber.size();
		System.out.println(colcount);
		
		//Get the progress value of 'Learn to interact with Elements' and store it in a variable and print the text
		WebElement secondrow = rownumber.get(2);
		List<WebElement> colnumber1 = secondrow.findElements(By.tagName("td"));
		WebElement firstcol = colnumber1.get(0);
		String colfirst = firstcol.getText();
		System.out.println(colfirst);
		
		//Find the vital task for the least completed progress and check the box
		WebElement thirdrow = rownumber.get(3);
		List<WebElement> colnumber2 = thirdrow.findElements(By.tagName("td"));
		WebElement seccol = colnumber2.get(1);
		String value = seccol.getText();
		System.out.println("Min value is: " + value);
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		
		//Close driver
		driver.close();
	}
}