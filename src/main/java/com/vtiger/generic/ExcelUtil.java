package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil
{
	
	private ExcelUtil()
	{

	}
	public static ExcelUtil objectexcelUtil()
	{
		ExcelUtil exe=new ExcelUtil();
		return exe;
	}
	public String ReadDataFromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fls=new FileInputStream(IAutoconstat.Excelpath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("sheet1");
		Row row = sheet.getRow(11);
		return  row.getCell(0).getStringCellValue();

	}
	public String ReadDataFromExcel1() throws EncryptedDocumentException, IOException
	{
		FileInputStream fls=new FileInputStream(IAutoconstat.Excelpath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("sheet1");
		Row row = sheet.getRow(4);
		return  row.getCell(1).getStringCellValue();

	}
	public String ReadDataFromExcel2() throws EncryptedDocumentException, IOException
	{
		FileInputStream fls=new FileInputStream(IAutoconstat.Excelpath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("sheet1");
		Row row = sheet.getRow(3);
		return  row.getCell(2).getStringCellValue();

	}
	public int getLastRow(String sheetname) throws IOException
	{
		FileInputStream fls=new FileInputStream(IAutoconstat.Excelpath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet(sheetname);
		return sheet.getLastRowNum();
	}
	public String selectvaluefordd(String sheetname,int cell,String DDvalue) throws IOException
	{
		FileInputStream fls=new FileInputStream(IAutoconstat.Excelpath);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet(sheetname);
		int lastrow=getLastRow(sheetname);
		String value="Null";
		for(int i=0;i<=lastrow;i++)
		{
			value=sheet.getRow(i).getCell(cell).getStringCellValue();
			if(value.equalsIgnoreCase(DDvalue))
			{
				break;
			}	
		}
		return value;
	}
	
	
	
}
