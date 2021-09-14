package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Online9AMSepFramework\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static String getData(int row, int cell) throws IOException {
		// To get the file loc
		File loc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Online9AMSepFramework\\input\\testData.xlsx");
		FileInputStream fi = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value = null;
		// cellType=1-->String ,0-->Date,Number
		System.out.println(cellType);
		if (cellType == 1) {
			value = c.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm//DD//YYYY");
				value = sim.format(dateCellValue);
				System.out.println(value);
			} else {
				double numericCellValue = c.getNumericCellValue();
				// Typecasting
				long l = (long) numericCellValue;
				// String
				value = String.valueOf(l);
				System.out.println(value);
			}
		}
		return value;

	}

}
