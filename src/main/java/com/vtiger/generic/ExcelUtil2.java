package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil2 
{
	public ArrayList<Object[]> selectvaluefordd() throws IOException
	{
		String dirpath=System.getProperty("user.dir");
	    String propfilepath = dirpath+"/orgname.xlsx";
		FileInputStream fls=new FileInputStream(propfilepath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("sheet1");
		ArrayList<Object[]> read=new ArrayList<Object[]>();
		for(int i=1;i<=sheet.getLastRowNum();i++)	
		{
			String orgname=sheet.getRow(i).getCell(0).getStringCellValue();
			String phone=sheet.getRow(i).getCell(1).getStringCellValue();
			String employess=sheet.getRow(i).getCell(1).getStringCellValue();	
			
			Object[] obj= {orgname,phone,employess};
			read.add(obj);
		}
		return read;
	}	
	
}
