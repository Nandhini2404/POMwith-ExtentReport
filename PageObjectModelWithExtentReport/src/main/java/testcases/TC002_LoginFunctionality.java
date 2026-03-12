package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_LoginFunctionality extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename="Login";
		testcaseName="Login";
		testcaseDescription="Login with Valid and InValid credentials";
		testcaseAuthor="Harrish";
		testcaseCategory="Smoke";

	}
	@Test(dataProvider = "fetchData")
	public void loginFunctionality(String username, String password) throws IOException {
		LoginPage lp=new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();

	}

}
