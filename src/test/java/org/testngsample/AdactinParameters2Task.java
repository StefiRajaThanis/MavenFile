package org.testngsample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinParameters2Task {
	static WebDriver driver;
	
	@Test
	public static void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser successfully launched");
		driver.get("http://adactinhotelapp.com/index.php");
		System.out.println("Url launched successfully");
	}
	@Test
	private void userlogin() {
		driver.findElement(By.name("username")).sendKeys("stefi123", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("stefi", Keys.ENTER);
		driver.findElement(By.name("login")).click();
		WebElement text = driver.findElement(By.xpath("(//div[contains(text(),'')])[2]"));
		String text1 = text.getText();
		System.out.println(text1);
		boolean contains = text1.contains("Login");
		Assert.assertNotEquals(contains, false);
		System.out.println("Assert getting failed: "+"_"+contains);
		
		
	}
	
	
}
