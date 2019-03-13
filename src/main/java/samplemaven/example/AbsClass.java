package samplemaven.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class AbsClass extends Class1 {


	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Class1");
	}
	
	public void delete() {
		System.out.println("delete");
	}

	
	public static void main(String[] args) {
		
		AbsClass cc = new AbsClass();
		
		ArrayList<String> gString = new ArrayList<String>();
		gString.add("CTS");
		gString.add("VIR");
		gString.add("CTS");
		gString.add("TCS");
		gString.add("CTS");
		
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		
		for(String eachString:gString) {
			
			if(hMap.containsKey(eachString)) {
				hMap.put(eachString,hMap.get(eachString)+1);
			}
			else {
				hMap.put(eachString, 1);
			}
		}
		
		for(Map.Entry<String,Integer> eachEntry:hMap.entrySet()) {
			System.out.println(eachEntry.getKey()+"-->"+eachEntry.getValue());
		}
		
		System.out.println("********************");
		String iString  = "cTsYUio";
		System.out.println(iString);
		char[] cArray = iString.toCharArray();
		for(int i=0;i<cArray.length;i++) {
			int k = cArray[i];
			if(k>=97) {
				k = k-32;
				char newC = (char)k;
				System.out.print(newC);
			}
			else if(k>=65&&k<97){
				k = k+32;
				char newC = (char)k;
				System.out.print(newC);
			}
		}
		System.out.println();
		System.out.println("********************");
		
		for(char a: cArray) {
			if(Character.isUpperCase(a)) {
				System.out.print(Character.toLowerCase(a));
			}
			else  {
				System.out.print(Character.toUpperCase(a));
			}
		}
	
	}
}
