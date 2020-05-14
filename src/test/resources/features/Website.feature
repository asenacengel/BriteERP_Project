@Website

  Feature: website
    As a user I want to be able to see sales reports


    Background:
      Given User is on the landing page
      When User logs in with valid credentials

    Scenario: website function
    Then User  navigates to "Website" module
    And User verifies that "Last Week " sales are displayed:
    And User verifies that "Last Month " sales are displayed:
    And User verifies that "Last Year " sales are displayed:

    @Website_link
    Scenario: website function link
      Then User  navigates to website module
      And User  click to the "Go to Website" module
      Then User verifies following message "ERP Systems, Solutions and Services that add real value to your business."

      
      




