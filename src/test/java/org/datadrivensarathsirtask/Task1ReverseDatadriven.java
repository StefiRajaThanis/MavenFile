package org.datadrivensarathsirtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1ReverseDatadriven {
	public static void main (String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		//To read the data in the Excel
		Workbook w = new XSSFWorkbook();
		//Create a sheet
		Sheet createSheet = w.createSheet("Sheet1");
		//To locate the webtable1
		WebElement tableElement = driver.findElement(By.xpath("//table[@id='table01']"));
		
		//To find the no of rows in the table
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		
		//To iterate the list in reverse
		for (int i = rows.size()-1; i >= 0;  i--) {
			WebElement individualrow = rows.get(i);
			List<WebElement> allColumns = individualrow.findElements(By.tagName("td"));
			
			for (int j = allColumns.size()-1; j >= 0; j--) {
				
				WebElement individualColumn = allColumns.get(j);
				String text = individualColumn.getText();
				System.out.println(text+"\t");
			}
			System.out.println();
			File f = new File("E:\\Book1.xlsx");
			FileOutputStream fo = new FileOutputStream(f);
			w.write(fo);
			Sheet sheet = w.getSheet("Sheet1");
		}
		
	}

}
