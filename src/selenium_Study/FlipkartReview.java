package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.name("q")).sendKeys("rela me phone");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(1000);
	     WebElement review= driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
	     Thread.sleep(2000);
	     System.out.println("review"+ review.getText());
	     
	   
	}

}
