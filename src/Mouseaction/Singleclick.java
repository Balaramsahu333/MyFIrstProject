package Mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Singleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html\r\n");
	     Thread.sleep(1000);
	  
	    Actions ac=new Actions (driver);
	   WebElement dr = driver.findElement(By.id("box1"));
	  WebElement dro = driver.findElement(By.id("box106"));
	  ac.dragAndDrop(dr, dro).perform();
	  Thread.sleep(1000);
	WebElement dr1 = driver.findElement(By.id("box3"));
	WebElement dro1 = driver.findElement(By.id("box101"));
	ac.clickAndHold(dr1).moveToElement(dro1).release(dro1).build().perform();
}
	}

