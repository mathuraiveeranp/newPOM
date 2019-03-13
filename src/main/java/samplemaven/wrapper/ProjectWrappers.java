package samplemaven.wrapper;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import samplemaven.utils.DataReader;

public class ProjectWrappers extends GenericWrappers{

	@Parameters({"browser","url"})
	@BeforeMethod
	public void startApplication(String browser, String url) {
		startApp(browser, url);
	}
	
	//@AfterMethod
	public void closeApplication() {
		closeBrowser();
	}
	
	@DataProvider(name="fetchData", parallel=true)
	public String[][] data() throws IOException{
		return DataReader.readData(excelSheetName);
		
	}
}
