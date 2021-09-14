package com.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2ExcelRead {
	public static void main(String[] args) throws IOException {
		// To get the file loc
		File loc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Online9AMSepFramework\\input\\testData.xlsx");
		FileInputStream fi = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		System.out.println(c);
		int cellType = c.getCellType();
		System.out.println(cellType);
		// cellType=1-->String ,0-->Date,Number
	}
}