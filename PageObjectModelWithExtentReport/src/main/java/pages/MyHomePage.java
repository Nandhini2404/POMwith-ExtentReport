package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyHomePage extends BaseClass{
	
	@And("Click on the Leads link")
	public MyLeadsPage clickLeadsLink() {
		get().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
}

}
