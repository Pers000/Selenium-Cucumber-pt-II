package steps.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PageContext;
import bsh.Console;
import cucumber.api.java.en.When;

public class Fill {
	PageContext context;

	public Fill(PageContext context) {
		this.context = context;
	}

	@When("I fill {string} field with {string}")
	public void i_fill_field_with(String fieldName, String value) {
//		THIS NEEDS IMPROVEMENTS
        WebElement element = null;

        // Check the different locator types
        if (context.getDriver().findElements(By.id(fieldName)).size() == 1) {
            // Element can be located by ID
            element = context.getDriver().findElement(By.id(fieldName));
            System.out.println(context.getDriver().manage().logs());
        } else if (context.getDriver().findElements(By.name(fieldName)).size() == 1) {
            // Element can be located by Name
            element = context.getDriver().findElement(By.name(fieldName));
            System.out.println(context.getDriver().manage().logs());
        } else if (context.getDriver().findElements(By.xpath("//*[contains(@placeholder, '" + fieldName + "')]")).size() == 1) {
            // Element can be located by Placeholder
            element = context.getDriver().findElement(By.xpath("//*[contains(@placeholder, '" + fieldName + "')]"));
            System.out.println(context.getDriver().manage().logs());
        } else if (context.getDriver().findElements(By.xpath("//label[text()='" + fieldName + "']/following-sibling::input")).size() == 1) {
            // Element can be located by Label
            element = context.getDriver().findElement(By.xpath("//label[text()='" + fieldName + "']/following-sibling::input"));
            System.out.println(context.getDriver().manage().logs());
        } else {
            System.out.println(fieldName + " element not found.");
            // Handle the case when the element cannot be located
            return;
        }

        // Enter the value into the located element
        element.sendKeys(value);
	}
}