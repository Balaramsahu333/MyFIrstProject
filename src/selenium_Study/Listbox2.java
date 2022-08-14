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

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException, IOException {
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
		     driver.get("https://vctcpune.com/selenium/practice.html");
		     Thread.sleep(1000);
		    		WebElement text=driver.findElement(By.id("dropdown-class-example")) ;
                   Select sc=new Select(text); 
                   Thread.sleep(1000);
                   sc.selectByValue("option3");
                   Thread.sleep(1000);
                   File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                   String name=RandomString.make(4);
                   System.out.println(name);
                  File dest=new File("D:\\selenium-java-4.2.2\\Screeensave\\velocity"+name+".png");
                  FileHandler.copy(image, dest);

}
}
