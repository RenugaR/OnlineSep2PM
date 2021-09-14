package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utils.LibGlobal;

public class HomePagePojo extends LibGlobal {

	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ 
		@FindBy(xpath = "//input[@data-testid='royal_email']"),
		@FindBy(xpath = "//input[@id='email']") })
	private List<WebElement> txtUserName;

	@FindAll({ 
		@FindBy(xpath = "//input[@id='pass']"), 
		@FindBy(xpath = "//input[@data-testid='royal_pass1234']") })
	private List<WebElement> txtPass;

	@FindBy(name = "login")
	private WebElement btnLogIn;

	// Generate getters-->right click class-->select source-->
	// generate getters and setters--> Select getters and click ok

	public List<WebElement> getTxtUserName() {
		return txtUserName;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}
}
