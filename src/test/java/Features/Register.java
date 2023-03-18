package Features;

import io.cucumber.java.en.*;


public class Register {
	
	@Given("User navigate to Register Account page")
	public void  User_navigate_to_Register_Account_page()
	{
		System.out.println(">> User navigated to Register Account page");
	}
	
	@When("User enters firstname {string} into the First Name field")
	public void User_enters_firstname_into_the_First_Name_field(String firstNameText)
	{
		System.out.println(">>User has entered firstname: "+firstNameText+" into the firstname field");
	}

	@When("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String lastNameText) {
		System.out.println(">> User has entered lastname: " +lastNameText+" into the lastname field");
	    
	}
	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephoneText) {
		System.out.println(">> User has entered: "+telephoneText+"into the telephonefield");
	}

	@When("Enters email address {string} into the EMail field")
	public void enters_email_address_into_the_e_mail_field(String emailText) {
		System.out.println(">>User has entered email: "+emailText+ "into the email field");
	    
	}

	@When("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String passwordText) {
		System.out.println(">> User has entered password: "+passwordText+"into the password field");
	    
	}

	@When("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String passwordText) {
	    System.out.println(">> User has entered  password: "+passwordText+" into the confirm password field" );
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {
	   System.out.println(">>user has selected the Privacy Policy field");
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
	    System.out.println(">>User has clicked on Continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	    System.out.println(">>User Account has created successfully");
	}

	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() {
	   System.out.println("User has selected Yes for Newsletter");
	}

	

	@When("User don't enter details into any fields")
	public void user_don_t_enter_details_into_any_fields() {
		System.out.println(">> User has kept all the fields blank");
	   
	}

	@Then("Warning messages should be displayed for all the mandatory fields")
	public void warning_messages_should_be_displayed_for_all_the_mandatory_fields() {
		System.out.println(">> Warning messages for all the mandatory fields got displayed");
	  
	}

	@Then("Warning message informing the user about duplicate email address")
	public void warning_message_informing_the_user_about_duplicate_email_address() {
		System.out.println(">>Wraning message informing about duplicate email is displayed");
	  
	}

}
