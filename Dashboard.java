package com.boc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Boc_Login\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://memsdevops.com/#/account/login?returnUrl=%2F");
		
		
		driver.findElement(By.id("username")).sendKeys("admin_memstech");
		driver.findElement(By.id("password")).sendKeys("Oms$@ns#0xAH$");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[3]/input")).sendKeys("BOC");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[4]/button")).click();
		Thread.sleep(10000);
		// Dashboard
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-ah-new-dashboard/div/h4/div/div[2]/ng-select/div/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-ah-new-dashboard/div/h4/div/div[3]/ng-select/div/div/div[2]/input")).click();
	    driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-ah-new-dashboard/div/h4/div/div[3]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).click();
		
	    // To Scroll down 
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0, 300)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0, 700)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0, 1000)");
	    
	     
		  driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[4]/a")).click(); 
		  driver.findElement(By.linkText("dashboard")).click();
		  driver.quit();
		 
		
		
		
		
	
	}

}
