package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver .get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saravanan");
		WebElement sourceDD= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(5);
		WebElement MarketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(MarketingDD);
		sel1.selectByVisibleText("Automobile");
		 WebElement OwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				 Select sel2 =new Select(OwnershipDD);
		 sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		 String title1 = driver.getTitle();
			System.out.println(title1);
		
	}

}
