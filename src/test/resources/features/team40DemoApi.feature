@team40demoapi
  Feature: System should allow to read customers ssn to verify by api end point

    Scenario: Read customer's ssn
      Given User sets a response using api endpoint "https://gmibank-qa-environment.com/api/tp-customers?size=3000"
      And User deserializers ssn data as json to java
      Then User validates the ssn data