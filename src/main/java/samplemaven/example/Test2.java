package samplemaven.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {


	@Test(groups= {"A"},invocationCount=2)
	public void sample() {

		char ch = 'A';
		int a = ch;
		char ch1 = 'a';
		int a1 = ch1;
		System.out.println();
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
		}

	}

	@Parameters({"userName","passWord"})
	@Test(groups= {"B"},invocationCount=2)
	public void sample1(String uName, String pWord) {
		System.out.println();
		System.out.println("Sample1");
		System.out.println(uName);
		System.out.println(pWord);
	}

}
