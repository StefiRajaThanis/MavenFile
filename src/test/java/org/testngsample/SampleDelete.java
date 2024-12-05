package org.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleDelete {
	static WebDriver driver;
	@Test
	private void roomDetails(String locations, String hotels, String roomtypes) {
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		WebElement childroom = driver.findElement(By.name("child_room"));
		WebElement searchhotels = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
		System.out.println("Search hotels completed");
	}
	@Test
	private void BookingConfirmation() throws InterruptedException {
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
		
	}
	@Test
	private void OrderId() {
		WebElement orderId = driver.findElement(By.name("order_no"));
		String text2 = orderId.getAttribute("value");
		System.out.println("Booking order Id: "+text2);
	}

}
