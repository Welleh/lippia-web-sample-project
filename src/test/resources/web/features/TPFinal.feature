
Feature: Clockify Time Tracker

  @Login @TPFinal
  Background:
    Given I navigate to the Clockify login page
    And I enter the username e01725856@gmail.com and password 1234asdf4321
    And I click on the login button

  Scenario: Verify main page is displayed
    Then I see the main page

  @Register
  Scenario: Register worked hours
    When I register 10 seconds worked
    Then I should see the time entry

  Scenario: Cancel time entry
    When I enter the date 2024 06 10 and time 08:00 worked
    And I cancel the time entry
    Then I should not see the entry with date 2024-06-10 and time 08:00 in the list

  Scenario: Modify an existing time entry
    When I have an existing time entry with date 2024-06-10 and time 08:00
    And I modify the time entry to date 2024-06-11 and time 09:00
    And I save the modification
    Then I should see the modified entry with date 2024-06-11 and time 09:00 in the list
