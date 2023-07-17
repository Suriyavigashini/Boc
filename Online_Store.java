package com.boc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Online_Store {

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
		
		// Online store - Dashboard
		
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[4]/a")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		// Online store - Shop
		
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[4]/a")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-product-list/div/div/div[1]/div/div[1]/div[1]/ng-select/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-product-list/div/div/div[1]/div/div[1]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-product-list/div/div/div[1]/div/div[5]/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-product-list/div/div/div[2]/div[1]/div/div[1]/div[2]/div[3]/div/div/div[2]/p[1]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/header/app-navbar/div/div/div/ul/li[4]/a")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		
		
		/*
		 * //select custom/balnket PO WebElement ele =
		 * driver.findElement(By.id("po_name")); Thread.sleep(2000);
		 * ele.sendKeys("cus"); Thread.sleep(1000); ele.submit(); Thread.sleep(5000);
		 * 
		 * 
		 * // For custom Po
		 * 
		 * 
		 * Thread.sleep(2000); WebElement ele1 = driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-cart/div/div/div/div/div/div[2]/div/div[2]/ul/li[6]/div/input"
		 * )); Thread.sleep(1000); ele1.click(); Thread.sleep(2000);
		 * ele1.sendKeys("726252"); Thread.sleep(2000);
		 */
		 
		
		// For blsnket PO
		
		/*
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-cart/div/div/div/div/div/div[2]/div/div[2]/ul/li[6]/div/select"
		 * )).click(); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-cart/div/div/div/div/div/div[2]/div/div[2]/ul/li[6]/div/select/option[5]"
		 * )).submit();
		 */
		 
		/*
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html/body/app-minton/app-layout/div/app-cart/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/a"
		 * )).click(); Thread.sleep(2000);
		 */
		
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("MRO List")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("MRO10355")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Convert-SO\"]/div[3]/table/tbody/tr/td[4]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship-receive/div[2]/form/div[1]/div/div[2]/div[1]/div/div/input")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship-receive/div[2]/form/div[1]/div/div[1]/div[4]/div[1]/div/select")).sendKeys("UPS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship-receive/div[2]/form/div[1]/div/div[1]/div[4]/div[1]/div/select")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-edit-mro/div/form/div[2]/div/div/div[2]/div/div[4]/div[3]/table/tbody/tr/td[5]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship/div[2]/form/div[1]/div[2]/div/div/input")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship/div[2]/form/div[1]/div[3]/div[3]/div/select")).sendKeys("UPS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-ship/div[2]/form/div[2]/button[2]")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/app-minton/app-layout/div/app-edit-mro/div/form/div[2]/div/div/div[2]/div/div[4]/div[3]/table/tbody/tr/td[6]/div/div/div/button[2]")).click();
		 Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/modal-container/div/div/app-mro-receive/div[2]/form/div[2]/button[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div/div/div[3]/button[1]")).click();
          
         
	}

}
