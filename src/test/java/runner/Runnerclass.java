package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions	(
		
		
		features	= "src/test/resources/Features/ContactUs.feature" ,
		glue		= {"step_defination"} ,
		plugin 		= {"pretty","html:target/Cucumber-Reports/new-report.html"},
		monochrome 	= true,
		
		tags 		= "@recheck" ,
		
		dryRun 		= false
		
		
		)



public class Runnerclass {

}
