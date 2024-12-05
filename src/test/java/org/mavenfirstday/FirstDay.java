package org.mavenfirstday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstDay {
	public static void main(String[] args) {
		
		//To configure the browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//To maximize the windows
		driver.manage().window().maximize();
		
		//To launch the browser
		driver.get("https://www.amazon.in/");
	}

}
