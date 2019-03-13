package samplemaven.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import samplemaven.wrapper.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest extentTest) {
		this.driver = driver;
		this.test = extentTest;
		PageFactory.initElements(driver, this);
	}
	
	

}
