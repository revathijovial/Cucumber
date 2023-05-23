package com.datagiven.below.stepdefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datagiven_below_stepdef {

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	  
	}

	@When("^user Enter The Username  And  password$")
	public void user_Enter_The_Username_And_password(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
	   List<String> s = data.asList(String.class);
	   String user = s.get(0);
	   String pass = s.get(1);
	   
	}

	@Then("^user Click the Login Button$")
	public void user_Click_the_Login_Button() throws Throwable {
	   
	   
	}


}
