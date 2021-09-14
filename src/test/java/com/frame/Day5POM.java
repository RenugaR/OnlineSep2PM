package com.frame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pojo.HomePagePojo;
import com.utils.LibGlobal;

public class Day5POM extends LibGlobal {
	public static void main(String[] args) throws IOException {
		getDriver();
		getUrl("https://www.facebook.com/");
		String title = getTitle();
		System.out.println(title);

		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);

		insertType(new HomePagePojo().getTxtUserName().get(0), getData(0, 0));// selenium

		insertType(new HomePagePojo().getTxtPass().get(0), getData(0, 2));

		click(new HomePagePojo().getBtnLogIn());

		closeBrowser();
	}
}
