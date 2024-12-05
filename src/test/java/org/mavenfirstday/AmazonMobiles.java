package org.mavenfirstday;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonMobiles {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14 pro",Keys.ENTER);
		List<WebElement> mobilenames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(int i = 0; i<mobilenames.size(); i++) {
			System.out.println(mobilenames.get(i).getText() + "\n" + pricelist.get(i).getText());
		
		}
		
		}
	}
	
	

