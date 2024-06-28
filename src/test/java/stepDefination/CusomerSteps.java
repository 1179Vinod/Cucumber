package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class CusomerSteps {
	WebDriver driver;
	@Given("^user navigate browser$")
	public void launchBrowser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
		
	}

	@When("^user launch url$")
	public void launchurl() throws Throwable {
		FunctionLibrary.openUrl();

	}

	@When("^user wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_for_username_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue,"10");

	}

	@When("^user enter username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) throws Throwable {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	 
	}

	@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) throws Throwable {
	   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("^user Clicklogin button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Clicklogin_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^user wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_for_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		 FunctionLibrary.waitForElement(LocatorType, LocatorValue,"10");
	
	}

	@When("^click customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	  
	}

	@When("^user wait add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
		 FunctionLibrary.waitForElement(LocatorType, LocatorValue,"10");
	 
	}

	@When("^user click add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^user wait for customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_wait_for_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		 FunctionLibrary.waitForElement(LocatorType, LocatorValue,"10");
	}

	@When("^user capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_capture_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   FunctionLibrary.captureCus(LocatorType,LocatorValue);
	}
	

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String TestData, String LocatorType, String Locatorvalue) throws Throwable {
		FunctionLibrary.typeAction(LocatorType, Locatorvalue, TestData);
	}

	@When("^wait for confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_confirm_ok_button_with_and( String LocatorType, String Locatorvalue) throws Throwable {
	   FunctionLibrary.waitForElement(LocatorType, Locatorvalue,"10"); 
	}

	@When("^click confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_confirm_ok_button_with_and( String LocatorType, String Locatorvalue) throws Throwable {
	    FunctionLibrary.clickAction(LocatorType, Locatorvalue);
	}

	@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_alert_ok_button_with_and( String LocatorType, String Locatorvalue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, Locatorvalue,"10");
	}
	

	@When("^click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_alert_ok_button_with_and( String LocatorType, String Locatorvalue) throws Throwable {
		 FunctionLibrary.clickAction(LocatorType, Locatorvalue);
	}

	@When("^validate customer table$")
	public void validate_customer_table() throws Throwable {
	   FunctionLibrary.customerTable();
	}

	@When("^click logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_logout_link_with_and(String LocatorType, String Locatorvalue) throws Throwable {
		 FunctionLibrary.clickAction(LocatorType, Locatorvalue);
	}

	@When("^close application browser$")
	public void close_application_browser() throws Throwable {
		 FunctionLibrary.closeBrowser();; 
	}
}
