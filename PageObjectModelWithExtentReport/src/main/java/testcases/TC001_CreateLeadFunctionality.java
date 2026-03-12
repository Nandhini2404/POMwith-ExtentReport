package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLeadFunctionality extends BaseClass {
	@BeforeTest
	public void setValues() {
		filename="CreateLead";
		testcaseName="CreadLead";
		testcaseDescription="CreateLead with multiple data";
		testcaseAuthor="Vineeth";
		testcaseCategory="Regression";

	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String username, String password, String companyname, String firstname, String lastname) throws IOException {
		LoginPage lp=new LoginPage();   //abcd
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyname(companyname)
		.enterFirstname(firstname)
		.enterLastname(lastname)
		.clickCreateLeadButton()
		.verifyLead();
		
		

	}

}
