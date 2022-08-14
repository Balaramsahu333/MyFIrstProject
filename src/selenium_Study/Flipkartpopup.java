package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(100);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("I phone 13pro");
Thread.sleep(100);
driver.findElement(By.linkText("Login")).click();
Thread.sleep(100);
driver.findElement(By.tagName("_2KpZ6l _2doB4z")).click();
	}

}
