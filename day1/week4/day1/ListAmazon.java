package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.className("a-button-text")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("field-keywords")).sendKeys("Mobile Phone",Keys.ENTER);
		
	
	List<WebElement> prices = driver.findElements(By.className("a-price-whole"));

		
	List<String> pricelist = new ArrayList<String>();
	
		
		for(WebElement each :prices) {
			
			String priceamount =each.getText();
		pricelist.add(priceamount);
		}
		
		System.out.println(pricelist);
		}
		
	}

