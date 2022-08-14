package roughPratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
    public static void main(String []rg) throws InterruptedException {
    
    
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();			  
       driver.get("https://demo.guru99.com/test/delete_customer.php");
       driver.findElement(By.name("cusid")).sendKeys("123544");
       Thread.sleep(200);
       
       driver.findElement(By.name("submit")).click();
       Thread.sleep(200);
       Alert alr=driver.switchTo().alert();
      alr.accept();
}
}