package week2.day3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Launch the browser
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Pass values to To and From station and clear the Pre-filled values if any
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS", Keys.TAB);

		boolean selectedDate = driver.findElementById("chkSelectDateOnly").isSelected();
		if (selectedDate == true)
			driver.findElementById("chkSelectDateOnly").click();
		System.out.println(selectedDate);

		// Get the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		// Get the rows
		List<WebElement> row = table.findElements(By.tagName("tr"));
		// Get the row count
		int rowsize = row.size();
		System.out.println("Rows Count:" + rowsize);

		// Get the index to print first row
		WebElement frow = row.get(0);
		// Get the total number of columns in the row
		List<WebElement> column = frow.findElements(By.tagName("td"));
		// Get the column count
		int columnSize = column.size();
		System.out.println("Column Count:" + columnSize);

		// To print all the train names present in column 2
		for (int i = 0; i <= rowsize - 1; i++) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement frows = rows.get(i);
		System.out.println(i);
		List<WebElement> cols = frows.findElements(By.tagName("td"));
		WebElement SecondCols = cols.get(1);
		String outputs = SecondCols.getText();
		System.out.println(outputs);
		}
	}
}
