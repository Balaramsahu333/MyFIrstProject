package kitetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
          DatadrivenkitePom loginpage =new DatadrivenkitePom(driver);
          loginpage.sendUserId();
          loginpage.sendPasword();
          loginpage.clicklobin();
          Thread.sleep(200);
          Datadrivenkiytepage2 pinpage=new  Datadrivenkiytepage2(driver);
          pinpage.pinInter();
          pinpage.continueto();
          Thread.sleep(200);
          KiteHomePage homepage=new KiteHomePage(driver);
          homepage.validateuserid();
          homepage.logoutclick();
	}

}
