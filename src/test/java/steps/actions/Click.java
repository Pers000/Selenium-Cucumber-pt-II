package steps.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PageContext;
import cucumber.api.java.en.And;

public class Click {
	PageContext context;

	public Click(PageContext context) {
		this.context = context;
	}

	// span[text()='Text Box']
	@And("I click the tile {string}")
	public void iClickTheTile(String tileName) {
		String tile = "";
		switch (tileName) {
		case "Elements":
			tile = "1";
			break;
		case "Forms":
			tile = "2";
			break;
		case "Alerts, Fram and Windows":
			tile = "3";
			break;
		case "Widgets":
			tile = "4";
			break;
		case "Interacations":
			tile = "5";
			break;
		case "Book Store Application":
			tile = "6";
			break;

		}
		context.getDriver().findElement(By.xpath("(//div[@class='card-up'])[" + tile + "]")).click();
		// return new Click(context);
	}

	@And("I click {string}")
	public void i_click(String text) {
		context.getDriver().findElement(By.xpath("//span[text()='" + text + "']")).click();

	}

	@And("I click the button {string}")
	public void i_click_the_button(String text) {
		WebElement element = null;
		if (context.getDriver().findElements(By.id(text)).size() == 1) {
			// Element can be located by ID
			element = context.getDriver().findElement(By.id(text));
			System.out.println("Button " +text+ " has an Id.");
		} else if (context.getDriver().findElements(By.name(text)).size() == 1) {
			// Element can be located by ID
			element = context.getDriver().findElement(By.name(text));
			System.out.println("Button " +text+ " has a Name.");
		} else if (context.getDriver().findElements(By.cssSelector("button[title='"+text+"']")).size() == 1) {

			context.getDriver().findElement(By.cssSelector("button[title='"+text+"']")).click();
			System.out.println("Button " +text+ " has a CSS.");
		}else if (context.getDriver().findElements(By.xpath("//button[text()='" + text + "']")).size() == 1) {

			context.getDriver().findElement(By.xpath("//button[text()='" + text + "']")).click();
			System.out.println("Button " +text+ " has an Xpath.");
		} else {
			System.out.println("Element " + text + " not found.");
		}

	}
}
