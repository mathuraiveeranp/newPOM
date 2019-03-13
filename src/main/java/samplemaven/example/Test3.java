package samplemaven.example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./snaps/img1.png"));
		
		//FluentWait<T>
		WebDriverWait wWait  = new WebDriverWait(driver, 10);
		wWait.until(ExpectedConditions.elementToBeClickable(By.linkText("cc")));
		wWait.until(ExpectedConditions.elementToBeClickable(driver.findElementByLinkText("c")));
		String bVersion = driver.getCapabilities().getVersion();
		
		
		try {
			
		}
		finally {
			
		}
		
		/*char ch = 'A';
		int a = ch;
		char ch1 = 'a';
		int a1 = ch1;
		System.out.println(a);
		System.out.println(a1);
		String name = "mathuraiveeranp";
		char[] charArray = name.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if((i+1)%2==0) {
				int b = charArray[i]-32;
				charArray[i] = (char)b;
			}
			System.out.print(charArray[i]);
		}*/
		
		/*try {
			System.out.println("Try");
		}
		System.out.println("Test");
		catch(Exception e) {
			System.out.println("Catch");
		}*/
	
	}

}
