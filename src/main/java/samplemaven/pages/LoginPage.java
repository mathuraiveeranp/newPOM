package samplemaven.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import samplemaven.wrapper.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest extentTest) {
		this.driver = driver;
		this.test = extentTest;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement eleUname;
	public LoginPage enterUsername(String value) {
		enter(eleUname, value);
		return this;
		
	}
	
	
	@FindBy(how=How.ID,using="password")
	WebElement elePwd;
	public LoginPage enterPwd(String value) {
		enter(elePwd, value);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement eleSubmit;
	public HomePage clickSubmit() {
		clickElement(eleSubmit);
		return new HomePage(driver, test);
		
	}

}
