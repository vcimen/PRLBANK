@UserStory3

Feature: Regristration page must restrict password usage to a secure high level passcode

  Background: User goes to the GMI Bank home page (https://gmibank.com)
    Scenario: User goes
    Given User goes to the GMi Bank home page
    And Click on the user button
    And You must navigate to registration page
    And Click on the Password text box

  @UserStory003-01
  Scenario: There should be at least 1 lowercase char for stronger password and see the level chart change accordingly
    And User enters a password with 1 lowercase letter of at least 7 characters
    And User sees color line must be orange or green
    And User clicks on password confirmation text box
    Then User enters to second text box with 1 lowercase letter of at least 7 characters

  @UserStory003-02
  Scenario: There should be at least 1 uppercase char and see the level  chart change accordingly
    And User enters a password with 1 uppercase letter of at least 7 characters
    And User sees line must be orange or green
    And User clicks on password confirmation text box
    Then User enters to second text box with 1 uppercase letter of at least 7 characters

  @Userstory003-03
  Scenario: There should be at least 1 digit  and see the level  chart change accordingly
    And User enters a password with 1 digit of at least 7 characters
    And User sees line must be orange or green
    And User clicks on password confirmation text box
    Then User enters to second text box with 1 digit of at least 7 characters

  @Userstory003-04
  Scenario: There should be at least 1 special char and see the level bar change accordingly
    And User enters a password with 1 special char of at least 7 characters
    And User sees line must be orange or green
    And User clicks on password confirmation text box
    Then User enters to second text box with 1 special char of at least 7 characters

  @UserStory003-05
  Scenario: There should be at least 7 chars for a stronger password
    And User enters a password with 7 chars
    And User sees line must be orange or green
    And User clicks on password confirmation text box
    Then User enters to second text box a password with 7 chars

