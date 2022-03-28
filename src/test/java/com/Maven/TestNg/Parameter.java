package com.Maven.TestNg;

import java.io.File;  
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test (priority = 1)
	
	private void demoBlaze(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		Thread.sleep(2000);
		driver.quit();
	
	}
	@Test
private void gmail() throws IOException {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/gmail/");
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath("//div[contains(text(),'or ph' )]")).sendKeys("papzzz.zzz@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Sri@0590");
	WebElement email = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		email.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("/Users/srilakshmi/eclipse-workspace/TestNg/Screenshot/gmail.png");
		FileUtils.copyFile(srFile, desFile);
	
		
}
	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		

	}

}
