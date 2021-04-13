@moneyTransfer
Feature: All transactions with swift platform

  Background: User goes the sign in
    Given User on the landing page
    And User sigs in as "customer"

    Scenario Outline: Money Transfer
      Given User clicks on the my operations
      And User slects money transfer
      And User User slects an "<account>"
      When User slects a "<secondAccount>" to sent to money to
      And User provides a "<balance>"
      And User provides transfer "<description>"
      Then User makes mone tranfer

      Examples: All data
      |account         |secondAccount | balance|description|
      |SAVING-1653-400$|CHECKING-1654-200$|100 |for rent   |






