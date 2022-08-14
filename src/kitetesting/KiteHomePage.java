package kitetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
   @FindBy(xpath = "//span[@class='user-id']")private WebElement udertext;
   @FindBy(xpath = "//a[@target='_self']") private WebElement logout;
   public KiteHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver , this);
   }
   public void validateuserid() {
	   String actualResult=" ELR321";
	   String expecteResult=logout.getText();
	   if(actualResult.equals(expecteResult)) {
		   System.out.println("The Test case is passed");
	   }
	   else {
		   System.out.println(" The test case is Failed");
	   }
   }
   
	   public void logoutclick() throws InterruptedException {
		   udertext.click();
		   Thread.sleep(1000);
		   logout.click();
	   }
	   
   
}
