package selenium_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElements {
	public static void main(String []arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     Thread.sleep(1000);
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println (links.size());; 
	  for (WebElement l:links) {
		  System.out.println(l.getText());
	  }
	}
	

}
