@maria
Feature: As a user, I should be able to access to Talks module

  Scenario: verify users to access to Talks module

    Given user on the dashboard page
    When the user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"


   Scenario: verify users to send a message
    Given user on the dashboard page
    When the user clicks the "Talk" module
    And user search user from the search box
    And user write a message
    And user clicks to submit button
    Then the user should be able to see the message is displayed on the conversation log