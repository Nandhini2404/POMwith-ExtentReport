package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	
	@Then("It should be navigate to home page")
	public void successfulLogin() {
		System.out.println("It navigates to Home Page");

	}
	@But("It throws error message")
	public void unSucessfulLogin() {
		System.out.println("It throws error message");

	}
	
	@When("Click on the crmsfa link")
	public MyHomePage clickCrmsfaLink() {
		get().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();   //abcd
}

}
