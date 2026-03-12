package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass {
	
	@And("Click Click on the Create Lead")
	public CreateLeadPage clickCreateLeadLink() {
		get().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}

}
