Feature: User app login

  Background: user is on login page
    Given user is on login page

  @userLogin
  Scenario: Login as a student
    When user enters username
    And user enters password
    And user clicks login button
    Then user should see dashboard
