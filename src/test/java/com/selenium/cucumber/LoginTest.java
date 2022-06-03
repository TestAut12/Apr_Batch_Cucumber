package com.selenium.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver w;

	@Given("Browser should be with login page")
	public void browser_should_be_with_login_page() {

		WebDriverManager.chromedriver().setup();
		w = new ChromeDriver(); 
		w.get("http://demo.testfire.net/login.jsp");

	}

	@When("User should logs in using Username and Password and Click on Login button")
	public void user_should_logs_in_using_username_and_password_and_click_on_login_button() throws Exception {
		
		w.findElement(By.id("uid")).sendKeys("admin");		
		w.findElement(By.name("passw")).sendKeys("admin");		
		w.findElement(By.name("btnSubmit")).click();		
		Thread.sleep(2000); 		
		
	}

	@Then("Home Page should get open and verify page title and close browser")
	public void home_page_should_get_open_and_verify_page_title_and_close_browser() {
		
		String pageTitle=w.getTitle();         
		Assert.assertEquals("Altoro Mutual", pageTitle);	
		w.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();

		w.close();

	}

}
