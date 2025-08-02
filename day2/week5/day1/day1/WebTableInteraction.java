package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		//Train Names from the table
		List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader stickyTrainListHeader\"]//tbody//tr//td[2]"));
		 
		//Train Name Header
				WebElement colhead = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/th[2]"));
				String header = colhead.getText();
				System.out.println("The list of trains from MAS to MDU are: ");
				
				System.out.println("---------------------------------------");
				
				//Creating sets to validate duplicates
				Set<String> uniqueNames = new HashSet<String>();
				Set<String> duplicate = new HashSet<String>();
				
				for(WebElement trainNames : row) {
					String name = trainNames.getText();
					System.out.println(name);
				
				//Validating duplicates
					if(!uniqueNames.add(name)) {
						duplicate.add(name);
					}
				}
				
				System.out.println("----------------------------------------");
				
				if (!duplicate.isEmpty()) {
					System.out.println("There are duplicates");
					for(String dup : duplicate) {
						System.out.println(dup);
					}
				}
				else {
					System.out.println("There are no duplicates");
				
		
		}
		

	}

}
