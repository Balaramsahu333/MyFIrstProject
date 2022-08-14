package kiteusingexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage3 {
	   @FindBy(xpath = "//span[@class='user-id']")private WebElement udertext;
	   @FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	   
	   public KiteHomepage3(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void UserIdText(String ExResult)
	   {
		  String actualresult= udertext.getText();
		  if(ExResult.equals(actualresult))
		  {
			  System.out.println(" The Test Case is Passed");
		  }
		  else
		  {
			  System.out.println("The test Case is Failed");
		  }
	   }
	   
	   public void logOut() throws InterruptedException
	   {
		   udertext.click();
		   Thread.sleep(1000);
		   logout.click();
	   }

}
