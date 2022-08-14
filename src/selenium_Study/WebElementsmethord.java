package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsmethord {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://auth.discoveryplus.in/login");
		
           WebElement  textbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
           
           textbox.sendKeys("india");
           Thread.sleep(1000);
           textbox.clear();
           driver.navigate().refresh();
            String text=driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
           
           System.out.println(text);

		 boolean result=driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		  
		 if(result)
		 {
			 System.out.println("button is enabled");
		 }
		 else
		 {
			 
			 driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("55555555555");
			 
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		
	}

}
