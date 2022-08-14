package msexcelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadallData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
         File f=new File("\"C:\\Users\\user\\Documents\\data1.xlsx");
        Sheet st = WorkbookFactory.create(f).getSheet(" Sheet1");
        st.getFirstRowNum();
	}

}
