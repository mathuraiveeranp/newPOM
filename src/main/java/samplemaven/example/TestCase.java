package samplemaven.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCase {
	
	public static RemoteWebDriver driver;
	/*@Test
	public void ss() {
		System.out.println("A-->"+System.getProperty("os.name"));
		System.out.println("B-->"+System.getProperty("broswer.name"));
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println("browser name: "+cap.getBrowserName().toLowerCase());
		System.out.println("browser version: "+cap.getVersion());
	}*/
	
	public static void main(String[] args) throws IOException {  
		 
	    ArrayList<String> output = new ArrayList<String>();
	    Process p = Runtime.getRuntime().exec("reg query \"HKLM\\Software\\Microsoft\\Internet Explorer\" /v Version");
	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()),8*1024);
	    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	    String s = null;
	 
	    while ((s = stdInput.readLine()) != null) {
	        output.add(s);
	    }
	 
	    String internet_explorer_value = (output.get(2));
	    String version_ie = internet_explorer_value.trim().split("   ")[2];
	 
	    // ------------------------------------
	     
	    stdInput = null;
	    stdError = null;
	    s = null;
	    p = null;
	    output.clear();
	     
	    //p = Runtime.getRuntime().exec("reg query \"HKLM\\Software\\Mozilla\\Mozilla Firefox\" /v CurrentVersion");
	    p = Runtime.getRuntime().exec("reg query \"HKCU\\Software\\Google\\Chrome\\BLBeacon\" /v version");
	    stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()),8*1024);
	    stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	 
	    while ((s = stdInput.readLine()) != null) {
	        output.add(s);
	    }
	 
	    String ff_value = (output.get(2));
	    String version_ff = ff_value.trim().split("   ")[2];
	 
	    // ------------------------------------
	 
	    System.out.println("Browser Versions:\n");
	    System.out.println("  IE: " + version_ie);
	    System.out.println("  FF: " + version_ff);
	     
	}
	
	@Test(groups= {"A"})
	public void sampleTest() {
		
		System.out.println("sampleTest");
		//Assert.assertEquals("AA", "BB");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("AA", "BB");
		System.out.println("sampleTest1");
		sa.assertAll();
		
		
	}

}
