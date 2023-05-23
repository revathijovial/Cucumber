package com.aphotel.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\aphotel\\feature\\hotel.feature" , glue = "com.aphotel.stepdefinition")
public class hotel_runner {

}
