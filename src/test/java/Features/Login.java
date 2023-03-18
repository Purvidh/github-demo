package Features;

import io.cucumber.java.en.*;

public class Login {
	@Given("User navigates to Login page")
	public void user_navigate_to_login_page() {
		System.out.println(">> User got navigated to Login page");
	    
	}

	@When("User enters valid Email address {string}")
	public void user_enters_vlaid_email_address(String emailAddressText) {
		System.out.println(">> User enters email address: "+ emailAddressText);
	    
	}

	@And("User enters valid Passowrd {string}")
	public void user_enters_valid_passowrd(String passwordText) {
		System.out.println(">>User enters valid password: "+ passwordText);
	   
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println(">> User clicks on login button");
	   
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">>User got loggedin successfully");
	   
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invlaidEmailAddress) {
		
		System.out.println(">>User has enters invaliedemailAddress " +invlaidEmailAddress );
	   
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidPassword) {
		System.out.println(">> User has enter invalid password: "+ invalidPassword);
	 
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">> User should get proper warning message");
	   
	}

	

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		
		System.out.println(">>User has not enter any details");
	   
	}

	


}
