package com.acti.Utils;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Create Constructor 
public class ExcelHelper {
	XSSFWorkbook excel;

	public ExcelHelper() {

		try {
			File source = new File("./TestData/TestData.xlsx");

			FileInputStream fis = new FileInputStream(source);

			excel = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Excel Sheet Failed to Load" + e.getMessage());
		}
	}

	// First method to ge teh count of active rows
	public int getRowCount(int sheetnum) {
		return excel.getSheetAt(sheetnum).getLastRowNum() + 1;

	}

	// get the values from the cell
	public String getCellData(int sheetNum, int row, int col) {
		return excel.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
	}

}
