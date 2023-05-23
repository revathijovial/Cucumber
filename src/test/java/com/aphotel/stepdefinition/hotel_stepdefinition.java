package com.aphotel.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.loginpage;


public class hotel_stepdefinition extends baseclass{

	//loginpage l = new loginpage(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	   browser("chrome");
	   url("https://adactinhotelapp.com/");
	  
	}

	 
    @When("^user Enter The Username In UsernameFileld$")
	public void user_Enter_The_Username_In_UsernameFileld() throws Throwable {
    	
    	loginpage l = new loginpage(driver);
    	
    	input (l.getData10(),"Revathijovi");
	}

	
    @When("^user Enter The Password In PasswordFileld$")
	public void user_Enter_The_Password_In_PasswordFileld() throws Throwable {
    	loginpage l = new loginpage(driver);
    	
    	input(l.getData11(), "Revathi@27");
	}

	@Then("^user Click The Button$")
	public void user_Click_The_Button() throws Throwable {
		
		loginpage l = new loginpage(driver);
		
		button(l.getData12());
	}


}
