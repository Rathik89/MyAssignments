package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonPrice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				// Search for phones
				driver.findElement(By.className("a-button-text")).click();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones" + Keys.ENTER);

				// Get list of product price
				List<WebElement> price = driver.findElements(By.xpath("(//span[@class='a-price-whole'])"));
				// size of the list
				System.out.println("Total prices found: " + price.size());

				// Extract prices into a list of Integers
				List<Integer> PhonePrices = new ArrayList<Integer>();
				for (WebElement Phone : price) {
					String PhoneCost = Phone.getText().replace(",", "").trim(); //remove comma
					//convert the string to int
					int value = Integer.parseInt(PhoneCost);
					System.out.println(value);
					PhonePrices.add(value);

				}
				 // Print unsorted list
		        System.out.println("Unsorted prices: " + PhonePrices);

		        // Sort the list
		        Collections.sort(PhonePrices);

		        // Print sorted prices
		        System.out.println("Sorted prices (low to high): " + PhonePrices);
		        
		     // Get the first item from the sorted list (lowest price)
		        int lowestPrice = PhonePrices.get(0);
		        System.out.println("Least Price: ₹" + lowestPrice);

		        // Close browser
		        driver.quit();


	}

}
