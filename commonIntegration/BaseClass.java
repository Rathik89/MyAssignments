package commonIntegration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public String excelFileName;
	
	public RemoteWebDriver driver;
	/*
	 * @BeforeSuite public void startReports() {
	 * System.out.println("report started"); }
	 * 
	 * @BeforeTest public void setTestvalues() {
	 * System.out.println("set the values"); }
	 * 
	 * @BeforeClass public void assignTesCaseDetails() {
	 * System.out.println("testcase details are captured"); }
	 */
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return CommonIntegrationExcel.readData(excelFileName);
		
	}
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preConditions(String browser,String url,String uName,String pWord) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");
			driver=new ChromeDriver(options);
		} else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();

		}
		
	//driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pWord);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	/*
	 * @AfterSuite public void stopReports() {
	 * System.out.println("reports stopped"); }
	 */
}
