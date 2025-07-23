package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("MAS",Keys.TAB);
		WebElement tostation= driver.findElement(By.id("txtStationTo"));
		tostation.clear();
		tostation.sendKeys("MDU",Keys.TAB);
		WebElement checkbox=driver.findElement(By.id("chkSelectDateOnly"));
		if(checkbox.isSelected()) {
			checkbox.click();
		}
				
		List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader stickyTrainListHeader\"]//tbody//tr//td[2]"));
		 
		
		for (int i = 2; i < row.size(); i++) {
			
			WebElement trainname =driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]"));
		
			System.out.println(trainname.getText());
		}
		

	}

}
