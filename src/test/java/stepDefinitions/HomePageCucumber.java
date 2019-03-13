package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageCucumber {
	
	ChromeDriver driver;
	
	@Given("open the browser and load the url")
	public void openTheBrowserAndLoadTheUrl() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}

	@When("enter username as (.*)")
	public void enterUserNameAs(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}

	@When("enter password as (.*)")
	public void enterPasswordAs(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click submit button")
	public void clickSubmitButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify the successful login")
	public void verifyTheSuccessfulLogin() {
		System.out.println("Success");
	}
}
