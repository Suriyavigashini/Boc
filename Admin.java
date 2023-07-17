package com.boc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Boc_Login\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://aibondboc.com/#/account/login");
		 
		
		driver.findElement(By.id("username")).sendKeys("admin_memstech");
		driver.findElement(By.id("password")).sendKeys("Oms$@ns#0xAH$");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[3]/input")).sendKeys("BOCAPI");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[4]/button")).click();
		Thread.sleep(10000);
		
		
	      
		
		// Admin -admin list 
		
		  
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[12]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Admin List")).click();
	    Thread.sleep(1000);
	    
	    // ADD user 
	    
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-admin-list/div/div[1]/div/div/div[2]/div[2]/div/a/i")).click();
	    driver.findElement(By.xpath("/html/body/modal-container/div/div/app-add-user/div[2]/form/div/div[1]/div/div[2]/div[1]/div[1]/div/select")).sendKeys("M");
	    driver.findElement(By.name("FirstName")).sendKeys("ABC");
	    driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
	    driver.findElement(By.name("RoleId")).click();
	    driver.findElement(By.name("RoleId")).sendKeys("U");
	    driver.findElement(By.name("IsRestrictedCustomerAccess")).click();
	    WebElement ele = driver.findElement(By.name("AllowLocations"));
	          ele.click();
	         
	     driver.findElement(By.xpath("/html/body/modal-container/div/div/app-add-user/div[2]/form/div/div[1]/div/div[2]/div[2]/div[7]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).click();
	      
	    driver.findElement(By.name("DefaultLocation")).click();
	    driver.findElement(By.name("DefaultLocation")).sendKeys("USA");
	    driver.findElement(By.name("PhoneNo")).sendKeys("6538923190");
	    driver.findElement(By.name("Username")).sendKeys("Abcgroup");
	    driver.findElement(By.name("Password")).sendKeys("Hanuman@05");
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("Hanuman@05");
	    driver.findElement(By.xpath("/html/body/modal-container/div/div/app-add-user/div[2]/form/div/div[5]/button[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
	    driver.findElement(By.id("Name")).sendKeys("ABC");
	    driver.findElement(By.id("Username")).sendKeys("Abcgroup");
	    driver.findElement(By.id("btnFilter")).click();
	    Thread.sleep(2000);
	    
  // change password 
	    
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-admin-list/div/div[2]/div/div/div[5]/div/div/div/button[2]/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Customer_password")).sendKeys("Hanuman@05");
	    Thread.sleep(2000);
	    driver.findElement(By.id("cendor_cpassword")).sendKeys("Hanuman@05");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/modal-container/div/div/app-user-change-password/form/div[2]/div[2]/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
	    
	    // Modify custom access rights 
	    
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-admin-list/div/div[2]/div/div/div[5]/div/div/div/button[1]/i")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/modal-container/div/div/app-access-rights/form/div[2]/div/div[2]/button[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/modal-container/div/div/app-access-rights/form/div[2]/div/div[2]/button[1]")).click();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  
	  // settings 
	  
	  driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[12]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Settings")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-admin-settings/div/div[1]/div/div/div/a[1]/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
	    
	    
	    
	  
	    
	    
	 
	}
}
	