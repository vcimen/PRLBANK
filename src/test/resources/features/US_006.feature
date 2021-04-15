@US_006
Feature: User Info Segment Functionality
  Background: Login to GMI bank
    Given login to GMI bank
    And navigate to user info
    And Send "user_username" to username blank
    And Send "user_password" to password blank
    And click to sign in button
    And click on James John User drop-down
    And click on User Info

    Scenario: TC_001

      Given verify firstname, lastname email and language

    Scenario: TC_002

      Given verify 2 languages "English and Turkish"

    Scenario: Tc_003

      Given update "first_Name"

    Scenario: Tc_004

      Given update_lastname "last_Name"

  Scenario: Tc_005

    Given update_email "email"