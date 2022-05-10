@FeatureGroup_Requirement
Feature: feature to test Link Validations Page functionality

  @SmokeTest
  Scenario: Validate Validations Page Features
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User navigated to the home page
    And User click on Link under Hamburger icon in webpage
    Then User click on Validations under Hamburger icon in Link Page
    Then User validates DatePickers in Validations Page
    Then User validates Card button in Validations Page
    Then User validates Grid button in Validations Page
    Then User validates Spreadsheet button in Validations Page
    Then User validates Printview button in Validations Page
    Then User validates Tasks button in Validations Page
    Then User validates Dynamicflowrecords button in Validations Page
    Then User validates Search box in Validations Page
    Then User validates Group By Type check box in Validations Page
    Then User validates Filters Under Validations Page
    Then User validates JimDrevalidation from grid
    


 
