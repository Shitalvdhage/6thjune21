package com.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
public WebDriver driver=null;

	

	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	   System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}
	
	@When("user enter uname and pass")
	public void user_enter_uname_and_pass() {
	   
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
	}
	@When("click login button")
	public void click_login_button() {
		
		driver.findElement(By.xpath("//button")).click();
	    
	}
	@Then("user will be on homepage")
	public void user_will_be_on_homepage() {
	    
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}

}
