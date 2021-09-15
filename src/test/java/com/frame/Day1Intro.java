package com.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day1Intro {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Online9AMSepFramework\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		System.out.println("a");
		driver.close();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
}
