package week5.homeassign;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.MapReduceCommand.OutputType;


public class AmazonActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Setup ChromeDriver and open Amazon
				ChromeDriver driver = new ChromeDriver();
				ChromeOptions options =new ChromeOptions();
				options.addArguments("guest");
				options.addArguments("--disable-notifications");
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Search for "oneplus 9 pro"
				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox.sendKeys("oneplus 9 pro", Keys.ENTER);
				
		//Get the price of the first product
				
				WebElement firstprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
				String price = firstprice.getText().replaceAll(",", "");
				System.out.println("Price of the first product" +price);
				
		// Print number of customer ratings
				WebElement customer = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
				System.out.println("Customer Ratings: " + customer.getText());
				
				//Print the ratings for the first displayed product
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
				String rating = driver.findElement(By.id("acr-popover-title")).getText();
				System.out.println("The rating for the first product in the list is: " + rating);
				
		
				driver.findElement(By.xpath("(//div/a//h2)[1]")).click();
				
			 WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
			 Actions act = new Actions(driver);
			
			 act.moveToElement(addToCart).click().perform();
						Thread.sleep(3000); // Allow time for cart to update
			
				WebElement cartSubtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
				String subtotal = cartSubtotal.getText().replaceAll(",", "");
				System.out.println("Cart Subtotal: ₹" + subtotal);

				if (subtotal.equals(price)) {
					System.out.println("✅ Subtotal is correct!");
				} else {
					System.out.println("❌ Subtotal mismatch!");
				}

				// Close browser
				driver.quit();
				
				


		
	}

}
