package com.b15demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features={"src/test/resources/com/b15demo/cucumberPath1.feature","src/test/resources/com/b15demo/cucumberPath2.feature","src/test/resources/com/b15demo/cucumberPath3.feature"},
		
		glue={"com/b15demo/"}
		
		)






public class RunRunOneFolderStepDefinationStepDefinationTest{

}
