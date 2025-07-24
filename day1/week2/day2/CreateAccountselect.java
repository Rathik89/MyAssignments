package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccountselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver .get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
				WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Rathi");
		
	}

}
