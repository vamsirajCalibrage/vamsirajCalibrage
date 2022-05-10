package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class Link_RecordsPage extends DriverFactory{
	Utilities utilities = new Utilities();
	String RecordName = null;
	By linkhamburgericon = By.xpath("//i[@id='SidebarTogglerIcon']");
	By records = By.xpath("//div[@id='MenuWrapper']//span[text()='Records']");
	By SearchLocationsEditField = By.xpath("//input[@class='form-control sc-gbl']");
	By ThreeMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'3M')]");
	By ThreeMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By Record_Verify = By.xpath("//a[text()='Verify']");
	By Record_Verify_SignOff = By.xpath("//a[text()='Signoff']");
	By Record_Verify_None = By.xpath("//ol[@id='verify']//a[text()='None']");
	By Record_SignOff_FirstRecord = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[1]");
	By Record_SignOff_RecordName = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[3]//a/span");
	By Record_Sign = By.xpath("//div[@id='BottomBar']/span[@id='btnSign']");
	By Record_SignOffPopup_Comment = By.xpath("//span[@id='HIdMoreCSS']/../following-sibling::div[@id='PopVerify_rdModalShade']/following-sibling::div[@id='PopVerify']//textarea[@id='selVerifyComment']");
	By Record_SignOffPopup_Sign = By.xpath("//span[@id='HIdMoreCSS']/../following-sibling::div[@id='PopVerify_rdModalShade']/following-sibling::div[@id='PopVerify']//span[text()='SIGN']");
	By Filters = By.xpath("//span[text()='Filters']");
	By Filter_AdditionalFilters_RecordSearch = By.xpath("//div[@id='xFilterList2xx']//span[text()='Record Search']");
	By Filter_AdditionalFilters_RecordSearch_RecordName_EditField = By.xpath("//input[@id='RecordNameFilter']");
	By Filter_ApplyAll = By.xpath("//span[text()='Apply All']");
	By Record_Signed_Validation = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[11]//i[@class='fa fa-check text-deeporange-500']");
	By Record_Signed_VerificationsAndSignOffs = By.xpath("//span[text()='Verifications and Sign Offs']/../following-sibling::span//span[text()='Signoff']/../following::div//span[text()=' : Entered Comments through Automation Script']");
	By Card = By.xpath("//div[@id='Card']");
	
	
	public void clickRecordUnderHamburger()throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(records).click();
		utilities.MediumWait(driver);
	}
	
	public void clickonThreeMonths()throws Throwable {
		utilities.webDriverWait(driver, ThreeMonths);
		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		driver.findElement(ThreeMonthsDatepicker).click();
		utilities.MinimumWait(driver);
		driver.findElement(ThreeMonthsDatepicker).click();
	}
	
	public void clickOnSignOffUnderVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_Verify);
		driver.findElement(Record_Verify).click();
		utilities.webDriverWait(driver, Record_Verify_SignOff);
		driver.findElement(Record_Verify_SignOff).click();
		utilities.MediumWait(driver);
	}
	
	public void CheckTheCheckBoxOfFirstRecordForSignOffandClickOnVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_SignOff_FirstRecord);
		RecordName = driver.findElement(Record_SignOff_RecordName).getText();
		driver.findElement(Record_SignOff_FirstRecord).click();
		for(int i=0;i<7;i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			utilities.MediumWait(driver);
		}
		
		utilities.webDriverWait(driver, Record_Sign);
		driver.findElement(Record_Sign).click();
		utilities.webDriverWait(driver, Record_SignOffPopup_Comment);
		driver.findElement(Record_SignOffPopup_Comment).sendKeys("Entered Comments through Automation Script");
		utilities.webDriverWait(driver, Record_SignOffPopup_Sign);
		driver.findElement(Record_SignOffPopup_Sign).click();
		utilities.MediumWait(driver);
	}
	
	public void ClickOnNoneUnderVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_Verify);
		utilities.MaximumLongWait(driver);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(Record_Verify);
		action.moveToElement(element).click().perform();
		utilities.webDriverWait(driver, Record_Verify_None);
		driver.findElement(Record_Verify_None).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Verify);
	}
	
	public void FilterRecord()throws Throwable {
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
		utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch);
		driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch_RecordName_EditField);
		driver.findElement(Filter_AdditionalFilters_RecordSearch_RecordName_EditField).sendKeys(RecordName);
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, By.xpath("//a[text()='"+RecordName+"']"));
		driver.findElement(By.xpath("//a[text()='"+RecordName+"']")).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Filter_ApplyAll);
		driver.findElement(Filter_ApplyAll).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Signed_Validation);
		driver.findElement(Record_Signed_Validation).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Signed_VerificationsAndSignOffs);
		driver.findElement(Record_Signed_VerificationsAndSignOffs).click();
	}
	
	public void User_validates_Cardview_button() throws Throwable {
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Card);
		driver.findElement(Card).click();
		
	}
	}
	
