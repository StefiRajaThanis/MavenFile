package org.mavenfirstday;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWriteExcel {
	public static void main(String[] args) throws IOException {
		//To configure the browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				//To maximize the windows
				driver.manage().window().maximize();
				
				Workbook book = new XSSFWorkbook();
				//To create new row from the rows
				Sheet createSheet = book.createSheet("JavaRead");
				//To create new Row from the rows
				Row createRow = createSheet.createRow(0);
				//To create new cell from the rows
				Cell createCell = createRow.createCell(0);
				//To get some values to the created cell
				createCell.setCellValue("Username");
				Cell createCell2 = createRow.createCell(1);
				createCell2.setCellValue("Password");
				//To create new Row from the rows
				Row createRow2 = createSheet.createRow(1);
				Cell createCell3 = createRow2.createCell(0);
				createCell3.setCellValue("stefi@gmail.com");
				Cell createCell4 = createRow2.createCell(1);
				createCell4.setCellValue("stefi@123");
				//To locate the file
				File file = new File("E:\\ReadandWriteTask.xlsx");
				//To get the output from the file
				FileOutputStream outStream = new FileOutputStream(file);
				book.write(outStream);
				Sheet sheet = book.getSheet("JavaRead");
				
				for (int i = 0; i<sheet.getPhysicalNumberOfRows(); i++) {
					Row row = sheet.getRow(i);
					for(int j = 0; j<row.getPhysicalNumberOfCells(); j++) {
						Cell cell = row.getCell(j);
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}
				}
				driver.get("https://www.facebook.com/");
				Row row = sheet.getRow(1);
				Cell cell = row.getCell(0);
				String stringCellValue = cell.getStringCellValue();
				driver.findElement(By.id("email")).sendKeys(stringCellValue);
				
				Cell cell2 = row.getCell(1);
				String stringCellValue2 = cell2.getStringCellValue();
				driver.findElement(By.id("pass")).sendKeys(stringCellValue2);
				
				int lastRowNum = sheet.getLastRowNum()+1;
				System.out.println(lastRowNum);
				
				short lastCellNum = row.getLastCellNum();
				System.out.println(lastCellNum);
		

		
		
	}

}
