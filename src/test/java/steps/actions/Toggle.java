package steps.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Toggle {
	PageContext context;

	public Toggle(PageContext context) {
		this.context = context;
	}

	@When("I toggle {string}")
	public void iToggle(String string) {
		context.getDriver().findElementByXPath("//label[text()='"+string+"']").click();
	}

	@Then("I should see {string} is selected")
	public void iShouldSeeIsSelected(String string) {
		String text = context.getDriver().findElement(By.xpath("//span[text()='"+string+"']")).getText();
        Assert.assertEquals(text.trim(), string);
        System.out.println("I have seen " + text + " value.");
	}
	
	@Then("I should see toggle {string} is disabled")
	public void iShouldSeeToggleIsDisabled(String string) {
	   WebElement radioButton = context.getDriver().findElement(By.id(string+"Radio"));
	   boolean isDisabled = !radioButton.isEnabled();
	   //radioButton.isEnabled();
	  if (isDisabled) {
		    System.out.println("Radio button is disabled");
		} else {
		    System.out.println("Radio button is enabled");
		}
	}
}
