package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src//test//resources//features//Shopping_Website_Functionalities"},
	//glue = {"src//test//java//testCases//Hooks.java","src//test//java//testCases//Sort_and_List_Item_Verification.java", "src//test//java//testCases//User_Login_Verification.java" },
	glue = "testCases",
	monochrome = true,
	dryRun = false,
	plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json"})

public class Runner {

}
