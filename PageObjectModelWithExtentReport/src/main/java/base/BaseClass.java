package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	//public ChromeDriver driver;
	private static final ThreadLocal<ChromeDriver> driver= new ThreadLocal<ChromeDriver>();
	public static ExtentReports extent;
	public String testcaseName,testcaseDescription,testcaseAuthor,testcaseCategory;
	public static ExtentTest test;
	public void set() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		driver.set(new ChromeDriver(options));

	}
	
	public ChromeDriver get() {
		
		ChromeDriver chromeDriver = driver.get();
		return chromeDriver;
	}
	
	
	public String filename;
	@BeforeMethod
	public void preConditions() {
		
		set();
		//driver = new ChromeDriver(options);
		get().manage().window().maximize();
		get().get("http://leaftaps.com/opentaps");

	}
	
	@AfterMethod
	public void postConditions() {
	get().close();

	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(filename);

	}
	@BeforeSuite
	public void startReport() {
		        //Step1: Create the path for the report
				ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/leaftaps.html");
				
				//Step2: Create the report
				extent=new ExtentReports();
				
				//Step3:Attach the test to the report 
				extent.attachReporter(reporter);

	}
	@AfterSuite
	public void stopReport() {
		extent.flush();

	}
	@BeforeClass
	public void testcaseDetails() {
		test = extent.createTest(testcaseName, testcaseDescription);    //Login/CreateLead
		test.assignAuthor(testcaseAuthor);
		test.assignCategory(testcaseCategory);

	}
	
	public void reportStep(String status,String message) throws IOException {
		if(status.equalsIgnoreCase("pass")) {                                    //   image1234.png
			test.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image"+takeSnap()+".png").build());
		}

	}
	
	public int takeSnap() throws IOException {
		int randomNumber = (int)(Math.random()*999999+99999);
		File source = get().getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/image"+randomNumber+".png");
		FileUtils.copyFile(source, destination);
		return randomNumber;

	}
	

}
