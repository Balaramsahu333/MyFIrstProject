package kitetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatadrivenkitePom {

 
		//declarr data member  should be declar globally with accec level pravate using @findBy annotaton
		@FindBy(id="userid")private WebElement userID;
		@FindBy(xpath = "//input[@type='password']")private WebElement passWord;
		@FindBy(xpath="//button[@type='submit']")private WebElement logIn;
		
		
		
		
		//intialize witnin constructor access level public using pageFactory
		public DatadrivenkitePom(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	//utilize using method with access level public
		public void sendUserId() {
			userID.sendKeys("ELR321");
		}
        public void sendPasword() {
        	passWord.sendKeys("Dhana1111");
        }
        public void clicklobin() {
        	logIn.click();
        }
}
