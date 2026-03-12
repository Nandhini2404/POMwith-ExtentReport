package learnreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) {
		//Step1: Create the path for the report
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/leaftaps.html");
		
		//Step2: Create the report
		ExtentReports extent=new ExtentReports();
		
		//Step3:Attach the test to the report 
		extent.attachReporter(reporter);
		
		//Step4:Create the actual testcases
		  ExtentTest test = extent.createTest("Login", "Login with Valid credentials");
		  
		  //Step5:Add the step level status
		  test.pass("Username entered succesfully");
		  test.pass("Password entered successfully");
		  test.pass("Login button clicked successfully");
		  
		  //Close the report
		  extent.flush();
		  
		  
		  //adding syso for verfication
		  System.out.println("Code executed");
		  
		  
		  
	}

}
