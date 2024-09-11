package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//Run with JUNIT
@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},
                 monochrome=true, glue= {"stepDefinition"},
                 //tags= {"@supplier"},
                 plugin={"pretty","html:target/cucumber-reports"})

public class Runner{

}
/*Run with TestNG
@CucumberOptions(features= {"FeatureFiles"},
                monochrome=true, glue= {"stepDefinition"},
                tags= {"@supplier"},
                 plugin={"pretty","html:target/cucumber-reports"})

public class Runner extends AbstractTestNGCucumberTests{

}*/
