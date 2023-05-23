package com.datagiven.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\datagiven_feature\\datagiven.feature" , glue = "com.datagiven.stepdefinition")
public class datagiven_runner {

	
}
