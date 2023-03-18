
package Features;

import io.cucumber.java.en.*;

public class Search {
	 @Given("^User open the Application$")
	    public void user_open_the_application()  {
		 System.out.println(">>Application got open");
	 }
	        
	    @When("^User enter valid product into Search field$")
	    public void user_enter_valid_product_into_search_field()  {
	    	System.out.println(">> User enteres valid product entered into search field");
	       
	    }

	    @When("^User enter non-existing product into Search field$")
	    public void user_enter_nonexisting_product_into_search_field(){
	    	System.out.println(">>User enters nonexisting product into search field");
	       
	    }

	    @When("^User dont enter any product into Search field$")
	    public void user_dont_enter_any_product_into_search_field()  {
	    	System.out.println(">>User dont enter any product into search field");
	        
	    }

	    @Then("^Valid product should get displayed in search results$")
	    public void valid_product_should_get_displayed_in_search_results()  {
	    	
	    	System.out.println(">>Valid prodcut got displayed");
	        
	    }

	    @Then("^Proper text informing the User about no prodcut matching should be displayed$")
	    public void proper_text_informing_the_user_about_no_prodcut_matching_should_be_displayed()  {
	    	System.out.println(">> No product matching got displayed ");
	       
	    }

	    @And("^User click on Search button$")
	    public void user_click_on_search_button()  {
	    	System.out.println(">>User clicked on Search button");
	       
	    }

	    @And("^User clicks on Search button$")
	    public void user_clicks_on_search_button()  {
	    	
	    	System.out.println(">> User clicks on search button");
	        

	    }
	

}
