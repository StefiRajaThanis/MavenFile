package org.datadrivensarath;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Execution extends Task1ReadWriteBaseClassAdactin {
	public static void main(String[] args) throws IOException {
	Execution e = new Execution();
	e.browserLaunch("https://adactinhotelapp.com/");
	WebElement txtUsername = e.locateElement("id", "username");
	WebElement txtPassword = e.locateElement("id", "password");
	String readDataFromExcel = e.readDataFromExcel(0, 0);
	e.enterText(txtUsername, readDataFromExcel);
	String readDataFromExcel1 = e.readDataFromExcel(0, 1);
	e.enterText(txtPassword, readDataFromExcel1);
	WebElement loginButton = e.locateElement("id", "login");
	loginButton.click();
	}
}
