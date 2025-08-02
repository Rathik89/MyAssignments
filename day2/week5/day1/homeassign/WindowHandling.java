package week5.homeassign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		// Handle window switch to From Contact
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> listwindow=new ArrayList<String>(windowHandles);
        driver.switchTo().window(listwindow.get(1));
        
     // Click first contact
        driver.findElement(By.linkText("DemoCustomer")).click();

        // Switch back to main window
        driver.switchTo().window(listwindow.get(0));
        
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
        
     // Handle window switch to From Contact
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> listwindow1=new ArrayList<String>(windowHandles1);
        driver.switchTo().window(listwindow1.get(1));
      
        driver.findElement(By.xpath("//a[text()='DemoPrivilegedCust']")).click();
        
        // Switch back to main window
        driver.switchTo().window(listwindow1.get(0));
        
        driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
        
      //switch the driver focus to the alert box
		Alert alert = driver.switchTo().alert();
		alert.accept();
        String title = driver.getTitle();
        System.out.println(title);
        
        
	}
}