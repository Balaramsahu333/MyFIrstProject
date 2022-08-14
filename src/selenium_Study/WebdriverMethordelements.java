package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverMethordelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
          driver.get("https://vctcpune.com/selenium/practice.html");
          Thread.sleep(2000);
          driver.navigate().to("https://www.facebook.com/home.php");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
          driver.navigate().refresh();
        String title= driver.getTitle();
        System.out.println(title);
       String url= driver.getCurrentUrl();
      System.out.println(url);
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type='text']")).clear();
      driver.manage().window().maximize();
     
	}
      
        
	
}
