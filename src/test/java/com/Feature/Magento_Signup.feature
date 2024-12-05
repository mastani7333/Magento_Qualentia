Feature: Magento_Signup

  Scenario: User successfully creates an account
    Given Browser is open and open the application
    And the user is on the Magento home page
    When the user clicks on the Create an Account link
    And the user redirected to create New Customer Account page
    When User enters the First and Last name
    When User enters the  valid Email, Strong Password and Confirm Password
    And clicks on the Create an Account button
    Then the user should see a success message Thank you for registering with Main Website Store.
    And the user should be redirected to the account dashboard
