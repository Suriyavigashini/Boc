package com.boc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sales_Quotes {

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
		
		
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sales Quote List")).click();
		Thread.sleep(3000);
		
		
		
		
	         
	           
		

		
		// Send Email
		
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-list-quotes/div/div[3]/div/div/div[2]/div/div/div/table/thead/tr/th[1]/div/label/input"
		 * )).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-list-quotes/div/div[3]/div/div/div[1]/div[2]/div[2]/button/i"
		 * )).click(); Thread.sleep(3000); driver.navigate().back();
		 * 
		 */
			
				
			/*  
					 * driver.findElement(By.xpath(
					 * "/html/body/modal-container/div/div/app-email/div[2]/form/div[1]/input")).
					 * sendKeys("john@gmail.com"); Thread.sleep(2000); driver.findElement(By.xpath(
					 * "/html/body/modal-container/div/div/app-email/div[2]/form/div[2]/input")).
					 * sendKeys("abcgroup@gmail.com"); Thread.sleep(1000);
					 * driver.findElement(By.xpath(
					 * "/html/body/modal-container/div/div/app-email/div[2]/form/div[3]/input")).
					 * sendKeys("hrabc@gmail.com"); Thread.sleep(1000); driver.findElement(By.xpath(
					 * "/html/body/modal-container/div/div/app-email/div[2]/form/div[4]/input")).
					 * sendKeys("SALES QUOTES"); Thread.sleep(1000);
					 */
				
		
		
		// ADD Quotes
		
		
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-list-quotes/div/div[3]/div/div/div[1]/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/ng-select/div/div/div[2]/input"));
		ele1.click();
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[6]/span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/select")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/select")).sendKeys("New");
		 //driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/select/option[7]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[5]/table/tbody/tr/td[1]/ng-autocomplete/div/div[1]/input")).sendKeys("BOC");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[5]/table/tbody/tr/td[1]/ng-autocomplete/div[1]/div[2]/ul/li[4]/div/a")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[2]/div/div[5]/table/tbody/tr/td[8]/select")).sendKeys("6");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-sales-quotes-add/div/div/div/form/div/div[3]/div[2]/div/button[1]/i")).click();	
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
		 Thread.sleep(1000);
		 
		 driver.navigate().back();
		 
		driver.navigate().back();
	     

		
		
		
		
		
		//search Quotes
		
       WebElement ele =  driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-list-quotes/div/div[2]/div/div/div/div/div/ngb-tabset/div/div/div/div[2]/input"));
       ele.click();
       ele.sendKeys("QT139680");
       Thread.sleep(4000);
      
       driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-list-quotes/div/div[2]/div/div/div/div/div/ngb-tabset/div/div/div/div[4]/ng-select/div/div/div[2]/input")).click();
       Thread.sleep(2000);
      driver.findElement(By.id("item-1")).click();
      driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-list-quotes/div/div[2]/div/div/div/div/div/ngb-tabset/div/div/div/div[8]/select")).sendKeys("MRO");
      driver.findElement(By.id("btnFilter")).click();
      Thread.sleep(1000);
      driver.close();
      
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0, 1000)");
		 * 
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-list-quotes/div/div[3]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[13]/a[2]"
		 * )).click(); Thread.sleep(4000); driver.close();
		 */
	  
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[7]/a"))
		 * .click(); Thread.sleep(2000);
		 * driver.findElement(By.linkText("Sales Quote List")).click();
		 * Thread.sleep(3000); driver.close();
		 */
		
		
	  	  

	}

}
