package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
    @And("Enter the username as {string}")
	public LoginPage enterUsername(String username) throws IOException {
		get().findElement(By.id("username")).sendKeys(username);
		reportStep("pass", "username entered successfully");
		return this;
	}
    @And("Enter the password as {string}")
	public LoginPage enterPassword(String password) {
		get().findElement(By.id("password")).sendKeys(password);
		return this;
	}
    @When("Click on the Login button")
	public WelcomePage clickLoginButton() {
		get().findElement(By.className("decorativeSubmit")).click();
		//WelcomePage wp=new WelcomePage();
		//return wp;
		return new WelcomePage();
	}

}
