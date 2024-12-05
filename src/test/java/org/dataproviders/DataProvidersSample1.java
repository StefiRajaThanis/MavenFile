package org.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersSample1 {
	
	@DataProvider(name="LoginDatas")
	private Object [][] getDatas(){
		return new Object[][] {
			{"Stefi@gmail.com", "stefi@123"},
			{"stef@gmail.com", "stef@123"},
			{"stefuiii@gmail.com", "ste@123"},
		};
		}
	
	}


