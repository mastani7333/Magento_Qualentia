package com.TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="D:\\mastaniworkspace\\Magento_Qualintia\\src\\test\\java\\com\\Feature\\Magento_Signin.feature",
		glue="com.StepDefinition",
		plugin= {"pretty",
				"html:Reports/reports.html",
				"json:Reports/reports.json",
				"rerun:target/rerun.txt",
		}
		)
public class TestRunner_Signin {

}
