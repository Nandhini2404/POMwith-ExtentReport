package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	
	
    @Given("Enter the companyname as (.*)$")
	public CreateLeadPage enterCompanyname(String companyname) {
		get().findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	    return this;
	}
    @And("Enter the firstname as (.*)$")
	public CreateLeadPage enterFirstname(String firstname) {
		get().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
    @And("Enter the Lastname as (.*)$")
	public CreateLeadPage enterLastname(String lastname) {
		get().findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
@When("Click on the CreateLead button")
	public ViewLeadsPage clickCreateLeadButton() {
		get().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

}
