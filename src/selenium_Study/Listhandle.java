package selenium_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Listhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.findElement(By.name("q")).sendKeys(" tvs");
	    List<WebElement> tvs = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	   System.out.println(tvs.size());
	   for (WebElement t:tvs)
	   {
		   System.out.println(t.getText());
	   }
	   for (WebElement t:tvs) {
		   String result="tvs jupiter";
		   String ex=t.getText();
		   if(result.equals(ex))
		   t.click();
	   }
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Images")).click();
	}


}
