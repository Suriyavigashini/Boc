package com.boc;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

@SuppressWarnings("unused")
public class Boc_Loginpage_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Boc_Login\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://aibondboc.com/#/account/login");
		
		
		driver.findElement(By.id("username")).sendKeys("admin_memstech");
		driver.findElement(By.id("password")).sendKeys("Oms$@ns#0xAH$");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[3]/input")).sendKeys("BOCAPI");
		driver.findElement(By.xpath("/html/body/app-minton/app-common-login/div/div/div[2]/div/div[1]/div/form/div[4]/button")).click();
		Thread.sleep(3000);
	//to take screenshot of a page
	/*
	  File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	  File dest = new File("./screenshot/screen.png"); FileHandler.copy(screenshotFile , dest);
	  driver.quit();
	 */		
		
		// to take screen shot of web element 
		
		WebElement ele = driver.findElement(By.id("username"));
		File screenFile = ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshot/screens.png");
		FileHandler.copy(screenFile , dest1);
		driver.quit();
	}
	
}
  