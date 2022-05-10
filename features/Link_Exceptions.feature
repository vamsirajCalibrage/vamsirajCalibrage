@FeatureGroup_Requirement
Feature: feature to test Link Exceptions Page functionality

  @SmokeTest
  Scenario: Validate Exceptions Page Features
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User navigated to the home page
    And User click on Link under Hamburger icon in webpage
    Then User click on Exceptions under Hamburger icon in Link Page
    Then User validates DatePickers in Exceptions Page
    Then User validates Filters Under ExceptionsPage
    Then User validates all the fields in Details Page
    Then User validates all the fields in Summary Page
    Then User validates all the fields in Corrections Page
