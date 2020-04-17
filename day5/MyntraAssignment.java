package week2.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAssignment {

	public static void main(String[] args) throws InterruptedException {
		// set system property
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// launch driver
		ChromeDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("http://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Mouse Hover on Women menu item and select Jackets & Coats
		WebElement target = driver.findElement(By.xpath("//a[@data-index=1 and text()='Women']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(target).perform();
		driver.findElement(By.linkText("Jackets & Coats")).click();

		// Getting Total count on top
		String count = driver.findElement(By.className("title-count")).getText().replaceAll("\\D", "");
		int totalCount = Integer.parseInt(count);

		// Getting Jackets count -- left side
		String jackets = driver
				.findElement(
						By.xpath("(//span[text()='Categories']/following::label/span[@class='categories-num'])[1]"))
				.getText().replaceAll("\\D", "");
		int jacketsCount = Integer.parseInt(jackets);

		// Getting Coats count-- left side
		String coats = driver
				.findElement(
						By.xpath("(//span[text()='Categories']/following::label/span[@class='categories-num'])[2]"))
				.getText().replaceAll("\\D", "");
		int coatsCount = Integer.parseInt(coats);

		// Total count and categories count verification
		int jacketsAndCoats = jacketsCount + coatsCount;

		if (totalCount == jacketsAndCoats) {
			System.out.println("Total counts matches with the sum of category");
		} else {
			System.out.println("There is Count Mismatches");
		}

		// Selecting Coats Check box
		driver.findElement(
				By.xpath("//span[text()='Categories']/following::label/input[@value='Coats']/following::div")).click();

		// Clicking on + more options
		driver.findElement(By.xpath("//span[text()='Brand']/following::div[@class='brand-more']")).click();

		// Entering Brand name as MANGO and closing the filter pop up
		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("MANGO");
		driver.findElement(By.xpath("(//span[@class='FilterDirectory-count']/following::div)[1]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close')]")).click();

		Thread.sleep(3000);

		// Verification for Total count on top and total items displayed on current page
		List<WebElement> brandMango = driver.findElementsByTagName("h3");
		String filterCount = driver.findElement(By.className("title-count")).getText().replaceAll("\\D", "");
		int brandCount = Integer.parseInt(filterCount);
		if (brandMango.size() == brandCount) {
			System.out.println("Total count and displayed items matches");
		} else {

			System.out.println("Total count and displayed items not matches");
		}

		// Verification for all items are displayed with brand name "MANGO"
		for (WebElement brandNameMango : brandMango) {
			if (brandNameMango.getText().equals("MANGO")) {
				System.out.println("All " + brandMango.size() + " brand names are displayed as Mango");
				break;
			} else {
				System.out
						.println("Some brand names are not equal to given name 'MANGO' -- " + brandNameMango.getText());
			}
		}

		// Sorting action for better discount
		driver.findElement(By.className("sort-sortBy")).click();
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();

		Thread.sleep(3000);

		// Getting the price of the first displayed item
		String firstDisplayedItem = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"))
				.getText().replaceAll("\\D", "");
		System.out.println("Price of the first displayed discounted item is: " + Integer.parseInt(firstDisplayedItem));

		Thread.sleep(3000);

		WebElement firstItemSize = driver.findElement(By.xpath("(//h3[text()='MANGO'])[1]"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(firstItemSize).perform();
		driver.findElement(By.xpath("(//span[text()='wishlist now'])[1]")).click();

		// close driver
		driver.close();
	}
}