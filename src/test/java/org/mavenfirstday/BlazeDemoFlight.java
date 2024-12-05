package org.mavenfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoFlight {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		WebElement departureCity = driver.findElement(By.xpath("(//select[@class='form-inline'])[1]"));
		Select s = new Select(departureCity);
		s.selectByIndex(0);
		WebElement destinationCity = driver.findElement(By.xpath("(//select[@class='form-inline'])[2]"));
		Select s1 = new Select(destinationCity);
		s.selectByIndex(2);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("Sarvesh");
		driver.findElement(By.id("address")).sendKeys("167 main road");
		driver.findElement(By.id("city")).sendKeys("Paris");
		driver.findElement(By.id("state")).sendKeys("France");
		driver.findElement(By.id("zipCode")).sendKeys("567656");
		WebElement cardtype = driver.findElement(By.id("cardType"));
		Select s2 = new Select(cardtype);
		s2.selectByIndex(0);
		driver.findElement(By.id("creditCardNumber")).sendKeys("762145778544447");
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("Sarvesh S");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}