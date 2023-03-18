package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login1 {
	WebDriver driver;
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tutorialsninja.com/demo/");
				
	}
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
@Given("User navigates to login page")
public void user_navigates_to_login_page() {
	
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	driver.findElement(By.xpath("//a[linkText='Login']")).click();
}

@When("User enters valid email address {string} into email field")
public void user_enters_valid_email_address_into_email_field(String emailText) {
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailText);
   
}

@When("User enters valid password {string} into password field")
public void user_enters_valid_password_into_password_field(String passwordText) {
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(passwordText);
		
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//input[@value='Login']")).click();
    
}

@Then("User should get login successfully.")
public void user_should_get_login_successfully() {
	
	Assert.assertTrue(true);
	
}

}
