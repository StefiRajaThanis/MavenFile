package org.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterAdactin {
	static WebDriver driver;
	@Test
	private void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser successfully launched");
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Url launched successfully");
	}
	@Parameters({"user", "pass"})
	@Test
	private void EnterUserName(String username, String password) {
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		System.out.println(username);
		System.out.println(password);
		System.out.println("Userid successfull");
	}
	@Parameters({"location", "Hotell", "roomtypes", "roomno"})
	@Test
	private void HotelDetails(String location, @Optional("Hotel SunShine") String hotell, String roomtypes, String roomno) {
		System.out.println(location);
		System.out.println(hotell);
		System.out.println(roomtypes);
		System.out.println(roomno);
	}
	@Parameters({"checkindate", "checkoutdate", "adultroom", "childroom"})
	@Test
	private void RoomDetails(String checkindate, String checkoutdate, int adultroom, int childroom) {
	
		System.out.println(checkindate);
		System.out.println(checkoutdate);
		System.out.println(adultroom);
		System.out.println(childroom);
	}


}
