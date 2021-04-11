@US_004loginValid
Feature: Login page

@US_004-01
Scenario:US_004 TC_01 User should be able to login with the valid credentials
Given User goes to  "https://gmibank-qa-environment.com/"
And User clicks on account menu
And User clicks on sign in
And User enters a valid username to usernamebox
And User enters a valid password  to passwordbox
And User clicks on Sign in button
Then User verifies if the user sign in

@US_004-02
Scenario:US_004 TC_02 User should be able to cancel to login button
Given User goes to  "https://gmibank-qa-environment.com/"
And User clicks on account menu
And User clicks on sign in
And User clicks on cancel button
Then User verifies if the user cancel