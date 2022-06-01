package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_RecordsPage;
import pages.Link_ValidationsPage;

public class Link_RecordsPage_Spreadsheetview_Steps {
	Link_RecordsPage RecordPage = new Link_RecordsPage();
	Link_ValidationsPage Validations = new Link_ValidationsPage();
	
	@And("^User click on Record Under Hamburger in Link HomePage$")
	public void User_click_on_Record_Under_Hamburger_in_Link_HomePage() throws Throwable {
		RecordPage.clickRecordUnderHamburger();
	}
	
	@Then("^User click on Spreadsheet view button$")
    public void user_click_on_spreadsheet_view_button() throws Throwable {
		RecordPage.User_validates_Spreadsheetviewpage();
	}
	
	@Then("^User validates DatePickers in Spreadsheetview Page$")
    public void user_validates_datepickers_in_spreadsheetview_page() throws Throwable {
		RecordPage.validating_DatePickers_SpreadsheetviewPage();
    }
	
    @Then("^User validates Search box in Spreadsheetview Page$")
    public void user_validates_search_box_in_spreadsheetview_page() throws Throwable {
    	RecordPage. validating_searchbox_SpreadsheetviewPage();
    }
}