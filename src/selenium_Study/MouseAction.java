package selenium_Study;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseAction {


		public static void main(String[] args) throws InterruptedException, IOException {
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
		     driver.get("https://vctcpune.com/selenium/practice.html");
		     Thread.sleep(1000); 

	}

}
