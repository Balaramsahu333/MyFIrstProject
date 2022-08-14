package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
             driver.get("https://www.flipkart.com/eoss-bpc-2022-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_b3b484d2-da56-43c0-86e6-23322cb54110_1_EM1OLCDXDYHG_MC.FASV00V1AKV7&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Beauty_FASV00V1AKV7&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L0_view-all&cid=FASV00V1AKV7");
	driver.close();
	driver.quit();
	}

}
