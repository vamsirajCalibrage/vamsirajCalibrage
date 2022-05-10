package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_ValidationsPage;
public class Link_ValidationsPage_Steps {
	Link_ValidationsPage Validations = new Link_ValidationsPage();

	@And("^User click on Validations under Hamburger icon in Link Page$")
	public void User_click_on_Validations_under_Hamburger_icon_in_Link_Page() throws Throwable {
		Validations.User_click_on_Validations_under_Hamburger_icon_in_Linkpage();
	}

	@Then("^User validates DatePickers in Validations Page$")
	public void user_validates_DatePickers_in_Validations_page() throws Throwable {
		Validations.validating_DatePickers_ValidationsPage();
	}
	
	@Then("^User validates Search box in Validations Page$")
    public void user_validates_search_box_in_validations_page() throws Throwable {
		Validations.validating_searchbox_ValidationsPage();
    }

    @Then("^User validates Group By Type check box in Validations Page$")
    public void user_validates_group_by_type_check_box_in_validations_page() throws Throwable {
    	Validations.validating_groupbytype_checkbox_ValidationsPage();
    }
    
	 @Then("^User validates Card button in Validations Page$")
	    public void user_validates_card_button_in_validations_page() throws Throwable {
		 Validations.validating_cardbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Grid button in Validations Page$")
	    public void user_validates_grid_button_in_validations_page() throws Throwable {
		 Validations.validating_gridbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Spreadsheet button in Validations Page$")
	    public void user_validates_spreadsheet_button_in_validations_page() throws Throwable {
		 Validations.validating_spreadsheetbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Printview button in Validations Page$")
	    public void user_validates_printview_button_in_validations_page() throws Throwable {
		 Validations.validating_printviewbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Tasks button in Validations Page$")
	    public void user_validates_tasks_button_in_validations_page() throws Throwable {
		 Validations.validating_tasksbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Dynamicflowrecords button in Validations Page$")
	    public void user_validates_dynamicflowrecords_button_in_validations_page() throws Throwable {
		 Validations.validating_dynamicflowrecordsbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Caserecords button in Validations Page$")
	    public void user_validates_caserecords_button_in_validations_page() throws Throwable {
		 Validations.validating_caserecordsbutton_ValidationsPage();
	    }
	 
	 @Then("^User validates Filters Under Validations Page$")
		public void User_validates_Filters_Under_Validations_Page() throws Throwable {
			Validations.validating_Filters_ValidationsPage();
		}
	 
	 @Then("^User validates JimDrevalidation from grid$")
	    public void user_validates_jimdrevalidation_from_grid() throws Throwable {
		 Validations.validating_JimDrevalidation_from_grid();
	    }
	 
	}


