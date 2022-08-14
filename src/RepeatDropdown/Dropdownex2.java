package RepeatDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     Thread.sleep(1000);
	    WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	     Select dr=new Select(dropdown);
	     Thread.sleep(1000);
	     dr.selectByIndex(2);
	}

}
