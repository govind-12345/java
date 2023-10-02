package com.govind.com.javatesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googletitle 
{
	public WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 this.driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Thread.sleep(5000);
		 driver.get("https://www.youtube.com");
	}
	
	@Test
	public void titletest() throws Exception
	{
		String title=driver.getTitle();
		System.out.println(title);
		 Thread.sleep(5000);
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
