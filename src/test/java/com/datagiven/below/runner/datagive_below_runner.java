package com.datagiven.below.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\datagiven\\below\\feature\\databelow.feature" , glue = "com.datagiven.below.stepdefinition")
public class datagive_below_runner {

}
