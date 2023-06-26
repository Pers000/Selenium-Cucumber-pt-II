package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
	features = {"src/test/java/features/Elements.feature"},
	snippets = SnippetType.CAMELCASE,
	monochrome = false,
	glue = {"steps", "hooks"},
	plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	//Below is the cucumber default report
//	plugin = {"pretty", "html:CucumberReports",
//			"json:reports/results.json",
//			"junit:reports/results.json"}
)
public class ElementRunner extends AbstractTestNGCucumberTests{}