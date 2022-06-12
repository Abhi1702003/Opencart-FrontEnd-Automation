package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public MyAccountPage clickOnContinueButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",submit);
		return PageFactory.initElements(driver, MyAccountPage.class);
	}
	
}
