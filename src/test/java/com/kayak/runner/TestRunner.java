package com.kayak.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/merve/IdeaProjects/kayak-task/src/test/resources",
        glue="com/kayak/stepDefinition",
        tags="@wip",
        dryRun=false

)



public class TestRunner {
}
