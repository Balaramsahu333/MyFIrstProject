 package selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	     driver.get("https://www.wikipedia.org/");
	     driver.manage().window().maximize();
	     File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest=new File("D:\\selenium-java-4.2.2\\Screeensave\\snapshot.png");
	     FileHandler.copy(scr, dest);
	}

}
