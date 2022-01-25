import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility excel=new ExcelUtility();
		ArrayList<String> res = excel.getData("Sheet1", 1);
		System.out.println(res.get(1));

	}

}
