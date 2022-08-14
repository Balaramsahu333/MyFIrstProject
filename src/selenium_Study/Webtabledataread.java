package selenium_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledataread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     Thread.sleep(1000);
	    List<WebElement> norow = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
	    System.out.println(norow.size());
	   List<WebElement> noclm = driver.findElements(By.xpath("//table[@id='product']//tbody//tr[1]/th"));
	   System.out.println(noclm.size());
	    for(WebElement c:noclm) {
	    	System.out.print(c.getText()+" || ");
	    } System.out.println( );
	    for (WebElement r:norow) {
	    	System.out.println(r.getText()+"||  ");
	    }System.out.println();
	}

}
