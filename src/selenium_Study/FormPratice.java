package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPratice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demoqa.com/automation-practice-form");
	     Thread.sleep(10000);
	     driver.findElement(By.id("firstName")).sendKeys("BALARAM");
	     Thread.sleep(1000);
	     driver.findElement(By.id("lastName")).sendKeys("Sahu");
	     Thread.sleep(1000);
	     driver.findElement(By.id("userEmail")).sendKeys("sahubalaram333@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("userNumber")).sendKeys("8249460373");
	     driver.findElement(By.id("dateOfBirthInput")).sendKeys(" 25 April 1999");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input [@id='hobbies-checkbox-2']")).click();
	}

}

