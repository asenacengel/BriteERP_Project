@calender
Feature:Calender Events
  As a user, I want to be able create and view calender events

  Scenario: Create Meeting
    Given User is on the landing page
    When User logs in with valid credentials
    And User navigates to "Calendar" module
    And User creates meeting at All day
    And User summary should be "Odoo Meeting"
    And User clicks on Create button
    Then Verifies the meeting topic