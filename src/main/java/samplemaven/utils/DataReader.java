package samplemaven.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public abstract class DataReader {
	
	//String excelSheetName = "Sheet1";
	
	public static String[][] readData(String excelSheetName) throws IOException {
		
		String path = "./data/SampleData.xlsx";
		
		FileInputStream fis = new FileInputStream(new File(path));
		
		XSSFWorkbook wBook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wBook.getSheet(excelSheetName);
		
		int rowCount = sheet.getLastRowNum();
		
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		
		System.out.println("rowCount: "+rowCount);
		System.out.println("colCount: "+colCount);
		
		
		for(int i=1;i<rowCount+1;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++) {
				
				XSSFCell cell = row.getCell(j,MissingCellPolicy.RETURN_NULL_AND_BLANK);
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println("stringCellValue: "+stringCellValue);
				
				data[i-1][j] = stringCellValue;
			}
		}
		/*System.out.println("data size: "+data.length);
		for(int k=0;k<data.length;k++) {
			//System.out.println("k: "+k);
			for(int l=0;l<=data.length;l++) {
				//System.out.println("l: "+l);
				System.out.println("Data["+k+"]["+l+"]: "+data[k][l]);
			}
				
		}*/
		return data;
	}
}
