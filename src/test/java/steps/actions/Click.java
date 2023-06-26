package steps.actions;

import org.openqa.selenium.By;

import base.PageContext;
import cucumber.api.java.en.And;


public class Click {
    PageContext context;
    public Click(PageContext context) {
        this.context = context;        
    }
  //span[text()='Text Box']
    @And("I click the tile {string}")
    public void iClickTheTile(String tileName) {
    	String tile = "";
    	switch(tileName) {
    	case "Elements": tile = "1";break;
    	case "Forms": tile = "2";break;
    	case "Alerts, Fram and Windows": tile = "3";break;
    	case "Widgets": tile = "4";break;
    	case "Interacations": tile = "5";break;
    	case "Book Store Application": tile = "6";break;
    	
    	}
		context.getDriver().findElement(By.xpath("(//div[@class='card-up'])["+ tile +"]"))
		.click();
	    //return new Click(context);
	}
    
    @And("I click {string}")
    public void i_click(String text) {
    	context.getDriver().findElement(By.xpath("//span[text()='"+ text +"']"))
		.click();
    }
}


