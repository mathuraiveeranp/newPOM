package samplemaven.testcases;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(groups= {"smoke"})
	public void test2() {
		System.out.println("Test2");
		int c = 1/0;
	}
	
	@Test(groups= {"sanity"})
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(groups= {"smoke"}, dependsOnMethods="test2", alwaysRun=true)
	public void test4() {
		System.out.println("Test4");
	}
}
