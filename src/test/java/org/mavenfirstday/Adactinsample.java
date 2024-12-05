package org.mavenfirstday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinsample {
	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
		
		File file = new File("E:\\Book1.xlsx");
		FileInputStream f = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sheet1 = wb.getSheet("Adactin_Data");
		
		//To get all the rows in the sheet
		int rowCount = 8;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		//Identify the webelements for the booking hotel
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ArulSarvesh");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("3I00U5");
		WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
		login.click();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Paris");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Standard");
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(4);
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		checkindate.clear();
		checkindate.sendKeys("19/11/2022");
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.clear();
		checkoutdate.sendKeys("23/11/2022");
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(3);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(1);
		
		//iterate over all the rows in excel and put the data in form
		for (int i = 1; i <= rowCount; i++) {
			String username1 = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			String password1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
			location.sendKeys(sheet1.getRow(i).getCell(0).getStringCellValue());
			hotels.sendKeys(sheet1.getRow(i).getCell(1).getStringCellValue());
			room.sendKeys(sheet1.getRow(i).getCell(2).getStringCellValue());
			roomnos.sendKeys(sheet1.getRow(i).getCell(3).getStringCellValue());
			checkindate.sendKeys(sheet1.getRow(i).getCell(4).getStringCellValue());
			checkoutdate.sendKeys(sheet1.getRow(i).getCell(5).getStringCellValue());
			adultroom.sendKeys(sheet1.getRow(i).getCell(6).getStringCellValue());
			childroom.sendKeys(sheet1.getRow(i).getCell(7).getStringCellValue());
		}
		FileOutputStream fileOutputStream = new FileOutputStream("E:\\Book1.xlsx");
		wb.write(fileOutputStream);
		WebElement submit = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
		submit.click();
	}

}

