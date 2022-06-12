package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage{

	public static pages.LoginPage log;
	
	@Then("we click on Login")
	public void we_click_on_login() {
	    log = RegisterPage.land.clickOnLoginIcon(); 
	}
	@When("we enter the valid email {string}")
	public void we_enter_the_valid_email(String email) {
		log.enterEmail(email);
	}
	@When("we enter the valid password {string}")
	public void we_enter_the_valid_password(String password) {
	    log.enterpassword(password);
	}
	
	@When("we click the continue button to Login")
	public void we_click_the_continue_button_to_login() {
	    log.clickOnContinueButton();
	}

}
