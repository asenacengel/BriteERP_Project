@login
Feature: Login
  As user, I want to be able to login with username and password

  Scenario: Login Function
    When User is on the landing page
    And User logs in with valid credentials
    Then verifies the username