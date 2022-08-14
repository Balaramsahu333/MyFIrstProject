package Mouseaction;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multidatatypereadexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File fl=new File("D:\\Vdata.xlsx");
		
				 RichTextString wb = WorkbookFactory.create(fl).getSheet("Sheet1").getRow(0).getCell(0).getRichStringCellValue();
				System.out.println(wb);
				Workbook wb1 = WorkbookFactory.create(fl);
				Sheet st = wb1.getSheet("Sheet1");
				
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Your Row Number");
				int rowno=sc.nextInt();
				System.out.println("Enter Your Column Number");
				Row rw = st.getRow(rowno);
				int colmno=sc.nextInt();
			
				Cell cl = rw.getCell(colmno);
				
				CellType result = cl.getCellType();
				System.out.print("THE DATATYPE IS "+result+" & "+" THE DATA IS ");
		
			switch(result) {
				case STRING :System.out.println(st.getRow(rowno).getCell(colmno).getStringCellValue());
				break;
				case NUMERIC :System.out.println(st.getRow(rowno).getCell(colmno).getNumericCellValue());
				break;
				case BOOLEAN:System.out.println(st.getRow(rowno).getCell(colmno).getBooleanCellValue());
				break;
				default:System.out.println("INVALID ENTER !!!! \n PLEASE ENTER VALID INPUT");
		        break;
				}
				
	}

	
	
}
