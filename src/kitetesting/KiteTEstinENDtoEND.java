package kitetesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class KiteTEstinENDtoEND {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");

		     WebDriver driver = new ChromeDriver();
		     driver.get("https://kite.zerodha.com/");
		    WebElement userID = driver.findElement(By.id("userid"));
		    userID.sendKeys("ELR321");
		   
		    WebElement passWord = driver.findElement(By.id("password"));
		    passWord.sendKeys("Dhana1111");
		    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		    Thread.sleep(100);
		    loginButton.click();
		    Thread.sleep(1000);
		    WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
		    pin.sendKeys("982278");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(200);
		     WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));
		 
		   
		   driver.findElement(By.xpath("//a[@target='_self']")).click();
		    Thread.sleep(200);
		    String Actualresult = "ELR321";
		     String Expectedresult = Uid.getText();
		     System.out.println(Expectedresult);
		     if(Actualresult.equals(Expectedresult)) {
		    	 System.out.println("The Test Case Is Passed");
		     }
		     else {
		    	 System.out.println("The Test Case is Failed");
		     }
		     Uid.click();
		     driver.findElement(By.xpath("//a[@target='_self']")).click();
	}

		

}
