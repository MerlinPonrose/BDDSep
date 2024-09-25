package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\neworkspace\\BDD_September\\src\\test\\java\\com\\bdd\\featurefile",
glue="com.bdd.stepdefinition",
plugin= {"pretty","html:target/cucmber","json:target/bdd_cucumber.json"}
)
public class TestRunner {

}
