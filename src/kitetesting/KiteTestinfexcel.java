package kitetesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestinfexcel {
 public static void main(String[]arg) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		   File myFile=new File("D:\\Vdata.xlsx");
		    Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		    String Userid = mysheet.getRow(0).getCell(0).getStringCellValue();
		    String paSSword=mysheet.getRow(0).getCell(1).getStringCellValue();
		    String Pin=mysheet.getRow(0).getCell(2).getStringCellValue();
		     
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
	     Thread.sleep(1000);
	      WebElement userId = driver.findElement(By.id("userid"));
	     WebElement password = driver.findElement(By.id("password"));
	     userId.sendKeys(Userid);
	     password.sendKeys(paSSword);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(200);
	    WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
	    pin.sendKeys(Pin);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
	             
	   WebElement usertext = driver.findElement(By.xpath("//span[@class='user-id']"));
	    String expectedResult = usertext.getText();
	    String actualResult="ELR321";
	    if(actualResult.equals(expectedResult)) {
	    	System.out.println("The Test Case is passed ");
	    }
	    else {
	    	System.out.println("The test case is failed ");
	    }
	    usertext.click();
	    Thread.sleep(200);
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    driver.close();
 }
}
  
