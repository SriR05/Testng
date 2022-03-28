package com.Maven.TestNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Annotations_Practice {
	public static WebDriver driver;
	@BeforeSuite
	private void setPath()
		{
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
	}
	@BeforeTest
	private void getDriver()
	{
		 driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	@BeforeClass
	private void getLink ()
	{
		driver.get("https://www.demoblaze.com");
	}
	@BeforeMethod
	private void getLogin() throws Throwable
	{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("SriR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("090909");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	private void elementsRun() throws Throwable
	{
		WebElement down = driver.findElement(By.id("next2"));

		Thread.sleep(2000);

		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].scrollIntoView();",down);
			Thread.sleep(2000);
	
	}
	
@AfterClass
private void logOut() 
{
	driver.findElement(By.id("logout2")).click();
}
@AfterTest
private void codeOver() {
driver.quit();	
}
@AfterSuite
private void cookie() {
	driver.manage().deleteAllCookies();
}
}