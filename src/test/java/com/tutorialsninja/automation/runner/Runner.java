package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Login.feature",
						   "classpath:FeatureFiles/Projects.feature",
						   "classpath:FeatureFiles/FileFormats.feature",
						   "classpath:FeatureFiles/Users.feature",
						   "classpath:FeatureFiles/UserProfile.feature"
						   },
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags={"@Login","@SearchProj"})
public class Runner {
	
}