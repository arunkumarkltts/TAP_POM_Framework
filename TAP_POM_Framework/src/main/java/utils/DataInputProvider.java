package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import wrappers.TapWrappers;

public class DataInputProvider{

	@SuppressWarnings("unused")
	public static String[][] getSheet(String dataSheetName) {

		String[][] data = null;
		Class<TapWrappers> wrapper = TapWrappers.class;
		Method[] allmethods = wrapper.getMethods();
		try {
			FileInputStream fis = new FileInputStream(new File("./data/"+dataSheetName+".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();

			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];
			System.out.println("Rowcount = "+rowCount+"\n");
			System.out.println("Columncount = "+columnCount+"\n");

			// loop through the rows
			for(int i=1; i <=rowCount; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								if (row.getCell(j) != null) {
								    	if (row.getCell(j).getCellType() == CellType.NUMERIC) {
								    	    cellValue = String.valueOf((int)row.getCell(j).getNumericCellValue());
								    	}
								    	else {
								    	    row.getCell(j).setCellType(CellType.STRING);
								    	    cellValue = row.getCell(j).getStringCellValue();
								    	}
									
								}
							}catch(NullPointerException e){

							}
							data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
 							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
 					e.printStackTrace();
				}
			}
			fis.close();
			workbook.close();
		} catch (Exception e) {
 			e.printStackTrace();
		}

		return data;

	}

	//New Method to write in excel in DataInputProvider
	public static void writeSheet(String dataSheetName, int testRow, String result) {
		try {
			FileInputStream fis = new FileInputStream(new File("./data/"+dataSheetName+".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.getSheetAt(0);	

			int columnCount = sheet.getRow(0).getLastCellNum();
			XSSFRow newRow = sheet.getRow(testRow);
			XSSFCell cell = newRow.createCell(columnCount);

	        cell.setCellValue(result);
	        
	        FileOutputStream outputStream = new FileOutputStream(new File("./data/"+dataSheetName+".xlsx"));
	        workbook.write(outputStream);
	        outputStream.close();

	        fis.close();
			workbook.close();
			outputStream.close();
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}
}
