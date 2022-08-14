package msexcelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reammld2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
 File fl=new File("D:\\data3.xlsx");
    Sheet wokb = WorkbookFactory.create(fl).getSheet("Sheet1");
    System.out.println( wokb);
   
   }
    
	}


