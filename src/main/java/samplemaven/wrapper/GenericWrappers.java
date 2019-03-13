package samplemaven.wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import samplemaven.utils.Reporter;

public class GenericWrappers extends Reporter{
	
	//public static RemoteWebDriver driver;
	
	public RemoteWebDriver driver;
	
	public void startApp(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Chrome Browser Launched");
			driver.get(url);
			System.out.println("URL Loaded in chrome");
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver  = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Firefox Browser Launched");
			driver.get(url);
			System.out.println("URL Loaded in firefox");
		}
	}
	
	public WebElement locateElement(String locator, String locatorValue) {
		WebElement element = null;
		if(locator.equalsIgnoreCase("id")) {
			element = driver.findElementById(locatorValue);
		}
		else if(locator.equalsIgnoreCase("class")) {
			element = driver.findElementByClassName(locatorValue);
		}
		return element;
	}
	
	public void clickElement(WebElement element) {
		element.click();
		System.out.println("Element clicked");
	}
	
	public void enter(WebElement element, String value) {
		element.clear();
		System.out.println("Cleared");
		element.sendKeys(value);
		System.out.println("Entered as: "+value);
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}
}
