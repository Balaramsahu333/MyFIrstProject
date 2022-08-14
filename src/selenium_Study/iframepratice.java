package selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class iframepratice {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
	     driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	String text=   driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	     Thread.sleep(1000);
	     System.out.println(text);
	     driver.switchTo().frame("frame1");
	     driver.findElement(By.tagName("input")).sendKeys("Selenium Study");
	     driver.switchTo().frame("frame3");
	     Thread.sleep(10000);
	     driver.findElement(By.id("a")).click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("frame2");
	    WebElement tr= driver.findElement(By.id("animals"));
	    Thread.sleep(1000);
	     Select sc=new Select(tr);
	     sc.selectByVisibleText("Big Baby Cat");
	     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String str=RandomString.make(4);
	     File dest=new File("D:\\selenium-java-4.2.2\\Screeensave//screenshot"+str+".png");
	     FileHandler.copy(source, dest);
	     
	
	}
	
}
