package org.testsuiteexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinSuiteExampleEdge {
	static WebDriver driver;
	@BeforeClass
	public static void BrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser successfully launched");

}
	@Before
	public void UrlLaunch() {
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Url launched successfully");
	}
	@Test
	public void UserName() {
		driver.findElement(By.id("username")).sendKeys("ArulSarvesh");
		driver.findElement(By.id("password")).sendKeys("3I00U5");
		driver.findElement(By.id("login")).click();
		System.out.println("login successful");
	}
	@After
	public void HotelDetails() {
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByIndex(1);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(0);
		WebElement roomnos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(4);
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		checkindate.clear();
		checkindate.sendKeys("25/11/2022");
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.clear();
		checkoutdate.sendKeys("28/11/2022");
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(3);
		WebElement childroom = driver.findElement(By.name("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(1);
		WebElement searchhotels = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
		searchhotels.click();
		System.out.println("Search hotels completed");
	}
	@AfterClass
	public static void BookingConfirmation() throws InterruptedException {
		WebElement booking = driver.findElement(By.id("radiobutton_1"));
		booking.click();
		WebElement continuebutton = driver.findElement(By.name("continue"));
		continuebutton.click();
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("stef");
		driver.findElement(By.name("last_name")).sendKeys("sarvesh");
		driver.findElement(By.name("address")).sendKeys("No:1, Tondiarpet, Chennai");
		driver.findElement(By.name("cc_num")).sendKeys("9876538976543219");
		WebElement cardType = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cardType);
		s6.selectByValue("VISA");
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByVisibleText("December");
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(expyear);
		s8.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("123");
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(5000);
		System.out.println("Booking confirmed");
		WebElement orderId = driver.findElement(By.name("order_no"));
		String text2 = orderId.getAttribute("value");
		System.out.println("Booking order Id: "+text2);
		
	}
}