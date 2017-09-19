package com.hp.TestProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct {

	public WebDriver driver;
	
	@Test
	public void launchBrowser() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", ClassLoader.getSystemResource("IEDriverServer.exe").getFile());
		//driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/** Login to PFP */
		driver.get("http://partner-itg.hp.com/");
		driver.findElement(By.id("USER")).sendKeys("janardhan.v@hp.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("!!janu98");
		driver.findElement(By.id("sign-in-btn")).click();
		Thread.sleep(2000);
		System.out.println("Current URL is "+driver.getCurrentUrl());
		//driver.findElement(By.xpath(".//*[@id='dock-content']/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		driver.quit();
	}
}
