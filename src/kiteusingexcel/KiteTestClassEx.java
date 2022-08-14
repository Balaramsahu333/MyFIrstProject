package kiteusingexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class KiteTestClassEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 \\chromedriver.exe");
		 
		 ChromeOptions opt= new ChromeOptions();
		 WebDriver driver = new ChromeDriver(opt);
		 
		opt.addArguments("--headless");
		// driver.manage().window().maximize();
	     driver.get("https://kite.zerodha.com/");
	     
	     
		 File myFile=new File("D:\\Vdata.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		 String Ui = mysheet.getRow(0).getCell(0).getStringCellValue();
		 String Pw = mysheet.getRow(0).getCell(1).getStringCellValue();
		 String Pi = mysheet.getRow(0).getCell(2).getStringCellValue();
		 
		
		KiteLoginPage lp= new KiteLoginPage(driver);
		lp.userID(Ui);
		lp.passWord(Pw);
	    lp.logIN();
	    Thread.sleep(2000);
	    
	    KitePinPage2 pg=new KitePinPage2(driver);
	    pg.piN(Pi);
	    pg.continueButtonclick();
	    
	    Thread.sleep(2000);
	    
	    KiteHomepage3 hp= new KiteHomepage3(driver);
	    hp.UserIdText(Ui);
	    hp.logOut();
	    Thread.sleep(2000);
	    driver.close();
		 
	}
	

}
