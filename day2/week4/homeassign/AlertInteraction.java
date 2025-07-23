package week4.homeassign;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteraction {
	
	public static void main(String[] args) {
		
			
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(("(//span[@class='ui-button-text ui-c'])[6]"))).click();
			//switch the driver focus to the alert box
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Hi Welcome ");
			alert.dismiss();
			
			WebElement action = driver.findElement(By.xpath("//span[@id='confirm_result']"));
			String result = action.getText();
			System.out.println(result);
			
			if (result.contains("User cancelled the prompt.")) {
				System.out.println("Test case passed");
			}
			else {
				System.out.println("Test case failed");
			}
		
	}

}
