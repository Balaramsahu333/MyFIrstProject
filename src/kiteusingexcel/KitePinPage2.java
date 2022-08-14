package kiteusingexcel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage2 {
	@FindBy(xpath = "//input[@type='password']")private WebElement pin;
	@FindBy(xpath ="//button[@type='submit']")private WebElement continuebutton;
	
	public KitePinPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void piN(String PN)
	{
		pin.sendKeys(PN);
	}
	
	public void continueButtonclick()
	{
		continuebutton.click();
	}
	
	

}
