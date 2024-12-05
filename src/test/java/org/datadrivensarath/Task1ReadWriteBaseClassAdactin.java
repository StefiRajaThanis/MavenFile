package org.datadrivensarath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1ReadWriteBaseClassAdactin {
	//Instance variable;
	public static WebDriver driver;
	
	public static void browserLaunch(String Url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
	}
	public WebElement locateElement(String locatortype, String value) {
		if(locatortype.equals("id")) {
			WebElement findElement = driver.findElement(By.id(value));
			return findElement;
		}
		else if (locatortype.equals("name")) {
			WebElement findElement = driver.findElement(By.name(value));
			return findElement;
		}else {
			WebElement findElement = driver.findElement(By.xpath(value));
			return findElement;
		}
	}
	public static void enterText(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public static String getTheTitleFromWebPage() {
		String title = driver.getTitle();
		return title;
	}
	public static String takeTheUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	//To read the data from the excel
	public static String readDataFromExcel(int rownum, int cellnum) throws IOException {
		File f = new File("E:\\ReadandWriteTask.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		
		
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
			
		default:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				//Change the Date format
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
				String format = s.format(dateCellValue);
				return format;
			} else {
				double numericCellValue = cell.getNumericCellValue();
				//Type conversion
				//Double - Long
				//Long   - String
				long l = (long) numericCellValue;
				String valueOf = String.valueOf(l);
				return valueOf;
			}
		}
	
	
	}
	




		//To write the data from excel
		public static void writeDatainExcel (int rownum1, int column, String value) throws IOException {
			File f1 = new File("E:\\Book1.xlsx");
			FileOutputStream fo = new FileOutputStream(f1);
			Workbook w1 = new XSSFWorkbook();
			Sheet createSheet = w1.createSheet("write");
			Row createRow = createSheet.createRow(rownum1);
			Cell createCell = createRow.createCell(column);
			w1.write(fo);
	
		}
			
			
			
			
			
			
			
			
			
			
		}
	

