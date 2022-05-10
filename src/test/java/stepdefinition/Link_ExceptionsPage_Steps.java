package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_ExceptionsPage;
public class Link_ExceptionsPage_Steps {
	Link_ExceptionsPage Exceptions = new Link_ExceptionsPage();

	@And("^User click on Exceptions under Hamburger icon in Link Page$")
	public void User_click_on_Exceptions_under_Hamburger_icon_in_Link_Page() throws Throwable {
		Exceptions.User_click_on_Exceptions_under_Hamburger_icon_in_Linkpage();
	}

	@Then("^User validates DatePickers in Exceptions Page$")
	public void user_validates_DatePickers_in_Exceptions_page() throws Throwable {
		Exceptions.validating_DatePickers_ExceptionsPage();
	}
	
	@Then("^User validates Filters Under ExceptionsPage$")
	public void User_validates_Filters_Under_ExceptionsPage() throws Throwable {
		Exceptions.validating_Filters_ExceptionsPage();
	}
	
	@Then("^User validates all the fields in Details Page$")
	public void user_validates_all_the_fields_in_details_page() throws Throwable {
		Exceptions.validating_all_the_fields_in_Details_Page();
	}
	
	@Then("^User validates all the fields in Summary Page$")
	public void user_validates_all_the_fields_in_Summary_page() throws Throwable {
		Exceptions.validating_all_the_fields_in_Summary_Page();
	}
	
	@Then("^User validates all the fields in Corrections Page$")
	public void user_validates_all_the_fields_in_Corrections_page() throws Throwable {
		Exceptions.validating_all_the_fields_in_Corrections_Page();
	}
}

