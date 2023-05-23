package com.example.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\example\\feature\\example.feature" , glue = "com.example.stepdefinition")
public class example_runner {

}
