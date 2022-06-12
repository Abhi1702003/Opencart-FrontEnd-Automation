package stepDefinations;

import org.junit.Assert;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;

public class RegisterPage {

	public static Base base = new LandingPage();
	public static pages.LandingPage land;
	public static pages.RegisterPage reg;

	@After
	public void close() {
		base.closeDriver();
	}

	@Before
	public void openDriver() {
		base.intiDriver();
	}

	@Given("User is on Landing Page")
	public void user_is_on_landing_page() {
		land = base.openUrl();

	}

	@And("we validate the page title as {string}")
	public void we_validate_the_page_title_as(String title) {
		Assert.assertEquals(Base.getTitl(), title);
	}

	@Then("we click on my account")
	public void we_click_on_my_account() {
		land.clickOnMyAccountIcon();
	}

	@Then("we click on Register")
	public void we_click_on_register() {
		reg = land.clickOnRegisterIcon();
	}

	@When("we fill the mandatory fields {string} {string} {string} {string}")
	public void we_fill_the_mandatory_fields(String Fname, String Lname, String Email, String Pass) {
		reg.enterFirstName(Fname);
		reg.enterLastName(Lname);
		reg.enterEmail(Email);
		reg.enterPassword(Pass);
	}

	@When("we check the privacy policy checkbox")
	public void we_check_the_privacy_policy_checkbox() {
		reg.acceptUserAggrement();
	}

	@When("we click the continue button")
	public void we_click_the_continue_button() {
		reg.clickOnContinueButton();
	}

}
