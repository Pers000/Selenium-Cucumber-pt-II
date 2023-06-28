package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class hooks {

	private PageContext context;

	public hooks(PageContext context) {
		this.context = context;
	}

	@Before(order = 1)
	public void beforeScenario(Scenario scenario) {
		System.out.println("Let us begin testing!");
		System.out.println("Im in beforeScenario");
		RemoteWebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		context.setDriver(driver);
		context.setWait(wait);
		context.getDriver().get("https://demoqa.com/");
		Options manage = context.getDriver().manage();
		manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		manage.window().maximize();
		
		//scenario methods
		System.out.println("Name: " + scenario.getName());
		System.out.println("ID: " + scenario.getId());
		System.out.println("URI: " + scenario.getUri());
		System.out.println("Lines: " + scenario.getLines());
		System.out.println("Tags: " + scenario.getSourceTagNames());
		System.out.println("Status: " + scenario.getStatus());

	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Testing complete!");
		if (scenario.isFailed()) {
			byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}

		context.getDriver().quit();
	}

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		// Incase you want to take screenshots every steps add this
		byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "image/png");
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		// Incase you want to take screenshots every steps add this
	}
}
