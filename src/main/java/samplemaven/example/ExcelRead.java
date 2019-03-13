package samplemaven.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./data/SampleData.xlsx";
		
		//File ss = new File(filePath);
		
		FileInputStream fis = new FileInputStream(new File(filePath));
		
		XSSFWorkbook wBook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		int rowNum = sheet.getLastRowNum();
		int rowPhy = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getLastCellNum();
		System.out.println("rowNum: "+rowNum);
		System.out.println("rowPhy: "+rowPhy);
		System.out.println("colNum: "+colNum);
		String[][] data = new String[rowNum][colNum];
		/*for(int i=1;i<=rowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colNum;j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
				//data[0][0]=cellValue;
			}
		}*/
		
		
		String rowValue = "Demo";
		String colValue = "Mobile";
		int rowIndex = 0;
		int colIndex = 0;
		for(int i=0;i<=rowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colNum;j++) {
				XSSFCell cell = row.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				if(colValue.equalsIgnoreCase(cellValue)) {
					colIndex = j;
					System.out.println("colIndex: "+colIndex);
				}
				if(rowValue.equalsIgnoreCase(cellValue)) {
					rowIndex = i;
					System.out.println("rowIndex: "+rowIndex);
				}
				
			}
		}
		if(rowIndex!=0 && colIndex!=0) {
			String aData = sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			System.out.println("aData: "+aData);
			String abData = "SS";
			sheet.getRow(rowIndex).getCell(colIndex).setCellValue(abData);
			
		}
		
		FileOutputStream fos = new FileOutputStream(filePath);
		wBook.write(fos);
		wBook.close();
		fos.close();

	}

}
