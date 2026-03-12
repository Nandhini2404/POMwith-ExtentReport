package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadsPage extends BaseClass {
	
	@Then("Lead should be craeted")
	public void verifyLead() {
		System.out.println("Lead is created");
		
}

}
