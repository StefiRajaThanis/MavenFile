package org.mavenfirstday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\Datadrivensampleexcel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		//To get the sheet from workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//To get row from sheet
		Row row = sheet.getRow(2);
		//To get cell from row
		Cell cell = row.getCell(0);
		//To get the values from the cell
		String StringCellValue = cell.getStringCellValue();
		System.out.println(StringCellValue);
	}

}
