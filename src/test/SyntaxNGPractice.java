package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SyntaxNGPractice {
	
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public void StartCode()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad Shaiq\\Documents\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	
	@Test
	public void TestNGmethod()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ahmad shaiq");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ahmad ");
	 
	}
	
	
	@AfterMethod
	public void Closing() {
		
		driver.quit();
	}

}
