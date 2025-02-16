package TestDefination_PACK;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User Navigate to LoginPage")
	public void user_navigate_to_login_page() {

		System.out.println("...1");
	}

	@When("User Enter Valid Email as {string} and Password as {string}")
	public void user_enter_valid_email_as_and_password_as(String string, String string2) {
		System.out.println("...2");
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
		System.out.println("...3");
	}

	@Then("User should navigate to Dashboard")
	public void user_should_navigate_to_dashboard() {
		System.out.println("...4");
	}

}
