package samplemaven.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest {
	
	

	@Test
	public void restExamples() {
		
		//WebDriver driver = new RemoteWebDriver();
		
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get("https://chercher.tech/sample/api/product/read");
		String rr = response.getBody().asString();
		System.out.println("rr: "+rr);
	}
}
