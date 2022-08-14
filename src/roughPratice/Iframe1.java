package roughPratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	      System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();			  
	      driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver\r\n");
	      driver.manage().window().maximize();	
		    String text = driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
		    System.out.println(text);
		    String text2 = driver.findElement(By.xpath("//ol[@class='breadcrumb h1']")).getText();
		    System.out.println(text2);
		    driver.switchTo().frame("frame1");
		    Thread.sleep(1000);
		    driver.switchTo().frame("frame3");
		    driver.findElement(By.id("a")).click();
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String name=RandomString.make(3);
		    File dest = new File("D:\\Test.java\\takeshoy"+name+".png");
		    FileHandler.copy(source, dest);
		    
	}

}
