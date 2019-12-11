package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format={"pretty","html:report/html","json:report/json/cucmberreport.json"},
		tags={"@Reg"},
		features="src/main/java/Feauture",
		glue={"Java"}
		)
//why AbstractTestNGCucumberTests cucumber cannot run on its own so we are using AbstractTestNGCucumberTests or Junit
public class Run1 extends AbstractTestNGCucumberTests
{
   
}
