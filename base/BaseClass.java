package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public static ChromeDriver driver;
	@BeforeMethod
	public void preCondn() {
		 driver=new ChromeDriver();
		 System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postCondn() {
		driver.quit();
		
	}

}
