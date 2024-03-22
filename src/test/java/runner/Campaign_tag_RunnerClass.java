package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features= {"src\\test\\resources\\application\\Campaign_tags.feature"},
		glue= {"loginstep","hooks"},
		plugin= {"pretty"}
//		tags="@Regression"
)
public class Campaign_tag_RunnerClass extends AbstractTestNGCucumberTests
{
	

}