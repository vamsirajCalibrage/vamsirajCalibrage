@FeatureGroup_Requirement
Feature: feature to test Records SignOff in Link

@SmokeTest
 Scenario: Validate Records were signedoff in Link
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  And User click on SignOff under Verify of Record Page
  Then User select CheckBox Of First Record and SignOff The Record
  And User click on None under Verify of Record Page
  Then User Validate Record is Signed by Filtering the Record in Record Search
  
  @SmokeTest1
  Scenario: Validate Records in card view
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  And User click on Record Under Hamburger in Link HomePage
  Then User click on Three months under Record Page
  Then User click on click on Card view button
  And User click on expand icon in the Card
  Then User click on click on Record Id link