package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver .get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Rathi");
		driver.findElement(By.name("lastname")).sendKeys("Saravanan");
		driver.findElement(By.name("reg_email__")).sendKeys("2245440220");
		driver.findElement(By.id("password_step_input")).sendKeys("Katrat@2015");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select day= new Select (dayDD);
		day.selectByVisibleText("22");
		
		
		WebElement monthMM = driver.findElement(By.id("month"));
		Select month = new Select (monthMM);
		month.selectByIndex(11);
		
		WebElement yearYY = driver.findElement(By.id("year"));
		Select year= new Select(yearYY);
		year.selectByValue("1989");
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
	}

}
