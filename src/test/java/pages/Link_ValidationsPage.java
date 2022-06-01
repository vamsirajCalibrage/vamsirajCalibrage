package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;

public class Link_ValidationsPage extends DriverFactory {
	Utilities utilities = new Utilities();
	By more = By.xpath("//div[@id='MenuWrapper']//span[text()='More...']/following-sibling::i");
	By validations = By.xpath("//div[@id='MenuWrapper']//span[text()='More...']/../../following::ul//span[text()='Validations']");
    By linkhamburgericon = By.xpath("//*[@id='SidebarTogglerIcon']");
    By SafetyChainImage = By.xpath("//img[@src='_SupportFiles/M.Images.sc-logo-40.png']");
    By EightHour = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'8h')]");
	By EightHourDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 8 Hours Ago' or text()='Select a Range']");
	By TwelveHours = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'12h')]");
	By TwelveHoursDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 12 Hours Ago' or text()='Select a Range']");
	By OneDay = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1D')]");
	By TwentyFourHoursDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 24 Hours Ago' or text()='Select a Range']");
	By TwoDays = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2D')]");
	By TwoDaysDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 2 Days Ago' or text()='Select a Range']");
	By OneWeek = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1W')]");
	By OneWeekDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 7 Days Ago' or text()='Select a Range']");
	By TwoWeeks = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'2W')]");
	By FourteenDaysDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 14 Days Ago' or text()='Select a Range']");
	By OneMonth = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1M')]");
	By OneMonthDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 30 Days Ago' or text()='Select a Range']");
	By ThreeMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'3M')]");
	By ThreeMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By SixMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'6M')]");
	By SixMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 180 Days Ago' or text()='Select a Range']");
	By OneYear = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'1Y')]");
	By OneYearDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 365 Days Ago' or text()='Select a Range']");
	
	By Filters = By.xpath("//span[text()='Filters']");
	By Close_Filters = By.xpath("//span[text()='Close']");
	By Filters_PauseRefresh = By.xpath("//span[text()='Pause Refresh']");
	By Filters_SavedFilters = By.xpath("//div[@id='btnSave']");
	By Filters_Records = By.xpath("//ol[@id='RecordCount']//div[@id='RecordsCount_Row1']");
	By Filters_Pass = By.xpath("//ol[@id='RecordCount']//div[@id='pass_Row1']");
	
	By Filter_PauseRefresh_CheckBox = By.xpath("//input[@id='PauseFilter']");
	By Filter_Dates = By.xpath("//ol[@id='xDateFilterSelect']/li");
	By Filter_EightHour = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'8h')]");
	By Filter_EightHourDatepicker = By.xpath("//*[@id='range-label'][text()='Since 8 Hours Ago']");
	By Filter_TwelveHours = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'12h')]");
	By Filter_TwelveHoursDatepicker = By.xpath("//*[@id='range-label'][text()='Since 12 Hours Ago']");
	By Filter_OneDay = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1D')]");
	By Filter_TwentyFourHoursDatepicker = By.xpath("//*[@id='range-label'][text()='Since 24 Hours Ago']");
	By Filter_TwoDays = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'2D')]");
	By Filter_TwoDaysDatepicker = By.xpath("//*[@id='range-label'][text()='Since 2 Days Ago']");
	By Filter_OneWeek = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1W')]");
	By Filter_OneWeekDatepicker = By.xpath("//*[@id='range-label'][text()='Since 7 Days Ago']");
	By Filter_TwoWeeks = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'2W')]");
	By Filter_FourteenDaysDatepicker = By.xpath("//*[@id='range-label'][text()='Since 14 Days Ago']");
	By Filter_OneMonth = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1M')]");
	By Filter_OneMonthDatepicker = By.xpath("//*[@id='range-label'][text()='Since 30 Days Ago']");
	By Filter_ThreeMonths = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'3M')]");
	By Filter_ThreeMonthsDatepicker = By.xpath("//*[@id='range-label'][text()='Since 90 Days Ago']");
	By Filter_SixMonths = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'6M')]");
	By Filter_SixMonthsDatepicker = By.xpath("//*[@id='range-label'][text()='Since 180 Days Ago']");
	By Filter_OneYear = By.xpath("//ol[@id='xDateFilterSelect']/..//span[contains(text(),'1Y')]");
	By Filter_OneYearDatepicker = By.xpath("//*[@id='range-label'][text()='Since 365 Days Ago']");
	
	By Filter_Records = By.xpath("//div[@id='xFilterHeader']//div[@id='Title']//span[text()='Records']");
	By Filter_Pass = By.xpath("//div[@id='xFilterHeader']//div[@id='Title']//span[text()='Pass']");
	By Filter_BaseFilters_ShowOnlyFailedRecords = By.xpath("//div[@id='xFilterListxx']//span[text()='Show Only Failed Records']");
	By Filter_BaseFilters_Forms = By.xpath("//div[@id='xFilterListxx']//span[text()='Forms'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Form'][@class='lead text-uppercase sc-gbl']");
	By Filter_BaseFilters_Forms_SearchIcon = By.xpath("//i[@class='fa fa-search px-2 text-orange pt-1']");
	By Filter_BaseFilters_Forms_FormNameFilter = By.xpath("//input[@name='FormNameFilter']");
	By Filter_BaseFilters_Forms_Download = By.xpath("//div[@id='Print']");
	By Filter_BaseFilters_Forms_TotalRecordsPresent = By.xpath("//table[@id='dtFormList_']/tbody/tr[1]/td[4]");
	By Filter_BaseFilters_Resources = By.xpath("//div[@id='xFilterListxx']//span[text()='Resources'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Resource'][@class='lead text-uppercase sc-gbl']");
	By Filter_BaseFilters_Location = By.xpath("//div[@id='xFilterListxx']//span[text()='Locations'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='Location'][@class='lead text-uppercase sc-gbl']");
	By Filter_BaseFilters_User = By.xpath("//div[@id='xFilterListxx']//span[text()='Users'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterListxx']//span[text()='User'][@class='lead text-uppercase sc-gbl']");
	By Filter_AdditionalFilters_Identifiers = By.xpath("//div[@id='xFilterList2xx']//span[text()='Identifiers'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Identifier'][@class='lead text-uppercase sc-gbl']");
	By Filter_AdditionalFilters_Program = By.xpath("//div[@id='xFilterList2xx']//span[text()='Programs'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Program'][@class='lead text-uppercase sc-gbl']");
	By Filter_AdditionalFilters_Verifications = By.xpath("//div[@id='xFilterList2xx']//span[text()='Verifications'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Verification'][@class='lead text-uppercase sc-gbl']");
	By Filter_Signed_Verified_By = By.xpath("//div[@id='xFilterList2xx']//span[text()='Signed / Verified By'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Signed / Verified By'][@class='lead text-uppercase sc-gbl']");
	By Filter_AdditionalFilters_RecordSearch = By.xpath("//div[@id='xFilterList2xx']//span[text()='Record Search']");
	By Filter_AdditionalFilters_VoidedRecords = By.xpath("//div[@id='xFilterList2xx']//span[text()='Voided Records'][@class='lead text-uppercase sc-gbl']|//div[@id='xFilterList2xx']//span[text()='Voided Records'][@class='lead text-uppercase text-white sc-gbl']");
	By Filter_Apply_All = By.xpath("//div[@id='divHeader']//span[text()='Apply All'][@class='cd-panel-apply animated slideInDown border rounded border-primary bg-primary text-white sc-gbl px-2']|//div[@id='divHeader']//span[text()='Apply All'][@class='cd-panel-apply animated slideInDown border rounded border-primary bg-primary text-white sc-gbl px-2']");
	
	By Card = By.xpath("//span[text()='Card']");
	
	By Grid = By.cssSelector("div#Grid-LInk > .sc-gbl.text-size-medium");
	
	By Spreadsheet = By.xpath("//span[text()='Spreadsheet']");
	
	By Printview = By.xpath("//span[text()='Print View']");
	
	By Tasks = By.xpath("//span[text()='Tasks']");
	
	By Dynamicflowrecords = By.xpath("//span[text()='Dynamic Flow Records']");
					
	By Caserecords = By.xpath("//span[text()='Case Records']");
	
	By Validationscount = By.cssSelector("div#RecordsCount_Row1 > .text-size-medium");
	
	By validationsearchbox = By.xpath("//input[@id='selValidationName']");
	
	By groupbytypecheckbox = By.xpath("//input[@id='selShowHeader']");
	
	By JimDrevalidation = By.xpath("//*[@id='Validation_Row1']//span[text()='JimD-revalidation']");
	
	By JimDrevalidation_close = By.xpath("//span[@class='cd-panel-close']");
	
	By saveicon = By.cssSelector("div#Save > .align-self-center.fa.fa-save.mt-1.p-1.text-dark");
	
	By save = By.xpath("//span[text()='Save']");
	
	By description = By.xpath("//input[@id='txtBookmarkDescription']");
	
	public void User_click_on_Validations_under_Hamburger_icon_in_Linkpage() throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
        driver.findElement(linkhamburgericon).click();
        utilities.webDriverWait(driver, more);
        driver.findElement(more).click();
        utilities.MaximumWait(driver);
        WebElement titleX = driver.findElement(validations); 
		JavascriptExecutor executoraa = (JavascriptExecutor)driver;
		executoraa.executeScript("arguments[0].click();", titleX);
	}
	
	public void validating_DatePickers_ValidationsPage() throws Throwable {
		utilities.webDriverWait(driver, SafetyChainImage);
		driver.findElement(SafetyChainImage).click();

		driver.findElement(EightHour).click();
		utilities.webDriverWait(driver, EightHourDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(EightHourDatepicker).click();
		utilities.webDriverWait(driver, Filter_EightHourDatepicker);
		driver.findElement(Filter_EightHourDatepicker).click();

		driver.findElement(TwelveHours).click();
		utilities.webDriverWait(driver, TwelveHoursDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwelveHoursDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwelveHoursDatepicker);
		driver.findElement(Filter_TwelveHoursDatepicker).click();

		driver.findElement(OneDay).click();
		utilities.webDriverWait(driver, TwentyFourHoursDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwentyFourHoursDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwentyFourHoursDatepicker);
		driver.findElement(Filter_TwentyFourHoursDatepicker).click();

		driver.findElement(TwoDays).click();
		utilities.webDriverWait(driver, TwoDaysDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(TwoDaysDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwoDaysDatepicker);
		driver.findElement(Filter_TwoDaysDatepicker).click();

		driver.findElement(OneWeek).click();
		utilities.webDriverWait(driver, OneWeekDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneWeekDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneWeekDatepicker);
		driver.findElement(Filter_OneWeekDatepicker).click();

		driver.findElement(TwoWeeks).click();
		utilities.webDriverWait(driver, FourteenDaysDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(FourteenDaysDatepicker).click();
		utilities.webDriverWait(driver, Filter_FourteenDaysDatepicker);
		driver.findElement(Filter_FourteenDaysDatepicker).click();

		driver.findElement(OneMonth).click();
		utilities.webDriverWait(driver, OneMonthDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneMonthDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneMonthDatepicker);
		driver.findElement(Filter_OneMonthDatepicker).click();

		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(ThreeMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_ThreeMonthsDatepicker);
		driver.findElement(Filter_ThreeMonthsDatepicker).click();

		driver.findElement(SixMonths).click();
		utilities.webDriverWait(driver, SixMonthsDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(SixMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_SixMonthsDatepicker);
		driver.findElement(Filter_SixMonthsDatepicker).click();

		driver.findElement(OneYear).click();
		utilities.webDriverWait(driver, OneYearDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(OneYearDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneYearDatepicker);
		driver.findElement(Filter_OneYearDatepicker).click();
		utilities.webDriverWait(driver, Validationscount);
		driver.findElement(Validationscount).click();

	}
	
	public void validating_Filters_ValidationsPage() throws Throwable {
		
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
		utilities.webDriverWait(driver, Filter_EightHour);
		driver.findElement(Filter_EightHour).click();
		utilities.webDriverWait(driver, Filter_EightHourDatepicker);
		driver.findElement(Filter_EightHourDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwelveHours);
		driver.findElement(Filter_TwelveHours).click();
		utilities.webDriverWait(driver, Filter_TwelveHoursDatepicker);
		driver.findElement(Filter_TwelveHoursDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneDay);
		driver.findElement(Filter_OneDay).click();
		utilities.webDriverWait(driver, Filter_TwentyFourHoursDatepicker);
		driver.findElement(Filter_TwentyFourHoursDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwoDays);
		driver.findElement(Filter_TwoDays).click();
		utilities.webDriverWait(driver, Filter_TwoDaysDatepicker);
		driver.findElement(Filter_TwoDaysDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneWeek);
		driver.findElement(Filter_OneWeek).click();
		utilities.webDriverWait(driver, Filter_OneWeekDatepicker);
		driver.findElement(Filter_OneWeekDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneWeekDatepicker);
		driver.findElement(Filter_OneWeekDatepicker).click();
		utilities.webDriverWait(driver, Filter_TwoWeeks);
		driver.findElement(Filter_TwoWeeks).click();
		utilities.webDriverWait(driver, Filter_FourteenDaysDatepicker);
		driver.findElement(Filter_FourteenDaysDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneMonth);
		driver.findElement(Filter_OneMonth).click();
		utilities.webDriverWait(driver, Filter_OneMonthDatepicker);
		driver.findElement(Filter_OneMonthDatepicker).click();
		utilities.webDriverWait(driver, Filter_ThreeMonths);
		driver.findElement(Filter_ThreeMonths).click();
		utilities.webDriverWait(driver, Filter_ThreeMonthsDatepicker);
		driver.findElement(Filter_ThreeMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_SixMonths);
		driver.findElement(Filter_SixMonths).click();
		utilities.webDriverWait(driver, Filter_SixMonthsDatepicker);
		driver.findElement(Filter_SixMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_SixMonthsDatepicker);
		driver.findElement(Filter_SixMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_OneYear);
		driver.findElement(Filter_OneYear).click();
		utilities.webDriverWait(driver, Filter_OneYearDatepicker);
		driver.findElement(Filter_OneYearDatepicker).click();
		utilities.webDriverWait(driver, Filter_EightHour);
		driver.findElement(Filter_EightHour).click();
		
		utilities.webDriverWait(driver, Filter_PauseRefresh_CheckBox);
		driver.findElement(Filter_PauseRefresh_CheckBox).click();
		utilities.webDriverWait(driver, Filters_SavedFilters);
		driver.findElement(Filters_SavedFilters).click();
		utilities.webDriverWait(driver, saveicon);
		driver.findElement(saveicon).click();
		utilities.webDriverWait(driver, save);
		driver.findElement(save).click();
		driver.switchTo().alert().accept();
		utilities.webDriverWait(driver, description);
		driver.findElement(description).click();
		utilities.webDriverWait(driver, description);
		driver.findElement(description).sendKeys("sample saved filters");
		utilities.webDriverWait(driver, save);
		driver.findElement(save).click();
		utilities.webDriverWait(driver, Filters_Records);
		driver.findElement(Filters_Records).click();
		utilities.webDriverWait(driver, Filters_Pass);
		driver.findElement(Filters_Pass).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_ShowOnlyFailedRecords);
		driver.findElement(Filter_BaseFilters_ShowOnlyFailedRecords).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_Forms);
		driver.findElement(Filter_BaseFilters_Forms).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_Forms);
		driver.findElement(Filter_BaseFilters_Forms).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_Resources);
		
		driver.findElement(Filter_BaseFilters_Resources).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_BaseFilters_Resources).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_Location);
		driver.findElement(Filter_BaseFilters_Location).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_BaseFilters_Location).click();
		utilities.webDriverWait(driver, Filter_BaseFilters_User);
		driver.findElement(Filter_BaseFilters_User).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_BaseFilters_User).click();
		utilities.webDriverWait(driver, Filter_AdditionalFilters_Identifiers);
		driver.findElement(Filter_AdditionalFilters_Identifiers).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_AdditionalFilters_Identifiers).click();
		utilities.webDriverWait(driver, Filter_AdditionalFilters_Program);
		driver.findElement(Filter_AdditionalFilters_Program).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_AdditionalFilters_Program).click();
		utilities.webDriverWait(driver, Filter_AdditionalFilters_Verifications);
		driver.findElement(Filter_AdditionalFilters_Verifications).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_AdditionalFilters_Verifications).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Filter_Signed_Verified_By);
		driver.findElement(Filter_Signed_Verified_By).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_Signed_Verified_By).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch);
		driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
		utilities.webDriverWait(driver, Filter_AdditionalFilters_VoidedRecords);
		driver.findElement(Filter_AdditionalFilters_VoidedRecords).click();
		utilities.MaximumWait(driver);
		driver.findElement(Filter_AdditionalFilters_VoidedRecords).click();
		utilities.webDriverWait(driver, Filter_Apply_All);
		driver.findElement(Filter_Apply_All).click();
}
	public void validating_cardbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Card);
        driver.findElement(Card).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_gridbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Grid);
        driver.findElement(Grid).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_spreadsheetbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Spreadsheet);
        driver.findElement(Spreadsheet).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_printviewbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Printview);
        driver.findElement(Printview).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_tasksbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Tasks);
        driver.findElement(Tasks).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_dynamicflowrecordsbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Dynamicflowrecords);
        driver.findElement(Dynamicflowrecords).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_caserecordsbutton_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, Caserecords);
        driver.findElement(Caserecords).click();
        utilities.MaximumWait(driver);
	    driver.navigate().back();
}
	
	public void validating_searchbox_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, validationsearchbox);
        driver.findElement(validationsearchbox).sendKeys("JimD-revalidation");
        utilities.webDriverWait(driver, validationsearchbox);
        driver.findElement(validationsearchbox).clear();
}
	
	public void validating_groupbytype_checkbox_ValidationsPage() throws Throwable {
        utilities.webDriverWait(driver, groupbytypecheckbox);
        driver.findElement(groupbytypecheckbox).click();
        utilities.MaximumWait(driver);
        driver.findElement(groupbytypecheckbox).click();
}
	
	public void validating_JimDrevalidation_from_grid() throws Throwable {
        utilities.webDriverWait(driver, JimDrevalidation);
        driver.findElement(JimDrevalidation).click();
        utilities.MaximumWait(driver);
        driver.findElement(JimDrevalidation_close).click();
}
}




