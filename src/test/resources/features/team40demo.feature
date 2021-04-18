@demo
  Feature: Team40 Demo
    Scenario Outline: Money transfer process
      Given User goes to landing page
      And User navigates to registration page
      And User enters required data for registration
      Then User navigates to main page
      Then Admin clicks sign in button
      And Admin logs in to admin account "<adminUsername>" and "<adminPassword>"
      Then Admin activates the user account
      And Admin logs out from admin account
      Then Employee logs in to employee account "<employeeUsername>" and "<employeePassword>"
      And Employee integrates accounts for the user
      Then Employee logs out from account
      Then User logs in to user account
      And User navigates to My Operations
      Then User makes money transfer between accounts
      And User verifies their money transfer


      Examples:
      |adminUsername|adminPassword|employeeUsername|employeePassword|
      |admin40      |Admin40$     |employee40      | Employee40$    |
