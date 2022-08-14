package msexcelstudy;

import java.io.File;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Msreaddata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f1=new File("D:\\\\balaram.xlsx");
		String wk = WorkbookFactory.create(f1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(wk);
	}

}
