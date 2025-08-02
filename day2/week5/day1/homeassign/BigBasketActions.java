package week5.homeassign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        //  Click on "Shop by Category"
        WebElement shopByCategory = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']"));
        shopByCategory.click();
        Thread.sleep(2000);
        
     // Hover over "Foodgrains, Oil & Masala"
        WebElement foodgrains = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
        Actions act =new Actions(driver);
        act.moveToElement(foodgrains).perform();
        Thread.sleep(2000);
        
        //Hover over 
         WebElement riceprod = driver.findElement(By.linkText("Rice & Rice Products"));
         act.moveToElement(riceprod).perform();
         Thread.sleep(2000);
         
         
      // Click on "Boiled & Steam Rice"
         WebElement boiledRice = driver.findElement(By.linkText("Boiled & Steam Rice"));
         act.moveToElement(boiledRice).click().perform();
         Thread.sleep(3000);

         WebElement bbroyal = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
         act.moveToElement(bbroyal).click().perform();
         Thread.sleep(3000);
        
      // Click on "Tamil Ponni Boiled Rice"
         WebElement riceLink = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));
         act.moveToElement(riceLink).click().perform();
         Thread.sleep(3000);

      // Switch to new window
       
         Set<String> windowHandles1 = driver.getWindowHandles();
         List<String> listwindow1=new ArrayList<String>(windowHandles1);
         driver.switchTo().window(listwindow1.get(1));
         Thread.sleep(4000);
         
         //Select the 5 Kg bag
         WebElement fiveKgOption = driver.findElement(By.xpath("//span[contains(text(),'5 kg')])[2]"));
         act.moveToElement(fiveKgOption).click().perform();
         Thread.sleep(2000);
       
      // Note the price
         WebElement priceElement = driver.findElement(By.xpath("//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel4-sc-l9rhbt-4 gJxZPQ cWTZQL'][5]"));
         String price = priceElement.getText();
         System.out.println("Price for 5Kg: " + price);
         
         // 11. Click "Add" to cart
         WebElement addButton = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
         act.moveToElement(addButton).click().perform();
         Thread.sleep(3000);
         
         Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();
         System.out.println("Alert Message: " + alertText);
         
         if (alertText.toLowerCase().contains("success")) {
             System.out.println("Item successfully added to cart!");
         } else {
             System.out.println("Alert found but message not matching expected.");
         }

         alert.accept();
         
         
         }
	}


