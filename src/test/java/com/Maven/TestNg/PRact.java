package com.Maven.TestNg;


import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PRact {
	public static WebDriver driver;
	@Test
	private void fB() {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("srilakshmi90@ymail.com");
		driver.findElement(By.id("pass")).sendKeys("050505");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test
	private void zZ() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@id='search-input']//input")).click();
		driver.findElement(By.xpath("//div[@id='search-input']//input")).sendKeys("doctor strange 2 trailer",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon-button[@id='guide-button'][1]")).click();
		WebElement down = driver.findElement(By.linkText("Test new features"));
		JavascriptExecutor scrollD = (JavascriptExecutor) driver; 
		scrollD.executeScript("arguments[0].scrollIntoView();",down);	
		down.sendKeys(Keys.ENTER);
	}
	@Test
	private void xone2() {
		System.setProperty("webdriver.chrome.driver","/Users/srilakshmi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.close();
		driver.quit();
	}

	
}
