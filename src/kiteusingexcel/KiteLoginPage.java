package kiteusingexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
 
	@FindBy(id="userid")private WebElement userid;
	@FindBy(xpath = "//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userID(String UI) 
	{
		userid.sendKeys(UI);
	}
	
	public void passWord(String PW) 
	{
		password.sendKeys(PW);
	}
	
	public void logIN()
	{
		login.click();
	}
}
