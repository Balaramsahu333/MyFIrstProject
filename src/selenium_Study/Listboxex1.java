package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxex1 {
             public static void main(String[] args) throws InterruptedException   {
             System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
		     driver.get("https://www.facebook.com/");
		     driver.manage().window().maximize();
		     Thread.sleep(1000);
		      driver.findElement(By.linkText("Create New Account")).click();
		     Thread.sleep(2000);
		     driver.manage().window().maximize();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("balaram");
		     Thread.sleep(1000);
		     WebElement list = driver.findElement(By.id("month"));
		   Thread.sleep(1000);
		   Select elent= new Select(list);
		   elent.selectByValue("4");
	}

}
