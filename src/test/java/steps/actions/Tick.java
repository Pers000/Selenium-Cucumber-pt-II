package steps.actions;

import org.openqa.selenium.By;

import base.PageContext;
import cucumber.api.java.en.And;

public class Tick {
	PageContext context;

	public Tick(PageContext context) {
		this.context = context;
	}
	
	@And("I tick {string} check box")
	public void iTickCheckBox(String checkbox) {
		context.getDriver().findElement(By.xpath("(//input[@id='tree-node-" + checkbox + "']/following-sibling::span)[3]")).click();
	}
	
}

		//input[@id='tree-node-home']/following-sibling::span[1]