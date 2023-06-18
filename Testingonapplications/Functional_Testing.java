package com.Testingonapplications;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Functional_Testing {
	static ChromeDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Functional_Testing Ft=new Functional_Testing();
		Ft.launchbrowser();
		Ft.login();
		Ft.task();
		Ft.Alertok(driver);
		Ft.Screenshot(driver,"./screenshot1/Finaloutputpage1.png");
		Ft.scrooling();
		Ft.scrooling1();
		Ft.scrooling2();
		Ft.scrooling3();
		Ft.scrooling4();
		Ft.scrooling5();
		Ft.scrooling6();
		Ft.scrooling7();
		Ft.scrooling8();
		Ft.closeBrowser();	
	}
	public  void launchbrowser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public  void login() {
        driver.get("https://demo.dealsdray.com/");
        driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com",Keys.TAB,"prexo.mis@dealsdray.com",Keys.ENTER);
	}
	public void task() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
        driver.findElement(By.xpath("//span[text()='Orders']")).click();
        driver.findElement(By.className("MuiButton-sizeMedium")).click();
        driver.findElement(By.className("MuiInputBase-input")).sendKeys("C:\\Users\\bhara\\Downloads\\demo-data.xlsx");
        driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root')]//following-sibling::button")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(2000);
	}
        public void Alertok(WebDriver driver)
    	{
    		Alert alt=driver.switchTo().alert();
    		alt.accept();
    	}
	public void Screenshot(WebDriver driver,String filename) throws IOException, InterruptedException
	{
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage1.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='order_status'])[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage2.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling1() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='order_status'])[8]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage3.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling2() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='gep_order'])[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage4.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling3() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='tracking_id'])[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage5.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling4() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='gc_redeem_time'])[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage6.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling5() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='customer_declaration_physical_defect_type'])[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage7.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling6() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='gep_order'])[8]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage8.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling7() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='order_id_replaced'])[8]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage9.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void scrooling8() throws IOException, InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("(//input[@name='revised_partner_price'])[8]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot1/Finaloutputpage10.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	
        public void closeBrowser()
    	{
    		driver.close();
    	}
}