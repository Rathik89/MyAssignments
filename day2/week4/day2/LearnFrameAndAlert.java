package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAndAlert {
	
public static void main(String[] args) {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert alert= driver.switchTo().alert();
	alert.accept();
	 String text = driver.findElement(By.id("demo")).getText();
	 System.out.println(text);
	 if(text.contains("OK")) {
		 
		 System.out.println(" The Alert is accepted");
	 }else 
		 System.out.println(" The alert is cancelled ");
	
}
}
