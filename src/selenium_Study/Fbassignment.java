package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	             System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	             WebDriver driver = new ChromeDriver();
			     driver.get("https://www.facebook.com/");
			     driver.manage().window().maximize();
                 driver.findElement(By.linkText("Create New Account")).click();
                 Thread.sleep(1000);
                 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Balaram");
                 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahu");
                 driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("8249460373");
                driver.findElement(By.id("password_step_input")).sendKeys("Balaram123");
                WebElement day = driver.findElement(By.id("day"));
                Select  dl=new Select(day);
                dl.selectByValue("25");
               WebElement month = driver.findElement(By.id("month"));
               Select ml=new Select(month);
               ml.selectByValue("4");
              WebElement year = driver.findElement(By.id("year"));
               Select yl=new Select(year);
              yl.selectByVisibleText("1999");
              driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
              driver.findElement(By.xpath("//button[@name='websubmit']")).click();
      
              
                 
                 
                 
	}

}
