package pages;

import org.openqa.selenium.By;
import util.DriverFactory;
import util.Utilities;

public class Link_RecordsPage extends DriverFactory{
	Utilities utilities = new Utilities();
	String RecordName = null;
	By linkhamburgericon = By.xpath("//i[@id='SidebarTogglerIcon']");
	By records = By.xpath("//div[@id='MenuWrapper']//span[text()='Records']");
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
	By Spreadsheet = By.xpath("//span[text()='Spreadsheet']");
	By Spreadsheetviewtext = By.cssSelector("[class='mt-t mb-1 mx-2'] div .sc-gbl:nth-child(7)");
	By Selectaformtoview = By.xpath("//div[text()='Select a Form to View']");
	By spreadsheetsearchbox = By.cssSelector("input#SSFormNameFilter");
	By fullbutton = By.xpath("//tr//td[@id='DataTableColumn_Row1'][@class='text-nowrap']/span/a[text()='Full']");
	By SafetyChainImage = By.xpath("//img[@src='_SupportFiles/M.Images.sc-logo-40.png']");
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
	By essentialbutton = By.xpath("//span[text()='Essential']");
	By pivotbutton = By.xpath("//span[text()='Pivot']");
	
	By advancedsettingsbutton = By.xpath("//span[text()='Advanced Settings']");
			
    By verificationsbutton = By.xpath("//span[text()='Verifications']");
    
    By imagesbutton = By.xpath("//span[text()='Images']");
    
    By minmaxbutton = By.xpath("//span[text()='Min/Max']");
    		
    By fulltextbutton = By.xpath("//span[text()='Full Text']");
    
    By freezecheckbox = By.xpath("//span[text()='Full Text']");
    
    By helpbutton = By.xpath("//span[text()='Help']");
			
	
	public void clickRecordUnderHamburger()throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(records).click();
		utilities.MediumWait(driver);
	}
	
	public void validating_DatePickers_SpreadsheetviewPage() throws Throwable {
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
		
		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		utilities.MaximumWait(driver);
		driver.findElement(ThreeMonthsDatepicker).click();
		utilities.webDriverWait(driver, Filter_ThreeMonthsDatepicker);
		driver.findElement(Filter_ThreeMonthsDatepicker).click();
	}
	
	public void User_validates_Spreadsheetviewpage() throws Throwable {
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Spreadsheet);
		driver.findElement(Spreadsheet).click();		
	}
	
	public void validating_searchbox_SpreadsheetviewPage() throws Throwable {
		utilities.webDriverWait(driver, Spreadsheetviewtext);
		driver.findElement(Spreadsheetviewtext).click();
		utilities.MaximumWait(driver);
		driver.findElement(Selectaformtoview).click();
		utilities.MaximumWait(driver);
		driver.findElement(Selectaformtoview).click();
       /* utilities.webDriverWait(driver, spreadsheetsearchbox);
        driver.findElement(spreadsheetsearchbox).sendKeys("OEE Events");
    	utilities.MaximumWait(driver);
        utilities.webDriverWait(driver, spreadsheetsearchbox);
        driver.findElement(spreadsheetsearchbox).clear();*/
        utilities.webDriverWait(driver, fullbutton);
		driver.findElement(fullbutton).click();
		utilities.webDriverWait(driver, advancedsettingsbutton);
			driver.findElement(advancedsettingsbutton).click();
			 utilities.webDriverWait(driver, advancedsettingsbutton);
				driver.findElement(advancedsettingsbutton).click();
				utilities.webDriverWait(driver, verificationsbutton);
				driver.findElement(verificationsbutton).click();
				utilities.webDriverWait(driver, verificationsbutton);
				driver.findElement(verificationsbutton).click();
				utilities.webDriverWait(driver, imagesbutton);
				driver.findElement(imagesbutton).click();
				utilities.webDriverWait(driver, imagesbutton);
				driver.findElement(imagesbutton).click();
				utilities.webDriverWait(driver, minmaxbutton);
				driver.findElement(minmaxbutton).click();
				utilities.webDriverWait(driver, minmaxbutton);
				driver.findElement(minmaxbutton).click();
				utilities.webDriverWait(driver, fulltextbutton);
				driver.findElement(fulltextbutton).click();
				utilities.webDriverWait(driver, fulltextbutton);
				driver.findElement(fulltextbutton).click();
				utilities.webDriverWait(driver, freezecheckbox);
				driver.findElement(freezecheckbox).click();
				utilities.webDriverWait(driver, freezecheckbox);
				driver.findElement(freezecheckbox).click();
				utilities.webDriverWait(driver, helpbutton);
				driver.findElement(helpbutton).click();
				utilities.webDriverWait(driver, helpbutton);
				driver.findElement(helpbutton).click();
		
		utilities.webDriverWait(driver, essentialbutton);
		driver.findElement(essentialbutton).click();
		utilities.webDriverWait(driver, pivotbutton);
		driver.findElement(pivotbutton).click();
		
}
	
}
	
