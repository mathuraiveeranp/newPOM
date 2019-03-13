package samplemaven.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import samplemaven.pages.LoginPage;
import samplemaven.wrapper.ProjectWrappers;

public class TC001_Login extends ProjectWrappers{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001";
		testcaseDesc = "Login";
		author = "Veera";
		category = "Smoke";
		excelSheetName = "Sheet1";
				
	}
	
	@Test(dataProvider="fetchData")
	public void login(String uName, String pwd, String mobile) {
		
		new LoginPage(driver, test)
		.enterUsername(uName)
		.enterPwd(pwd)
		.clickSubmit();
	}
}
