import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelUtility 
{
public ArrayList<String> getData(String Sheetname,int row) throws EncryptedDocumentException, IOException
{
	ArrayList<String> a=new ArrayList<>();
	

	String path = System.getProperty("user.dir")+"/example.xlsx";
	FileInputStream file=new FileInputStream(path);
	Workbook workbook = WorkbookFactory.create(file);
	int sheets=workbook.getNumberOfSheets();

	/**
	 * To Get the sheetname
	 *  
	 */

	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase(Sheetname))
		{
			Sheet sheet=workbook.getSheetAt(i);
			Row rows = sheet.getRow(row);
			Iterator<Cell> cell = rows.cellIterator();
	        while(cell.hasNext())
	        {
	        	Cell c=cell.next();
	        	
				if(c.getCellType()==CellType.STRING)
				{

					a.add(c.getStringCellValue());
				}
				else{

					a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

				}
	        }
	
	
		}
	}
	
	return a;
	
}

}
