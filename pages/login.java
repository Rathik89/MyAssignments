package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class login extends BaseClass{
	
	public login enterUname() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		/*
		 * login lp=new login(); return lp;
		 */
		return this;
		
		
	}
	public login enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		
	}

}
