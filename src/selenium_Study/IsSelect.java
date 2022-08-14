package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		     WebDriver driver = new ChromeDriver();
		     driver.get("https://vctcpune.com/selenium/practice.html");
		     WebElement options=driver.findElement(By.id("checkBoxOption1"));
		     boolean result=options.isSelected();
		     System.out.println(result);
		     if(result)
		     {
		    	 System.out.println(" the options button is clicked");
		     }
		     else {
		    	 options.click();
		    	 System.out.println("the box is selected ");
		     }
	}

}
