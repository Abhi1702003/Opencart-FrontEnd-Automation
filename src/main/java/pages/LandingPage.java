package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LandingPage extends Base {

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountIcon;
	@FindBy(linkText = "Register")
	private WebElement RegisterIcon;
	@FindBy(linkText = "Login")
	private WebElement LoginIcon;

	public void clickOnMyAccountIcon() {
		MyAccountIcon.click();
	}
	
	public LoginPage clickOnLoginIcon() {
		LoginIcon.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public RegisterPage clickOnRegisterIcon() {
		RegisterIcon.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}

}
