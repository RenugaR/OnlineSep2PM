package com.frame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.LibGlobal;

public class Day4Base extends LibGlobal {
	public static void main(String[] args) throws IOException {
		getDriver();
		getUrl("https://www.facebook.com/");
		String title = getTitle();
		System.out.println(title);

		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);

		WebElement txtUserName = driver.findElement(By.id("email"));
		insertType(txtUserName, getData(0, 0));// selenium

		WebElement txtPass = driver.findElement(By.id("pass"));
		insertType(txtPass, getData(0, 2));

		WebElement btnLogIn = driver.findElement(By.name("login"));
		click(btnLogIn);

		closeBrowser();
	}
}
