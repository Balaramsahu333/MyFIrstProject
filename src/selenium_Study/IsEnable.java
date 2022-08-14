package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     driver.get("https://www.discoveryplus.in/?gclid=CjwKCAjwtcCVBhA0EiwAT1fY7-ah11jhvAFNwmUpRlYuz5YPGkPoPvcQ90a26A5djb8u-zvZZ-KXLhoCSTYQAvD_BwE");
     Thread.sleep(10000);
     driver.findElement(By.xpath("(//div[@id='#signIn'])[1]")).click();
     
    WebElement otp= driver.findElement(By.xpath("//button[text()='Get OTP']"));
   boolean result=otp.isEnabled();
   
   System.out.println("the otp button"+result);
   WebElement mobilen=driver.findElement(By.id("mobileNumber"));
   if(result)
   {
	   System.out.println("THE otp button is enble");
   }
   else {
	         mobilen.sendKeys("8249460373");
	   System.out.println("the botton is clicked");
   }
   otp.isEnabled();
   
   }
	
}
