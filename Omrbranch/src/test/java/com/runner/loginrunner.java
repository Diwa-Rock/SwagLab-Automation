
package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@cd",dryRun=false,glue="com.stepdefinition",features="src\\test\\resources")
public class loginrunner {

}

