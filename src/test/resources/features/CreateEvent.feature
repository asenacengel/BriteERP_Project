Feature:
     As a user, I should be able to create an event

  Background:
    When User is on the landing page
    And User logs in with valid credentials
   # you can change create any event form here
   # you can enter your event name, and begin and end dates based on your plan

  @create_event
  Scenario:
    And User  navigates to "Events" module
    And User clicks create
    And enter  following info
      | Event Name | Begin date          | End date            |
      | Conference | 08/12/2020 11:58:29 | 08/13/2020 13:58:29 |
    Then create event
    Then confirm event is created


