package com.genericLibrary;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class BaseClass {
		public WebDriver driver;
		@BeforeClass
		public void launchBrowser()
		{
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@BeforeMethod
		public void login() throws IOException
		{
			driver.get("https://demo.dealsdray.com/");
			driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com",Keys.TAB,"prexo.mis@dealsdray.com",Keys.ENTER);
			}
		@AfterMethod
		public void logout() 
		{
			
		}
		@AfterClass
		public void closeBrowser()
		{
			driver.close();
		}
}