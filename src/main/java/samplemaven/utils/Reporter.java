package samplemaven.utils;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	//public static ExtentTest test;
	public ExtentTest test;
	
	public String testcaseName, testcaseDesc, author, category;
	public String excelSheetName;
	
	//String testStatus = "Pass";
	
	/*@Test
	public void reports() throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test =  extent.createTest("login", "Login to apps");
		test.assignCategory("Smoke");
		test.assignAuthor("Veera");
		
		if(testStatus.equals("pass")) {
					
			test.pass("Pass", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
			//test.pass("Pass",);
		}
		else if(testStatus.equals("fail")) {
			test.fail("Fail", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
			
		}
		extent.flush();
	}*/
	@BeforeSuite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		
		extent = new ExtentReports();
		extent.attachReporter(html);
		
	}
	
	@BeforeClass
	public void startTestcase() {
		test = extent.createTest(testcaseName, testcaseDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
		
	}
	
	public void reportStep(String testStatus, String desc) throws IOException {
		
		
		
		if(testStatus.equals("pass")) {
			
			test.pass("Pass", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
			
		}
		else if(testStatus.equals("fail")) {
			test.fail("Fail", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
			
		}
	}
	
	@AfterSuite
	public void stopResult() {
		extent.flush();
	}
}
