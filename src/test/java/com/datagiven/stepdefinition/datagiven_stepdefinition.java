package com.datagiven.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.baseclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datagiven_stepdefinition extends baseclass {
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    browser("chrome");
	    url("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username \"([^\"]*)\" in UserFiled$")
	public void user_Enter_The_Username_in_UserFiled(String user) throws Throwable {
		WebElement username = driver.findElement(By.name("username"));
		input(username, user);
	}

	@When("^user Enter The Password \"([^\"]*)\" in PasswordFiled$")
	public void user_Enter_The_Password_in_PasswordFiled(String pass) throws Throwable {
		WebElement passw = driver.findElement(By.name("password"));
		input(passw, pass);
	}

	@Then("^user Click the Login Button$")
	public void user_Click_the_Login_Button() throws Throwable {
		WebElement button = driver.findElement(By.name("login"));
		   button.click();
	}
	
	
}
