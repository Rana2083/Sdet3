package com.sdet2.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_data_ExcelfileTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String dirpath=System.getProperty("user.dir");
	    String propfilepath = dirpath+"/Sdet2.xlsx";
	    FileInputStream fls=new FileInputStream(propfilepath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("sheet1");
		Row row = sheet.getRow(4);
		String value=row.getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
