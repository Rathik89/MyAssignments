package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLEaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saravanan");
		driver.findElement(By.name("submitButton")).click();
		
	 String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		

	}

}
