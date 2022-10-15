package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	public void homePage() {
		System.out.println("home page");
	}
	
	public void dashboard() {
		System.out.println("this is also like dashboard");
	}
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
}
