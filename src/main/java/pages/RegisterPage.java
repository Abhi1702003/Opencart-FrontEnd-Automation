package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class RegisterPage extends Base {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	private WebElement FirstName;
	@FindBy(id = "input-lastname")
	private WebElement LastName;
	@FindBy(id = "input-email")
	private WebElement Email;
	@FindBy(id = "input-password")
	private WebElement Password;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement userAgrrement;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public void enterFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		LastName.sendKeys(lname);
	}

	public void enterEmail(String email) {
		Email.sendKeys(email);
	}

	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void acceptUserAggrement() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",userAgrrement);
	}
	
	public MyAccountPage clickOnContinueButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",submit);
		return PageFactory.initElements(driver, MyAccountPage.class);
	}
}
