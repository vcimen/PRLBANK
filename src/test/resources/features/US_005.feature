@US_005
Feature: Login page should not be accessible with invalid credentials
  Background: User goes the sign in
    Given User on the landing Page
    Then User click on the Sign in button

  Scenario Outline: Invalid Login TC1, TC2, TC3

    And User enters UserName "<username>"
    And User enters Password "<password>"
    And click sign in
    Then User gets Error Messages "<ErrorMessage>"

    Examples: All data
      |username  |password  |ErrorMessage       |
      |customer40|123Abcxyz |Failed to sign in! |
      |customer4 |123Abcxyz$|Failed to sign in! |
      |customer4 |123Abcxyz |Failed to sign in! |

    Scenario: Reset Password TC4
      Given User enter userName"<userName>"
      And User enters Password"<Password>"
      And Click forget password
      Then Verify reset password page
