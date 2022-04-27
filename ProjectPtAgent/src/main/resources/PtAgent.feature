@PT
Feature: Feature to Automate PowerTerm
  // Sample Format
  // May be changed based on the Scenario'sS
  @PT1
  Scenario: Open PtAgent Application
    Given user launch's Application
    When user enters UserID and Password
    Then user is navigated to Workspace


  @PT2
  Scenario: Close the Connect
    Given user closes the connect Window
    And user is navigated to working Space
    Then user closes the Application