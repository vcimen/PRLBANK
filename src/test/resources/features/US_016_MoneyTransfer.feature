@moneyTransfer
Feature: All transactions with swift platform

  Background: User goes the sign in
    Given User on the landing page
    And User sign in as "customer"

    Scenario Outline: Money Transfer
      Given User clicks on the my operations
      And User selects money transfer
      And User User selects an "<account>"
      When User selects a "<secondAccount>" to sent to money to
      And User provides a "<balance>"
      And User provides transfer "<description>"
      Then User makes money transfer

      Examples: All data
      |account         |secondAccount | balance|description|
      |SAVING-1653-400$|CHECKING-1654-200$|100 |for rent   |






