package kitetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datadrivenkiytepage2 {

	//declare data memnber globally and access level should make privata using @FindBy annotation
	@FindBy(xpath = "//input[@type='password']")private WebElement piN;
	@FindBy(xpath ="//button[@type='submit']")private WebElement continueButton;
	
	
	
	
	// intialize within Constructor access level public using PageFactory class
	public Datadrivenkiytepage2(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void pinInter() {
		piN.sendKeys("982278");
	}
	public void continueto() {
		continueButton.click();
	}
	
	
}
